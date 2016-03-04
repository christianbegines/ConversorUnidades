/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversorunidades;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Conversor extends JFrame {

    private Container panelUnidadIni, panelEscalado, panelResultado;
    private JButton Km, Hm, Dm, dm, cm, mm;
    private JTextField unidad, resultado;
    private JLabel u,r;

    public Conversor() {
        super("Conversor");
        setSize(600, 300);
        this.setLayout(new GridLayout(3, 1));
        this.panelUnidadIni = new JPanel();
        this.panelEscalado = new JPanel();
        this.panelResultado = new JPanel();
        
        this.panelUnidadIni.setLayout(new FlowLayout(FlowLayout.CENTER));   
        this.panelEscalado.setLayout(new FlowLayout(FlowLayout.LEFT,30,20));
        this.panelResultado.setLayout(new FlowLayout(FlowLayout.CENTER));
        

        this.add(panelUnidadIni);
        this.add(panelEscalado);
        this.add(panelResultado);

        this.Km = new JButton("KM");
        this.Hm = new JButton("HM");
        this.Dm = new JButton("DM");
        this.dm = new JButton("dm");
        this.cm = new JButton("cm");
        this.mm = new JButton("mm");

        this.unidad = new JTextField(7);
        this.resultado = new JTextField(7);
        
        this.u=new JLabel("Unidad Inicial");
        this.r=new JLabel("Resultado");
        r.setEnabled(false);
        
        Km.addActionListener(new Convertidor());
        Hm.addActionListener(new Convertidor());
        Dm.addActionListener(new Convertidor());
        dm.addActionListener(new Convertidor());
        cm.addActionListener(new Convertidor());
        mm.addActionListener(new Convertidor());      
        Km.setActionCommand("km");
        Hm.setActionCommand("hm");
        Dm.setActionCommand("Dm");
        dm.setActionCommand("dm");
        cm.setActionCommand("cm");
        mm.setActionCommand("mm");
        
        this.panelUnidadIni.add(u);
        this.panelUnidadIni.add(unidad);
        this.panelEscalado.add(Km);
        this.panelEscalado.add(Hm);
        this.panelEscalado.add(Dm);
        this.panelEscalado.add(dm);
        this.panelEscalado.add(cm);
        this.panelEscalado.add(mm);
        this.panelResultado.add(r);
        this.panelResultado.add(resultado);
        
        setVisible(true);
        
        

    }
    class Convertidor implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            Float f = new Float(unidad.getText());
            float valor = f.floatValue();
            String s=(String) e.getActionCommand();
            
            if(s.equals("km")){
                valor=f/1000;
            }
            if(s.equals("hm")){
                valor=f/100;
            }
            if(s.equals("Dm")){
                valor=f/10;
            }
            if(s.equals("dm")){
                valor=f*10;
            }
            if(s.equals("cm")){
                valor=f*100;
            }
            if(s.equals("mm")){
                valor=f*1000;
            }            
            resultado.setEnabled(true);
            resultado.setText(Float.toString(valor));
            
            
            
            
        }
        
    }
}
