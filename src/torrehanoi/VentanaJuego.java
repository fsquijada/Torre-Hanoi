//Ventana de Nuevo Juego
package torrehanoi;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.Timer;


public class VentanaJuego extends javax.swing.JFrame {
    int movimientos = 0; //Movimientos que realiza el jugador
    int segundos = 0; //Es el que estará cambiando durante el juego
    Timer reloj; //Lleva los segundos del tiempo
    MovimientoItem1 movItem1; //Potenciador/Debilitador 1
    MovimientoItem2 movItem2; //Potenciador/Debilitador 2
    int columnaDesde = 0, columnaHasta = 0, filaDesde = 0, filaHasta = 0, bloqueSup1 = 0, bloqueSup2 = 0; //Variables para el movimiento de la matriz de juego
    int x, y; //Para modificar la posicion del bloque
    
    public VentanaJuego() {
        initComponents();
        this.setLocationRelativeTo(this);
        
        reloj = new Timer(1000, contador);
        movItem1 = new MovimientoItem1(jPanel1, 50, 100);
        movItem2 = new MovimientoItem2(jPanel1, 50, 250);
        movItem1.start();
        movItem2.start();
                
        this.jPanel1.repaint();
        this.setVisible(false);
    }
    
    public void Bloques (){ //Procedimiento para colocar al inicio los bloques en la torre inicial y esconder las demás
        if (Integer.parseInt(TorreHanoi.config.discos) == 3){
            labelBloque1.setVisible(true);
            labelBloque2.setVisible(true);
            labelBloque3.setVisible(true);
            labelBloque4.setVisible(false);
            labelBloque5.setVisible(false);
            labelBloque6.setVisible(false);
            labelBloque7.setVisible(false);
            labeltexto1.setVisible(true);
            labeltexto2.setVisible(true);
            labeltexto3.setVisible(true);
            labeltexto4.setVisible(false);
            labeltexto5.setVisible(false);
            labeltexto6.setVisible(false);
            labeltexto7.setVisible(false);
            labelBloque1.setBounds(268, 340, 54, 30);
            labelBloque2.setBounds(260, 370, 70, 30);
            labelBloque3.setBounds(252, 400, 86, 30);
            labeltexto1.setBounds(268, 340, 54, 30);
            labeltexto2.setBounds(260, 370, 70, 30);
            labeltexto3.setBounds(252, 400, 86, 30);
        } else {
            if (Integer.parseInt(TorreHanoi.config.discos) == 4){
                labelBloque1.setVisible(true);
                labelBloque2.setVisible(true);
                labelBloque3.setVisible(true);
                labelBloque4.setVisible(true);
                labelBloque5.setVisible(false);
                labelBloque6.setVisible(false);
                labelBloque7.setVisible(false);
                labeltexto1.setVisible(true);
                labeltexto2.setVisible(true);
                labeltexto3.setVisible(true);
                labeltexto4.setVisible(true);
                labeltexto5.setVisible(false);
                labeltexto6.setVisible(false);
                labeltexto7.setVisible(false);
                labelBloque1.setBounds(268, 310, 54, 30);
                labelBloque2.setBounds(260, 340, 70, 30);
                labelBloque3.setBounds(252, 370, 86, 30);
                labelBloque4.setBounds(244, 400, 102, 30);
                labeltexto1.setBounds(268, 310, 54, 30);
                labeltexto2.setBounds(260, 340, 70, 30);
                labeltexto3.setBounds(252, 370, 86, 30);
                labeltexto4.setBounds(244, 400, 102, 30);
                this.repaint();
            } else {
                if (Integer.parseInt(TorreHanoi.config.discos) == 5){
                    labelBloque1.setVisible(true);
                    labelBloque2.setVisible(true);
                    labelBloque3.setVisible(true);
                    labelBloque4.setVisible(true);
                    labelBloque5.setVisible(true);
                    labelBloque6.setVisible(false);
                    labelBloque7.setVisible(false);
                    labeltexto1.setVisible(true);
                    labeltexto2.setVisible(true);
                    labeltexto3.setVisible(true);
                    labeltexto4.setVisible(true);
                    labeltexto5.setVisible(true);
                    labeltexto6.setVisible(false);
                    labeltexto7.setVisible(false);
                    labelBloque1.setBounds(268, 280, 54, 30);
                    labelBloque2.setBounds(260, 310, 70, 30);
                    labelBloque3.setBounds(252, 340, 86, 30);
                    labelBloque4.setBounds(244, 370, 102, 30);
                    labelBloque5.setBounds(236, 400, 118, 30);
                    labeltexto1.setBounds(268, 280, 54, 30);
                    labeltexto2.setBounds(260, 310, 70, 30);
                    labeltexto3.setBounds(252, 340, 86, 30);
                    labeltexto4.setBounds(244, 370, 102, 30);
                    labeltexto5.setBounds(236, 400, 118, 30);
                    this.repaint();
                } else {
                    if (Integer.parseInt(TorreHanoi.config.discos) == 6){
                        labelBloque1.setVisible(true);
                        labelBloque2.setVisible(true);
                        labelBloque3.setVisible(true);
                        labelBloque4.setVisible(true);
                        labelBloque5.setVisible(true);
                        labelBloque6.setVisible(true);
                        labelBloque7.setVisible(false);
                        labeltexto1.setVisible(true);
                        labeltexto2.setVisible(true);
                        labeltexto3.setVisible(true);
                        labeltexto4.setVisible(true);
                        labeltexto5.setVisible(true);
                        labeltexto6.setVisible(true);
                        labeltexto7.setVisible(false);
                        labelBloque1.setBounds(268, 250, 54, 30);
                        labelBloque2.setBounds(260, 280, 70, 30);
                        labelBloque3.setBounds(252, 310, 86, 30);
                        labelBloque4.setBounds(244, 340, 102, 30);
                        labelBloque5.setBounds(236, 370, 118, 30);
                        labelBloque6.setBounds(228, 400, 134, 30);
                        labeltexto1.setBounds(268, 250, 54, 30);
                        labeltexto2.setBounds(260, 280, 70, 30);
                        labeltexto3.setBounds(252, 310, 86, 30);
                        labeltexto4.setBounds(244, 340, 102, 30);
                        labeltexto5.setBounds(236, 370, 118, 30);
                        labeltexto6.setBounds(228, 400, 134, 30);
                        this.repaint();
                    } else {
                        if (Integer.parseInt(TorreHanoi.config.discos) == 7){
                            labelBloque1.setVisible(true);
                            labelBloque2.setVisible(true);
                            labelBloque3.setVisible(true);
                            labelBloque4.setVisible(true);
                            labelBloque5.setVisible(true);
                            labelBloque6.setVisible(true);
                            labelBloque7.setVisible(true);
                            labeltexto1.setVisible(true);
                            labeltexto2.setVisible(true);
                            labeltexto3.setVisible(true);
                            labeltexto4.setVisible(true);
                            labeltexto5.setVisible(true);
                            labeltexto6.setVisible(true);
                            labeltexto7.setVisible(true);
                            labelBloque1.setBounds(268, 220, 54, 30);
                            labelBloque2.setBounds(260, 250, 70, 30);
                            labelBloque3.setBounds(252, 280, 86, 30);
                            labelBloque4.setBounds(244, 310, 102, 30);
                            labelBloque5.setBounds(236, 340, 118, 30);
                            labelBloque6.setBounds(228, 370, 134, 30);
                            labelBloque7.setBounds(220, 400, 150, 30);
                            labeltexto1.setBounds(268, 220, 54, 30);
                            labeltexto2.setBounds(260, 250, 70, 30);
                            labeltexto3.setBounds(252, 280, 86, 30);
                            labeltexto4.setBounds(244, 310, 102, 30);
                            labeltexto5.setBounds(236, 340, 118, 30);
                            labeltexto6.setBounds(228, 370, 134, 30);
                            labeltexto7.setBounds(220, 400, 150, 30);
                            this.repaint();
                        }
                    }
                }
            }
        }
        this.repaint();
    }
    
