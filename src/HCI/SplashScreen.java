
package HCI;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class SplashScreen extends javax.swing.JFrame {

   
    public SplashScreen() {
        initComponents();
        ImageIcon img=new ImageIcon(getClass().getResource("/Image/hcilogo.png"));
        Image img1= img.getImage().getScaledInstance(topimg.getHeight(),topimg.getWidth(),Image.SCALE_SMOOTH);
        topimg.setIcon(new ImageIcon(img1));
        ImageIcon img2=new ImageIcon(getClass().getResource("/Image/logo.png"));
        Image img3= img2.getImage().getScaledInstance(bottomimg.getHeight(),bottomimg.getWidth(),Image.SCALE_SMOOTH);
        bottomimg.setIcon(new ImageIcon(img3));
        
        ImageIcon img4=new ImageIcon(getClass().getResource("/Image/ss.jpg"));
        Image img5= img4.getImage().getScaledInstance(side.getWidth(),side.getHeight(),Image.SCALE_SMOOTH);
        side.setIcon(new ImageIcon(img5));
        
        titlebarsetting();
    }

    void titlebarsetting()
        {
            this.setTitle("Login");
            Image img2 = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Image/titlelogo.png"));
            this.setIconImage(img2);
        }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        checkbox1 = new java.awt.Checkbox();
        jPanel1 = new javax.swing.JPanel();
        jp = new javax.swing.JProgressBar();
        bottomimg = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        topimg = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        side = new javax.swing.JLabel();

        checkbox1.setLabel("checkbox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setEnabled(false);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(51, 51, 255));
        jPanel1.setForeground(new java.awt.Color(0, 51, 255));
        jPanel1.setLayout(null);
        jPanel1.add(jp);
        jp.setBounds(-10, 387, 570, 14);

        bottomimg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(bottomimg);
        bottomimg.setBounds(60, 140, 160, 150);

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 10)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("with Associated ");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(70, 110, 130, 20);

        topimg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(topimg);
        topimg.setBounds(30, 0, 220, 120);

        jLabel1.setBackground(new java.awt.Color(0, 51, 204));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("<html> Name    : Neha Saini  <br> Roll No. : 17EMTCS027 <br> Branch   : Computer Science <br> Semester: V <br>     </html>");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 270, 280, 130);
        jPanel1.add(side);
        side.setBounds(270, 0, 280, 390);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 550, 400);

        setSize(new java.awt.Dimension(550, 398));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
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
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SplashScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel bottomimg;
    private java.awt.Checkbox checkbox1;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JProgressBar jp;
    private javax.swing.JLabel side;
    public javax.swing.JLabel topimg;
    // End of variables declaration//GEN-END:variables
}
