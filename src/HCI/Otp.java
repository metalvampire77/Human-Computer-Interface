/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HCI;

import easyjavamail.JavaEmail;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.MessagingException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author AVENGERS
 */
public class Otp extends javax.swing.JFrame {

    private static String Email;
    private static String Otpo;

    /**
     * Creates new form Otp
     */
    public Otp() {
        initComponents();
        ImageIcon img=new ImageIcon(getClass().getResource("/Image/forgot.png"));
        Image img1= img.getImage().getScaledInstance(otpimg.getWidth(),otpimg.getHeight(),Image.SCALE_SMOOTH);
        otpimg.setIcon(new ImageIcon(img1));
        titlebarsetting();
    }

     void titlebarsetting()
        {
            this.setTitle("Forgot Password");
            Image img2 = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Image/titlelogo.png"));
            this.setIconImage(img2);
        }
     static void sendemail(String e)
     {
         Email = e;
     }
    static void otpm(String o)
    {
        Otpo = o;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        newpass = new javax.swing.JTextField();
        repass = new javax.swing.JTextField();
        otp = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        otpimg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("New Password:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(50, 190, 110, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ReenterPassword:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(50, 230, 110, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText(" OTP  Code:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(50, 150, 110, 30);
        jPanel1.add(newpass);
        newpass.setBounds(160, 190, 250, 30);
        jPanel1.add(repass);
        repass.setBounds(160, 230, 250, 30);
        jPanel1.add(otp);
        otp.setBounds(160, 150, 250, 30);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton1.setText("SUBMIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(160, 290, 110, 40);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Forgot Password");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(140, 100, 150, 30);
        jPanel1.add(otpimg);
        otpimg.setBounds(0, 0, 450, 370);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 450, 370);

        setSize(new java.awt.Dimension(446, 387));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String otpv  = otp.getText();
        String npass = newpass.getText();
        String rpass = repass.getText();
        if(otpv.equals(Otpo))
        {
            
            try {
                Connection c=DriverManager.getConnection("jdbc:derby://localhost:1527/HCIDB", "root", "root");
                Statement s=c.createStatement();
                s.executeUpdate("update SIGNUP set Password=('"+npass+"') where Email=('"+Email+"')");
                
                JavaEmail sendemai=new JavaEmail();
                sendemai.setMailServerProperties(); 
                sendemai.createEmailMessage(Email,"password changed succesfully","your new password is : "+npass+" ");
                sendemai.sendEmail("nehasaini22213@gmail.com", "9414787796");    
                JOptionPane.showMessageDialog(rootPane, "Password changed sucessfully");
                
                this.dispose();
                Login lo = new Login();
                lo.setVisible(true);
            
            } catch (SQLException ex) {
                Logger.getLogger(Otp.class.getName()).log(Level.SEVERE, null, ex);
            } catch (MessagingException ex) {
                Logger.getLogger(Otp.class.getName()).log(Level.SEVERE, null, ex);
            }
                
           
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane, "Entered OTP is not Correct!");

        }
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
            java.util.logging.Logger.getLogger(Otp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Otp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Otp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Otp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Otp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField newpass;
    private javax.swing.JTextField otp;
    public javax.swing.JLabel otpimg;
    private javax.swing.JTextField repass;
    // End of variables declaration//GEN-END:variables
}
