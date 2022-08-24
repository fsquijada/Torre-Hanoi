//Ventana de configuración del juego
package torrehanoi;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author fredyquijada
 */
public class VentanaConfiguracion extends javax.swing.JFrame {

    String segConfig = "120";
    String discos = "3";
    
    public VentanaConfiguracion() {
        initComponents();
        this.setLocationRelativeTo(this);
        this.setVisible(false);
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
        jLabel4 = new javax.swing.JLabel();
        jComboCantidadDiscos = new javax.swing.JComboBox<>();
        txtTiempoPartida = new javax.swing.JTextField();
        botonSalirConfig = new javax.swing.JButton();
        botonGuardarConfig = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Daniel", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Configuración");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1000, -1));

        jLabel3.setFont(new java.awt.Font("Daniel", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Cantidad de discos");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, -1, -1));

        jLabel4.setFont(new java.awt.Font("Daniel", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Tiempo de partida");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 180, -1, -1));

        jComboCantidadDiscos.setFont(new java.awt.Font("Daniel", 1, 18)); // NOI18N
        jComboCantidadDiscos.setForeground(new java.awt.Color(0, 0, 0));
        jComboCantidadDiscos.setMaximumRowCount(5);
        jComboCantidadDiscos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3", "4", "5", "6", "7" }));
        jComboCantidadDiscos.setSelectedItem(3);
        jComboCantidadDiscos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jComboCantidadDiscos.setEditor(null);
        jComboCantidadDiscos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboCantidadDiscosActionPerformed(evt);
            }
        });
        jPanel1.add(jComboCantidadDiscos, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, 360, -1));

        txtTiempoPartida.setFont(new java.awt.Font("Daniel", 0, 18)); // NOI18N
        txtTiempoPartida.setForeground(new java.awt.Color(0, 0, 0));
        txtTiempoPartida.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTiempoPartida.setText("120");
        txtTiempoPartida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTiempoPartidaActionPerformed(evt);
            }
        });
        jPanel1.add(txtTiempoPartida, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 280, 350, -1));

        botonSalirConfig.setBackground(new java.awt.Color(102, 153, 255));
        botonSalirConfig.setFont(new java.awt.Font("P052", 1, 24)); // NOI18N
        botonSalirConfig.setForeground(new java.awt.Color(255, 255, 255));
        botonSalirConfig.setText("Regresar");
        botonSalirConfig.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonSalirConfig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirConfigActionPerformed(evt);
            }
        });
        jPanel1.add(botonSalirConfig, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 500, 210, 50));

        botonGuardarConfig.setBackground(new java.awt.Color(0, 255, 0));
        botonGuardarConfig.setFont(new java.awt.Font("P052", 1, 24)); // NOI18N
        botonGuardarConfig.setForeground(new java.awt.Color(0, 0, 0));
        botonGuardarConfig.setText("Guardar");
        botonGuardarConfig.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonGuardarConfig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarConfigActionPerformed(evt);
            }
        });
        jPanel1.add(botonGuardarConfig, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 500, 240, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Rainbow-colors-wood-board-background_1024x768.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 600));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTiempoPartidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTiempoPartidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTiempoPartidaActionPerformed

    private void botonSalirConfigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirConfigActionPerformed
        this.setVisible(false);
        TorreHanoi.menu.setVisible(true);
    }//GEN-LAST:event_botonSalirConfigActionPerformed

    private void jComboCantidadDiscosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboCantidadDiscosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboCantidadDiscosActionPerformed

    private void botonGuardarConfigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarConfigActionPerformed
        
        segConfig = txtTiempoPartida.getText();
        
        if (Integer.valueOf(segConfig) > 19 && Integer.valueOf(segConfig) < 601){
            discos = String.valueOf(jComboCantidadDiscos.getSelectedItem()); //Valor del item seleccionado
            JOptionPane.showMessageDialog(this, "Configuración guardada correctamente");
        } else {
            JOptionPane.showMessageDialog(this, "Debes ingresar un tiempo entre 20 y 600 segundos");
        }
    }//GEN-LAST:event_botonGuardarConfigActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaConfiguracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaConfiguracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaConfiguracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaConfiguracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaConfiguracion().setVisible(true);
            }
        });
    }

    public static JComboBox<String> getjComboCantidadDiscos() {
        return jComboCantidadDiscos;
    }

    public static JTextField getTxtTiempoPartida() {
        return txtTiempoPartida;
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonGuardarConfig;
    private javax.swing.JButton botonSalirConfig;
    public static javax.swing.JComboBox<String> jComboCantidadDiscos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JTextField txtTiempoPartida;
    // End of variables declaration//GEN-END:variables
}