    ActionListener contador = new ActionListener() { //Se van disminuyendo los segundos segun el tiempo que vaya pasando
        @Override
        public void actionPerformed(ActionEvent e) {
            if (segundos > 0){
                segundos --;
            }
            //Para colocar el tiempo en el label que está cambiando
            setTiempo();
        }
    };
    
    public void setTiempo (){
        String strSegundos = (this.segundos > 0 ? "" : "") + this.segundos;
        
        this.labelTiempo.setText(strSegundos);
        
        if (segundos <= 10){
            this.labelTiempo.setForeground(Color.red);
        } else {
            this.labelTiempo.setForeground(Color.black);
        }
        
        if (segundos <= 0){
            reloj.stop();
            this.labelTiempo.setForeground(Color.black);
            this.setVisible(false);
            TorreHanoi.menu.setVisible(true);
            JOptionPane.showMessageDialog(TorreHanoi.menu, "Se terminó el tiempo. ¡Inténtalo de nuevo!");
        }
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelTiempo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        labelMovimientos = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        labeltexto1 = new javax.swing.JLabel();
        labeltexto2 = new javax.swing.JLabel();
        labeltexto3 = new javax.swing.JLabel();
        labeltexto4 = new javax.swing.JLabel();
        labeltexto5 = new javax.swing.JLabel();
        labeltexto6 = new javax.swing.JLabel();
        labeltexto7 = new javax.swing.JLabel();
        labelBloque7 = new javax.swing.JLabel();
        labelBloque6 = new javax.swing.JLabel();
        labelBloque5 = new javax.swing.JLabel();
        labelBloque4 = new javax.swing.JLabel();
        labelBloque3 = new javax.swing.JLabel();
        labelBloque2 = new javax.swing.JLabel();
        labelBloque1 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Torres de Hanoi");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 600));
        jPanel1.setLayout(null);

        labelTiempo.setFont(new java.awt.Font("Liberation Serif", 1, 36)); // NOI18N
        labelTiempo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTiempo.setText("120");
        jPanel1.add(labelTiempo);
        labelTiempo.setBounds(310, 120, 180, 42);

        jLabel2.setFont(new java.awt.Font("Liberation Serif", 3, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Tiempo");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(310, 70, 190, 42);

        jLabel3.setFont(new java.awt.Font("Liberation Serif", 3, 36)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Movimientos");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(530, 70, 250, 42);

        labelMovimientos.setFont(new java.awt.Font("Liberation Serif", 1, 36)); // NOI18N
        labelMovimientos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMovimientos.setText("0");
        jPanel1.add(labelMovimientos);
        labelMovimientos.setBounds(602, 118, 130, 42);

        jButton1.setBackground(new java.awt.Color(255, 51, 51));
        jButton1.setFont(new java.awt.Font("Comfortaa", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Salir");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(835, 37, 63, 37);

        jButton2.setBackground(new java.awt.Color(0, 153, 153));
        jButton2.setFont(new java.awt.Font("Liberation Serif", 1, 18)); // NOI18N
        jButton2.setText("2");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(219, 467, 60, 40);

        jButton3.setBackground(new java.awt.Color(255, 102, 102));
        jButton3.setFont(new java.awt.Font("Liberation Serif", 1, 18)); // NOI18N
        jButton3.setText("3");
        jButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(309, 467, 60, 40);

        jButton4.setBackground(new java.awt.Color(255, 255, 51));
        jButton4.setFont(new java.awt.Font("Liberation Serif", 1, 18)); // NOI18N
        jButton4.setText("1");
        jButton4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(476, 467, 60, 40);

        jButton5.setBackground(new java.awt.Color(255, 102, 102));
        jButton5.setFont(new java.awt.Font("Liberation Serif", 1, 18)); // NOI18N
        jButton5.setText("3");
        jButton5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(566, 467, 60, 40);

        jButton6.setBackground(new java.awt.Color(255, 255, 51));
        jButton6.setFont(new java.awt.Font("Liberation Serif", 1, 18)); // NOI18N
        jButton6.setText("1");
        jButton6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);
        jButton6.setBounds(726, 467, 60, 40);

        jButton7.setBackground(new java.awt.Color(0, 153, 153));
        jButton7.setFont(new java.awt.Font("Liberation Serif", 1, 18)); // NOI18N
        jButton7.setText("2");
        jButton7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7);
        jButton7.setBounds(816, 468, 60, 39);

        jButton8.setBackground(new java.awt.Color(255, 255, 102));
        jButton8.setText("TORRE 1");
        jButton8.setEnabled(false);
        jPanel1.add(jButton8);
        jButton8.setBounds(189, 429, 210, 20);

        jButton9.setBackground(new java.awt.Color(0, 153, 153));
        jButton9.setText("TORRE 2");
        jButton9.setEnabled(false);
        jPanel1.add(jButton9);
        jButton9.setBounds(456, 429, 200, 20);

        jButton10.setBackground(new java.awt.Color(255, 102, 102));
        jButton10.setFont(new java.awt.Font("Daniel", 1, 12)); // NOI18N
        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setText("TORRE 3");
        jButton10.setToolTipText("");
        jButton10.setEnabled(false);
        jPanel1.add(jButton10);
        jButton10.setBounds(706, 429, 190, 20);

        labeltexto1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labeltexto1.setForeground(new java.awt.Color(255, 255, 255));
        labeltexto1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labeltexto1.setText("1");
        jPanel1.add(labeltexto1);
        labeltexto1.setBounds(890, 100, 40, 40);

        labeltexto2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labeltexto2.setForeground(new java.awt.Color(255, 255, 255));
        labeltexto2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labeltexto2.setText("2");
        jPanel1.add(labeltexto2);
        labeltexto2.setBounds(920, 140, 13, 22);

        labeltexto3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labeltexto3.setForeground(new java.awt.Color(255, 255, 255));
        labeltexto3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labeltexto3.setText("3");
        jPanel1.add(labeltexto3);
        labeltexto3.setBounds(920, 170, 13, 22);

        labeltexto4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labeltexto4.setForeground(new java.awt.Color(255, 255, 255));
        labeltexto4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labeltexto4.setText("4");
        jPanel1.add(labeltexto4);
        labeltexto4.setBounds(920, 220, 13, 22);

        labeltexto5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labeltexto5.setForeground(new java.awt.Color(255, 255, 255));
        labeltexto5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labeltexto5.setText("5");
        jPanel1.add(labeltexto5);
        labeltexto5.setBounds(930, 260, 13, 22);

        labeltexto6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labeltexto6.setForeground(new java.awt.Color(255, 255, 255));
        labeltexto6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labeltexto6.setText("6");
        jPanel1.add(labeltexto6);
        labeltexto6.setBounds(930, 290, 13, 22);

        labeltexto7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labeltexto7.setForeground(new java.awt.Color(255, 255, 255));
        labeltexto7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labeltexto7.setText("7");
        jPanel1.add(labeltexto7);
        labeltexto7.setBounds(930, 340, 13, 22);

        labelBloque7.setFont(new java.awt.Font("P052", 1, 14)); // NOI18N
        labelBloque7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelBloque7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/color7.png"))); // NOI18N
        labelBloque7.setText("7");
        labelBloque7.setToolTipText("7");
        labelBloque7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(labelBloque7);
        labelBloque7.setBounds(220, 392, 135, 40);

        labelBloque6.setFont(new java.awt.Font("P052", 1, 14)); // NOI18N
        labelBloque6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelBloque6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/color6.png"))); // NOI18N
        labelBloque6.setText("6");
        labelBloque6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(labelBloque6);
        labelBloque6.setBounds(220, 350, 120, 40);

        labelBloque5.setFont(new java.awt.Font("P052", 1, 14)); // NOI18N
        labelBloque5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelBloque5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/color5.png"))); // NOI18N
        labelBloque5.setText("5");
        labelBloque5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(labelBloque5);
        labelBloque5.setBounds(220, 309, 105, 40);

        labelBloque4.setFont(new java.awt.Font("P052", 1, 14)); // NOI18N
        labelBloque4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelBloque4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/color4.png"))); // NOI18N
        labelBloque4.setText("4");
        labelBloque4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(labelBloque4);
        labelBloque4.setBounds(220, 266, 90, 40);

        labelBloque3.setFont(new java.awt.Font("P052", 1, 14)); // NOI18N
        labelBloque3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelBloque3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/color3.png"))); // NOI18N
        labelBloque3.setText("3");
        labelBloque3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(labelBloque3);
        labelBloque3.setBounds(220, 229, 75, 40);

        labelBloque2.setFont(new java.awt.Font("P052", 1, 14)); // NOI18N
        labelBloque2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelBloque2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/color2.png"))); // NOI18N
        labelBloque2.setText("2");
        labelBloque2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(labelBloque2);
        labelBloque2.setBounds(220, 203, 60, 30);

        labelBloque1.setFont(new java.awt.Font("P052", 1, 14)); // NOI18N
        labelBloque1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelBloque1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/color1.png"))); // NOI18N
        labelBloque1.setText("1");
        labelBloque1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(labelBloque1);
        labelBloque1.setBounds(220, 170, 45, 30);

        jButton11.setBackground(new java.awt.Color(255, 255, 102));
        jButton11.setEnabled(false);
        jPanel1.add(jButton11);
        jButton11.setBounds(276, 200, 34, 230);

        jButton12.setBackground(new java.awt.Color(0, 153, 153));
        jButton12.setEnabled(false);
        jPanel1.add(jButton12);
        jButton12.setBounds(540, 200, 30, 230);

        jButton13.setBackground(new java.awt.Color(255, 102, 102));
        jButton13.setEnabled(false);
        jPanel1.add(jButton13);
        jButton13.setBounds(790, 200, 30, 230);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void MovimientoBloques (){ //Procedimiento para ir trasladando los bloques
        //Poner el valor de x, dependiendo de la columna a la que va
        if (columnaHasta == 0){
            x = 220;
        } else {
            if (columnaHasta == 1){
                x = 480;
            } else {
                x = 730;
            }
        }
        //Poner el valor de y, dependiendo de la fila a la que va
        if (filaHasta == 0){
            y = 220;
        } else {
            if (filaHasta == 1){
                y = 250;
            } else {
                if (filaHasta == 2){
                    y = 280;
                } else {
                    if (filaHasta == 3){
                        y = 310;
                    } else {
                        if (filaHasta == 4){
                            y = 340;
                        } else {
                            if (filaHasta == 5){
                                y = 370;
                            } else {
                                y = 400;
                            }
                        }
                    }
                }
            }
        }
        //Movimiento según el bloque que se vaya a movilizar    
        if (bloqueSup1 == 1){
            labelBloque1.setBounds((x+48), y, 54, 30);
            labeltexto1.setBounds((x+48), y, 54, 30);
        } else {
            if (bloqueSup1 == 2){
                labelBloque2.setBounds((x+40), y, 70, 30);
                labeltexto2.setBounds((x+40), y, 70, 30);
            } else {
                if (bloqueSup1 == 3){
                    labelBloque3.setBounds((x+32), y, 86, 30);
                    labeltexto3.setBounds((x+32), y, 86, 30);
                } else {
                    if (bloqueSup1 == 4){
                        labelBloque4.setBounds((x+24), y, 102, 30);
                        labeltexto4.setBounds((x+24), y, 102, 30);
                    } else {
                        if (bloqueSup1 == 5){
                            labelBloque5.setBounds((x+16), y, 118, 30);
                            labeltexto5.setBounds((x+16), y, 118, 30);
                        } else {
                            if (bloqueSup1 == 6){
                                labelBloque6.setBounds((x+8), y, 134, 30);
                                labeltexto6.setBounds((x+8), y, 134, 30);
                            } else {
                                labelBloque7.setBounds(x, y, 150, 30);
                                labeltexto7.setBounds(x, y, 150, 30);
                            }
                        }
                    }
                }
            }
        }
    }
    
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        columnaDesde = 2;
        columnaHasta = 1;
        bloqueSup1 = 0;
        bloqueSup2 = 0;
        filaDesde = 0;
        filaHasta = 6;

        for (int i = TorreHanoi.matrizJuego.length - 1; i >= 0; i--) {
            if (TorreHanoi.matrizJuego [i][columnaDesde] != 0){
                bloqueSup1 = TorreHanoi.matrizJuego [i][columnaDesde];
                filaDesde = i;
            }
            if (TorreHanoi.matrizJuego [i][columnaHasta] != 0){
                bloqueSup2 = TorreHanoi.matrizJuego [i][columnaHasta];
                filaHasta = i-1;
            }
        }

        if (bloqueSup1 != 0){
            if (bloqueSup2 == 0){
                MovimientoBloques(); //Para el movimiento gráfico del bloque
                movimientos++;
                labelMovimientos.setText(String.valueOf(movimientos));
                TorreHanoi.matrizJuego [filaDesde][columnaDesde] = 0; //Quita la posición del movimiento "desde", de la matriz de juego
                TorreHanoi.matrizJuego [filaHasta][columnaHasta] = bloqueSup1; //Añade la posición nueva a la matriz de juego
            } else {
                if (bloqueSup1 < bloqueSup2){
                    MovimientoBloques(); //Para el movimiento gráfico del bloque
                    movimientos++;
                    labelMovimientos.setText(String.valueOf(movimientos));
                    TorreHanoi.matrizJuego [filaDesde][columnaDesde] = 0; //Quita la posición del movimiento "desde", de la matriz de juego
                    TorreHanoi.matrizJuego [filaHasta][columnaHasta] = bloqueSup1; //Añade la posición nueva a la matriz de juego
                }

            }
        }
        this.repaint();
        FinJuego();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        columnaDesde = 2;
        columnaHasta = 0;
        bloqueSup1 = 0;
        bloqueSup2 = 0;
        filaDesde = 0;
        filaHasta = 6;

        for (int i = TorreHanoi.matrizJuego.length - 1; i >= 0; i--) {
            if (TorreHanoi.matrizJuego [i][columnaDesde] != 0){
                bloqueSup1 = TorreHanoi.matrizJuego [i][columnaDesde];
                filaDesde = i;
            }
            if (TorreHanoi.matrizJuego [i][columnaHasta] != 0){
                bloqueSup2 = TorreHanoi.matrizJuego [i][columnaHasta];
                filaHasta = i-1;
            }
        }

        if (bloqueSup1 != 0){
            if (bloqueSup2 == 0){
                MovimientoBloques(); //Para el movimiento gráfico del bloque
                movimientos++;
                labelMovimientos.setText(String.valueOf(movimientos));
                TorreHanoi.matrizJuego [filaDesde][columnaDesde] = 0; //Quita la posición del movimiento "desde", de la matriz de juego
                TorreHanoi.matrizJuego [filaHasta][columnaHasta] = bloqueSup1; //Añade la posición nueva a la matriz de juego
            } else {
                if (bloqueSup1 < bloqueSup2){
                    MovimientoBloques(); //Para el movimiento gráfico del bloque
                    movimientos++;
                    labelMovimientos.setText(String.valueOf(movimientos));
                    TorreHanoi.matrizJuego [filaDesde][columnaDesde] = 0; //Quita la posición del movimiento "desde", de la matriz de juego
                    TorreHanoi.matrizJuego [filaHasta][columnaHasta] = bloqueSup1; //Añade la posición nueva a la matriz de juego
                }

            }
        }
        this.repaint();
        FinJuego();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        columnaDesde = 1;
        columnaHasta = 2;
        bloqueSup1 = 0;
        bloqueSup2 = 0;
        filaDesde = 0;
        filaHasta = 6;

        for (int i = TorreHanoi.matrizJuego.length - 1; i >= 0; i--) {
            if (TorreHanoi.matrizJuego [i][columnaDesde] != 0){
                bloqueSup1 = TorreHanoi.matrizJuego [i][columnaDesde];
                filaDesde = i;
            }
            if (TorreHanoi.matrizJuego [i][columnaHasta] != 0){
                bloqueSup2 = TorreHanoi.matrizJuego [i][columnaHasta];
                filaHasta = i-1;
            }
        }

        if (bloqueSup1 != 0){
            if (bloqueSup2 == 0){
                MovimientoBloques(); //Para el movimiento gráfico del bloque
                movimientos++;
                labelMovimientos.setText(String.valueOf(movimientos));
                TorreHanoi.matrizJuego [filaDesde][columnaDesde] = 0; //Quita la posición del movimiento "desde", de la matriz de juego
                TorreHanoi.matrizJuego [filaHasta][columnaHasta] = bloqueSup1; //Añade la posición nueva a la matriz de juego
            } else {
                if (bloqueSup1 < bloqueSup2){
                    MovimientoBloques(); //Para el movimiento gráfico del bloque
                    movimientos++;
                    labelMovimientos.setText(String.valueOf(movimientos));
                    TorreHanoi.matrizJuego [filaDesde][columnaDesde] = 0; //Quita la posición del movimiento "desde", de la matriz de juego
                    TorreHanoi.matrizJuego [filaHasta][columnaHasta] = bloqueSup1; //Añade la posición nueva a la matriz de juego
                }

            }
        }
        this.repaint();
        FinJuego();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        columnaDesde = 1;
        columnaHasta = 0;
        bloqueSup1 = 0;
        bloqueSup2 = 0;
        filaDesde = 0;
        filaHasta = 6;

        for (int i = TorreHanoi.matrizJuego.length - 1; i >= 0; i--) {
            if (TorreHanoi.matrizJuego [i][columnaDesde] != 0){
                bloqueSup1 = TorreHanoi.matrizJuego [i][columnaDesde];
                filaDesde = i;
            }
            if (TorreHanoi.matrizJuego [i][columnaHasta] != 0){
                bloqueSup2 = TorreHanoi.matrizJuego [i][columnaHasta];
                filaHasta = i-1;
            }
        }

        if (bloqueSup1 != 0){
            if (bloqueSup2 == 0){
                MovimientoBloques(); //Para el movimiento gráfico del bloque
                movimientos++;
                labelMovimientos.setText(String.valueOf(movimientos));
                TorreHanoi.matrizJuego [filaDesde][columnaDesde] = 0; //Quita la posición del movimiento "desde", de la matriz de juego
                TorreHanoi.matrizJuego [filaHasta][columnaHasta] = bloqueSup1; //Añade la posición nueva a la matriz de juego
            } else {
                if (bloqueSup1 < bloqueSup2){
                    MovimientoBloques(); //Para el movimiento gráfico del bloque
                    movimientos++;
                    labelMovimientos.setText(String.valueOf(movimientos));
                    TorreHanoi.matrizJuego [filaDesde][columnaDesde] = 0; //Quita la posición del movimiento "desde", de la matriz de juego
                    TorreHanoi.matrizJuego [filaHasta][columnaHasta] = bloqueSup1; //Añade la posición nueva a la matriz de juego
                }

            }
        }
        this.repaint();
        FinJuego();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        columnaDesde = 0;
        columnaHasta = 2;
        bloqueSup1 = 0;
        bloqueSup2 = 0;
        filaDesde = 0;
        filaHasta = 6;

        for (int i = TorreHanoi.matrizJuego.length - 1; i >= 0; i--) {
            if (TorreHanoi.matrizJuego [i][columnaDesde] != 0){
                bloqueSup1 = TorreHanoi.matrizJuego [i][columnaDesde];
                filaDesde = i;
            }
            if (TorreHanoi.matrizJuego [i][columnaHasta] != 0){
                bloqueSup2 = TorreHanoi.matrizJuego [i][columnaHasta];
                filaHasta = i-1;
            }
        }

        if (bloqueSup1 != 0){
            if (bloqueSup2 == 0){
                MovimientoBloques(); //Para el movimiento gráfico del bloque
                movimientos++;
                labelMovimientos.setText(String.valueOf(movimientos));
                TorreHanoi.matrizJuego [filaDesde][columnaDesde] = 0; //Quita la posición del movimiento "desde", de la matriz de juego
                TorreHanoi.matrizJuego [filaHasta][columnaHasta] = bloqueSup1; //Añade la posición nueva a la matriz de juego
            } else {
                if (bloqueSup1 < bloqueSup2){
                    MovimientoBloques(); //Para el movimiento gráfico del bloque
                    movimientos++;
                    labelMovimientos.setText(String.valueOf(movimientos));
                    TorreHanoi.matrizJuego [filaDesde][columnaDesde] = 0; //Quita la posición del movimiento "desde", de la matriz de juego
                    TorreHanoi.matrizJuego [filaHasta][columnaHasta] = bloqueSup1; //Añade la posición nueva a la matriz de juego
                }

            }
        }
        this.repaint();
        FinJuego();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        columnaDesde = 0;
        columnaHasta = 1;
        bloqueSup1 = 0;
        bloqueSup2 = 0;
        filaDesde = 0;
        filaHasta = 6;

        for (int i = TorreHanoi.matrizJuego.length - 1; i >= 0; i--) {
            if (TorreHanoi.matrizJuego [i][columnaDesde] != 0){
                bloqueSup1 = TorreHanoi.matrizJuego [i][columnaDesde];
                filaDesde = i;
            }
            if (TorreHanoi.matrizJuego [i][columnaHasta] != 0){
                bloqueSup2 = TorreHanoi.matrizJuego [i][columnaHasta];
                filaHasta = i-1;
            }
        }

        if (bloqueSup1 != 0){
            if (bloqueSup2 == 0){
                MovimientoBloques(); //Para el movimiento gráfico del bloque
                movimientos++;
                labelMovimientos.setText(String.valueOf(movimientos));
                TorreHanoi.matrizJuego [filaDesde][columnaDesde] = 0; //Quita la posición del movimiento "desde", de la matriz de juego
                TorreHanoi.matrizJuego [filaHasta][columnaHasta] = bloqueSup1; //Añade la posición nueva a la matriz de juego
            } else {
                if (bloqueSup1 < bloqueSup2){
                    MovimientoBloques(); //Para el movimiento gráfico del bloque
                    movimientos++;
                    labelMovimientos.setText(String.valueOf(movimientos));
                    TorreHanoi.matrizJuego [filaDesde][columnaDesde] = 0; //Quita la posición del movimiento "desde", de la matriz de juego
                    TorreHanoi.matrizJuego [filaHasta][columnaHasta] = bloqueSup1; //Añade la posición nueva a la matriz de juego
                }

            }
        }
        this.repaint();
        FinJuego();
        
    }//GEN-LAST:event_jButton2ActionPerformed
    
    public void FinJuego (){ //Método para comparar si el jugador llegó a completar el juego ántes que finalizara el tiempo
        if (TorreHanoi.matrizJuego [0][2] == TorreHanoi.matrizFinal [0][2] && TorreHanoi.matrizJuego [1][2] == TorreHanoi.matrizFinal [1][2] && TorreHanoi.matrizJuego [2][2] == TorreHanoi.matrizFinal [2][2] && TorreHanoi.matrizJuego [3][2] == TorreHanoi.matrizFinal [3][2] && TorreHanoi.matrizJuego [4][2] == TorreHanoi.matrizFinal [4][2] && TorreHanoi.matrizJuego [5][2] == TorreHanoi.matrizFinal [5][2] && TorreHanoi.matrizJuego [6][2] == TorreHanoi.matrizFinal [6][2]){
            reloj.stop();
            this.setVisible(false);
            TorreHanoi.finJuego.txtTiempoFinal.setText(String.valueOf(segundos));
            TorreHanoi.finJuego.txtMovimientosFinal.setText(String.valueOf(movimientos));
            TorreHanoi.finJuego.setVisible(true);
        }
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        reloj.stop();
        movItem1.item1.setLocation(50, 100);
        movItem2.item2.setLocation(50, 250);
        this.segundos = 90;
        this.labelTiempo.setText(String.valueOf(segundos));
        this.labelTiempo.setForeground(Color.black);
        this.setVisible(false);
        TorreHanoi.menu.setVisible(true);

    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaJuego().setVisible(true);
            }
        });
    }
    
    public JLabel getLabelMovimientos() {
        return labelMovimientos;
    }

    public JLabel getLabelTiempo() {
        return labelTiempo;
    }

    public void setLabelMovimientos(JLabel labelMovimientos) {
        this.labelMovimientos = labelMovimientos;
    }

    public void setLabelTiempo(JLabel labelTiempo) {
        this.labelTiempo = labelTiempo;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    public static javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelBloque1;
    private javax.swing.JLabel labelBloque2;
    private javax.swing.JLabel labelBloque3;
    private javax.swing.JLabel labelBloque4;
    private javax.swing.JLabel labelBloque5;
    private javax.swing.JLabel labelBloque6;
    private javax.swing.JLabel labelBloque7;
    public static javax.swing.JLabel labelMovimientos;
    public static javax.swing.JLabel labelTiempo;
    private javax.swing.JLabel labeltexto1;
    private javax.swing.JLabel labeltexto2;
    private javax.swing.JLabel labeltexto3;
    private javax.swing.JLabel labeltexto4;
    private javax.swing.JLabel labeltexto5;
    private javax.swing.JLabel labeltexto6;
    private javax.swing.JLabel labeltexto7;
    // End of variables declaration//GEN-END:variables
}
