//Ventana al finalizar el juego
package torrehanoi;

import javax.swing.JLabel;

/**
 *
 * @author fredyquijada
 */
public class VentanaJuegoTerminado extends javax.swing.JFrame {

    /**
     * Creates new form VentanaJuegoTerminado
     */
    public VentanaJuegoTerminado() {
        initComponents();
        this.setLocationRelativeTo(this);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtMovimientosFinal = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtTiempoFinal = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNombreJugador = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("P052", 1, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("¡Felicidades! Has terminado el juego con:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 50, 990, -1));

        jLabel3.setFont(new java.awt.Font("P052", 1, 24)); // NOI18N
        jLabel3.setText("Movimientos");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 130, -1, -1));

        txtMovimientosFinal.setFont(new java.awt.Font("P052", 1, 24)); // NOI18N
        txtMovimientosFinal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtMovimientosFinal.setText("0");
        jPanel1.add(txtMovimientosFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, 60, -1));

        jLabel4.setFont(new java.awt.Font("P052", 1, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Segundos Faltantes");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 180, 250, -1));

        txtTiempoFinal.setFont(new java.awt.Font("P052", 1, 24)); // NOI18N
        txtTiempoFinal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTiempoFinal.setText("000");
        jPanel1.add(txtTiempoFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, 70, -1));

        jLabel5.setFont(new java.awt.Font("P052", 1, 36)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Ingresa tu nombre para guardar la partida:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 280, 1000, -1));

