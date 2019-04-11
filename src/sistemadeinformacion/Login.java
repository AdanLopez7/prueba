/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemadeinformacion;

/**
 *
 * @author Adan
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ete_usuario = new javax.swing.JLabel();
        ete_contra = new javax.swing.JLabel();
        campoUsuario = new javax.swing.JTextField();
        campoContra = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        botonIniciarSesion = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        botonRegistrarse = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ete_usuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ete_usuario.setForeground(new java.awt.Color(255, 255, 255));
        ete_usuario.setText("Usuario:");
        getContentPane().add(ete_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, 20));

        ete_contra.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ete_contra.setForeground(new java.awt.Color(240, 240, 240));
        ete_contra.setText("Contraseña:");
        getContentPane().add(ete_contra, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));

        campoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(campoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 170, -1));
        getContentPane().add(campoContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 170, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/user-2.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 255));
        jLabel2.setText("¿Olvidaste tu contraseña?");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, 160, -1));

        botonIniciarSesion.setBackground(new java.awt.Color(0, 51, 255));
        botonIniciarSesion.setForeground(new java.awt.Color(240, 240, 240));
        botonIniciarSesion.setText("Iniciar Sesion");
        botonIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIniciarSesionActionPerformed(evt);
            }
        });
        getContentPane().add(botonIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, 100, -1));

        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("¿Eres nuevo?¡Registrate!");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 390, -1, -1));

        botonRegistrarse.setBackground(new java.awt.Color(0, 0, 255));
        botonRegistrarse.setForeground(new java.awt.Color(240, 240, 240));
        botonRegistrarse.setText("Registrate");
        getContentPane().add(botonRegistrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 410, 100, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/login.jpg"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, -4, 410, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoUsuarioActionPerformed

    private void botonIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIniciarSesionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonIniciarSesionActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton botonIniciarSesion;
    private javax.swing.JButton botonRegistrarse;
    private javax.swing.JPasswordField campoContra;
    private javax.swing.JTextField campoUsuario;
    private javax.swing.JLabel ete_contra;
    private javax.swing.JLabel ete_usuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
