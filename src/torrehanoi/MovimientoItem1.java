// Boton 1 de Potenciador y Debilitador
package torrehanoi;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class MovimientoItem1 extends Thread {
    public JButton item1 = new JButton ();
    public JPanel formAgregar;
    public boolean potenciador = true;
    public int x, y, velocidadY;

    public MovimientoItem1(JPanel formAgregar, int x, int y) {
        super();
        this.formAgregar = formAgregar;
        this.x = x;
        this.y = y;
        this.velocidadY = 6;
        
        item1.setBounds(x, y, 64, 64);
        item1.setBackground(Color.green);
        item1.setIcon(new ImageIcon(getClass().getResource("/imagenes/reloj.png")));
        
        item1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (potenciador){
                    if (Integer.valueOf(TorreHanoi.config.segConfig) > (TorreHanoi.juego.segundos + 10)){
                        TorreHanoi.juego.segundos = TorreHanoi.juego.segundos + 10;
                        TorreHanoi.juego.labelTiempo.setText(String.valueOf(TorreHanoi.juego.segundos));
                    }
                } else {
                    if (TorreHanoi.juego.segundos > 10){
                        TorreHanoi.juego.segundos = TorreHanoi.juego.segundos - 10;
                        TorreHanoi.juego.labelTiempo.setText(String.valueOf(TorreHanoi.juego.segundos));
                    } else {
                        TorreHanoi.juego.segundos = 0;
                        TorreHanoi.juego.labelTiempo.setText(String.valueOf(TorreHanoi.juego.segundos));
                    }
                }
            }
        });
        
        formAgregar.add(item1);
        formAgregar.repaint();
    }
    
    public void run (){
        
        int contador = 0;
        
        while (true){
            try {
                //Tiempo que no esta activo el hilo
                sleep (50);
                contador += 50;
                
                this.y += this.velocidadY;
                
                if (this.y >= 450){
                    this.y = 100;
                }
                
                ActualizarPosicion();
                formAgregar.repaint();
                
                if (contador >= 500){
                    contador = 0;
                } else {
                    continue;
                }
                
                if (this.potenciador){
                   item1.setBackground(Color.red);
                   this.potenciador = false;
                } else {
                   item1.setBackground(Color.green);
                   this.potenciador = true;
                }
                
                formAgregar.repaint();
                
                
            } catch (Exception e) {
            }
        }
        
    }
    
    public void ActualizarPosicion () {
        this.item1.setLocation(this.x, this.y);
    }
    
}
