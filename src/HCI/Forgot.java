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
import java.sql.ResultSet;
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
public class Forgot extends javax.swing.JFrame {

    /**
     * Creates new form Forgot
     */
    String otp = "";
    public Forgot() {
        initComponents();
        ImageIcon img=new ImageIcon(getClass().getResource("/Image/forgot.png"));
        Image img1= img.getImage().getScaledInstance(forgotimg.getWidth(),forgotimg.getHeight(),Image.SCALE_SMOOTH);
        forgotimg.setIcon(new ImageIcon(img1));
        titlebarsetting();
    }

     void titlebarsetting()
        {
            this.setTitle("Forgot Password");
            Image img2 = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Image/titlelogo.png"));
            this.setIconImage(img2);
        }
      void createotp()
     {
         long iotp = Math.round(Math.random()*100000);
         otp = String.valueOf(iotp);
     }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        forgotimg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Forgot Password");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(130, 110, 150, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText(" Email :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(44, 190, 100, 30);

        email.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(email);
        email.setBounds(150, 190, 240, 30);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton1.setText("SUBMIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(150, 270, 110, 40);
        jPanel1.add(forgotimg);
        forgotimg.setBounds(0, 0, 420, 370);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 420, 370);

        setSize(new java.awt.Dimension(416, 395));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            
            String e;
            e=email.getText();
            Connection c;
            Statement s;
            ResultSet rs;
            
            c=DriverManager.getConnection("jdbc:derby://localhost:1527/HCIDB","root","root");
            s= c.createStatement();
            rs=s.executeQuery("select email from signup");
            int flag=0;
            while(rs.next())
            {
                    
                if((e.equals("admin") ) || (e.equals(rs.getString("email")) ) )
                {
                    flag=0;
                    break;
                }
                else
                {
                    flag=1;
                }
            }
            
            if(flag==0)
            {
                
                
                JavaEmail em =new JavaEmail();
                em.setMailServerProperties();
                createotp();
                em.createEmailMessage(e,"OTP verification","OTP CODE :"+otp);
                em.sendEmail("nehasaini22213@gmail.com", "9414787796");
                JOptionPane.showMessageDialog(rootPane, "mail sent sucessfully");
                
                this.dispose();
                Otp ot = new Otp();
                ot.sendemail(e);
                ot.setVisible(true);
                ot.otpm(otp);
                
            }
            else
            {
                JOptionPane.showMessageDialog(rootPane, "Email-Id not exist");           
            }
        } catch (SQLException ex) {
            Logger.getLogger(Forgot.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MessagingException ex) {
            Logger.getLogger(Forgot.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(Forgot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Forgot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Forgot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Forgot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Forgot().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField email;
    public javax.swing.JLabel forgotimg;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
