
import javax.swing.JOptionPane;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RAYMOND
 */
public class login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public login() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtxtUserName = new javax.swing.JTextField();
        jPassword = new javax.swing.JPasswordField();
        jbtnLogin = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Felix Titling", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 51, 0));
        jLabel4.setText("USERNAME");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 102, 133, 50));

        jLabel5.setFont(new java.awt.Font("Felix Titling", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 51, 0));
        jLabel5.setText("PASSWORD");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 186, 133, 48));

        jtxtUserName.setBackground(new java.awt.Color(204, 204, 204));
        jtxtUserName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(jtxtUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 142, 50));

        jPassword.setBackground(new java.awt.Color(204, 204, 204));
        jPassword.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordActionPerformed(evt);
            }
        });
        jPanel1.add(jPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, 142, 48));

        jbtnLogin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtnLogin.setForeground(new java.awt.Color(204, 51, 0));
        jbtnLogin.setText("LOGIN");
        jbtnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnLoginActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 102, 45));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\RAYMOND\\OneDrive\\Documents\\NetBeansProjects\\Belgique_ Photo.gif")); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 400));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordActionPerformed

    private void jbtnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnLoginActionPerformed
        String password = jPassword.getText();
        String username = jtxtUserName.getText();
        
        if(password.contains("karurumo") && (username.contains("Ray")))
        {
            jtxtUserName.setText(null);
            jPassword.setText(null);
            systemExit();
            
            pizza Info = new pizza();
            Info.setVisible(true);
        }
        
        else
        {
            JOptionPane.showMessageDialog(null, "Invalid Login Details!","Login Error",JOptionPane.ERROR_MESSAGE);
            jPassword.setText(null);
            jtxtUserName.setText(null);
        }
    }//GEN-LAST:event_jbtnLoginActionPerformed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPassword;
    private javax.swing.JButton jbtnLogin;
    private javax.swing.JTextField jtxtUserName;
    // End of variables declaration//GEN-END:variables

private void systemExit()
    {
        WindowEvent winCloseing = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
    }
}