        jLabel6.setFont(new java.awt.Font("P052", 1, 36)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Nombre:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 380, -1, -1));

        txtNombreJugador.setFont(new java.awt.Font("P052", 0, 18)); // NOI18N
        txtNombreJugador.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txtNombreJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 380, 400, 30));

        jButton1.setBackground(new java.awt.Color(102, 255, 102));
        jButton1.setFont(new java.awt.Font("P052", 1, 24)); // NOI18N
        jButton1.setText("Guardar");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 500, 350, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondocolores.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 600));

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Para ordenar a los jugadores sin en dado caso alguno sobrepasó a otro jugador del top 5
        Ordenamiento();
        //Se llena la ventana del top 5 de jugadores
        LlenadoTopJugadores();
        //Se guarda el arreglo
        TorreHanoi.SerializarJugadores(TorreHanoi.jugadores, "top/Top 5 jugadores.dat");
        
        this.setVisible(false);
        VentanaJuegoTerminado.txtNombreJugador.setText(""); //Para borrar el nombre del jugador
        TorreHanoi.menu.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed
    
    public static void Ordenamiento (){
        //Crear al nuevo jugador
        TopJugadores jugador = new TopJugadores(Integer.valueOf(TorreHanoi.config.discos), TorreHanoi.juego.movimientos, Integer.valueOf(TorreHanoi.config.segConfig), TorreHanoi.juego.segundos, txtNombreJugador.getText());
            
        
        if (TorreHanoi.contJugadores == 0){ //Si no hay un jugador creado anteriormente que lo agregue al arreglo
            TorreHanoi.jugadores [TorreHanoi.contJugadores] = jugador; //Agregar al jugador al arreglo
        } else {
            
            int ordenDiscos [] = new int [6]; //Guarda la cantidad de Discos del arreglo de objetos
            int cantMovimientos [] = new int [6]; //Guarda la cantidad de movimientos del arreglo de objetos
            int tiempoFinal [] = new int [6]; //Guarda la cantidad de tiempo del arreglo de objetos
            int conteo = 0;
            //De aqui se sacan la cantidad de discos, la cantidad de movimientos y el tiempo del jugador del array
            for (TopJugadores cantDiscos : TorreHanoi.jugadores) {
                if (cantDiscos != null){
                    ordenDiscos [conteo] = cantDiscos.getDiscos();
                    cantMovimientos [conteo] = cantDiscos.getMovimientos();
                    tiempoFinal [conteo] = cantDiscos.getTiempoFinal();
                    conteo ++;
                }
            }
                
            int temporal = TorreHanoi.contJugadores;//Servira para ir corriendo a los jugadores
            TopJugadores jugadoresTemporal [] = new TopJugadores[6]; //Arreglo temporal para almacenar a los jugadores
            boolean bandera = false;
            
            for (TopJugadores ordenFinal : TorreHanoi.jugadores) {
                if (ordenFinal != null){
                    if (temporal > 0 && bandera == false){
                        if (ordenDiscos [temporal - 1] < jugador.getDiscos()){ // Si el jugador viejo tiene menos discos hechos que el nuevo
                            //Traslada para abajo al jugador viejo
                            jugadoresTemporal [temporal] = TorreHanoi.jugadores [temporal - 1];
                            temporal --;
                        } else {
                            if (ordenDiscos [temporal - 1] == jugador.getDiscos()){ // Si el jugador viejo tiene los mismos discos hechos que el nuevo
                                //Ahora revisamos movimientos
                                if (cantMovimientos [temporal - 1] > jugador.getMovimientos()){ // Si el jugador viejo tiene mas movimientos que el nuevo
                                    //Traslada para abajo al jugador viejo
                                    jugadoresTemporal [temporal] = TorreHanoi.jugadores [temporal - 1];
                                    temporal --;
                                } else {
                                    if (cantMovimientos [temporal - 1] == jugador.getMovimientos()){ // Si el jugador viejo tiene la misma cantidad de movimientos que el nuevo
                                        //Ultima revision el tiempo que le restaba al jugador
                                        if (tiempoFinal [temporal - 1] < jugador.getTiempoFinal()){ // Si el jugador viejo tiene mas tiempo restante que el nuevo
                                            //Traslada para abajo al jugador viejo
                                            jugadoresTemporal [temporal] = TorreHanoi.jugadores [temporal - 1];
                                            temporal --;
                                        } else {
                                            // Se guarda el nuevo jugador en la ultima posicion
                                            jugadoresTemporal [temporal] = jugador;
                                            jugadoresTemporal [temporal - 1] = TorreHanoi.jugadores [temporal - 1];
                                            bandera = true;
                                            temporal --;
                                        }
                                    } else {
                                        // Se guarda el nuevo jugador en la ultima posicion
                                        jugadoresTemporal [temporal] = jugador;
                                        jugadoresTemporal [temporal - 1] = TorreHanoi.jugadores [temporal - 1];
                                        bandera = true;
                                        temporal --;
                                    }
                                }
                            } else { // Si el jugador viejo tiene mas discos que el nuevo
                                // Se guarda el nuevo jugador en la ultima posicion
                                jugadoresTemporal [temporal] = jugador;
                                jugadoresTemporal [temporal - 1] = TorreHanoi.jugadores [temporal - 1];
                                bandera = true;
                                temporal --;
                            }   
                        }
                    } else {
                        if (temporal > 0 && bandera == true){ //Si ya guardó al nuevo jugador
                            jugadoresTemporal [temporal - 1] = TorreHanoi.jugadores [temporal - 1];
                            temporal --;
                        } else { //Si aún no ha guardado al nuevo jugador
                            if (temporal == 0 && bandera == false){
                                jugadoresTemporal [temporal] = jugador;
                            }
                        }
                    }
                }
            }
            TorreHanoi.jugadores = jugadoresTemporal;    
        }
        
        if (TorreHanoi.jugadores [0] == null){
            TorreHanoi.jugadores [0] = jugador;
        }
        
        if (TorreHanoi.contJugadores < 5){ //Esto es para asegurar que guarde el ultimo jugador en la posicion final del arreglo (fuera del top 5)
            TorreHanoi.contJugadores++;
        }
    }
    
    public static void LlenadoTopJugadores (){
        int contador = 0;
        for (TopJugadores posicionamiento : TorreHanoi.jugadores) {
            if (posicionamiento != null){
                if (contador == 0){
                    VentanaTopJugadores.txtNombre1.setText(posicionamiento.getNombreJugador());
                    VentanaTopJugadores.txtDiscos1.setText(String.valueOf(posicionamiento.getDiscos()));
                    VentanaTopJugadores.txtMovimientos1.setText(String.valueOf(posicionamiento.getMovimientos()));
                    VentanaTopJugadores.txtTiempo1.setText(String.valueOf(posicionamiento.getTiempoFinal()));
                    contador++;
                } else {
                    if (contador == 1){
                        VentanaTopJugadores.txtNombre2.setText(posicionamiento.getNombreJugador());
                        VentanaTopJugadores.txtDiscos2.setText(String.valueOf(posicionamiento.getDiscos()));
                        VentanaTopJugadores.txtMovimientos2.setText(String.valueOf(posicionamiento.getMovimientos()));
                        VentanaTopJugadores.txtTiempo2.setText(String.valueOf(posicionamiento.getTiempoFinal()));
                        contador++;
                    } else {
                        if (contador == 2){
                            VentanaTopJugadores.txtNombre3.setText(posicionamiento.getNombreJugador());
                            VentanaTopJugadores.txtDiscos3.setText(String.valueOf(posicionamiento.getDiscos()));
                            VentanaTopJugadores.txtMovimientos3.setText(String.valueOf(posicionamiento.getMovimientos()));
                            VentanaTopJugadores.txtTiempo3.setText(String.valueOf(posicionamiento.getTiempoFinal()));
                            contador++;
                        } else {
                            if (contador == 3){
                                VentanaTopJugadores.txtNombre4.setText(posicionamiento.getNombreJugador());
                                VentanaTopJugadores.txtDiscos4.setText(String.valueOf(posicionamiento.getDiscos()));
                                VentanaTopJugadores.txtMovimientos4.setText(String.valueOf(posicionamiento.getMovimientos()));
                                VentanaTopJugadores.txtTiempo4.setText(String.valueOf(posicionamiento.getTiempoFinal()));
                                contador++;
                            } else {
                                if (contador == 4){
                                    VentanaTopJugadores.txtNombre5.setText(posicionamiento.getNombreJugador());
                                    VentanaTopJugadores.txtDiscos5.setText(String.valueOf(posicionamiento.getDiscos()));
                                    VentanaTopJugadores.txtMovimientos5.setText(String.valueOf(posicionamiento.getMovimientos()));
                                    VentanaTopJugadores.txtTiempo5.setText(String.valueOf(posicionamiento.getTiempoFinal()));
                                    contador++;
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    
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
            java.util.logging.Logger.getLogger(VentanaJuegoTerminado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaJuegoTerminado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaJuegoTerminado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaJuegoTerminado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaJuegoTerminado().setVisible(true);
            }
        });
    }

    public JLabel getTxtMovimientosFinal() {
        return txtMovimientosFinal;
    }

    public JLabel getTxtTiempoFinal() {
        return txtTiempoFinal;
    }

    public void setTxtMovimientosFinal(JLabel txtMovimientosFinal) {
        this.txtMovimientosFinal = txtMovimientosFinal;
    }

    public void setTxtTiempoFinal(JLabel txtTiempoFinal) {
        this.txtTiempoFinal = txtTiempoFinal;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JLabel txtMovimientosFinal;
    public static javax.swing.JTextField txtNombreJugador;
    public static javax.swing.JLabel txtTiempoFinal;
    // End of variables declaration//GEN-END:variables
}