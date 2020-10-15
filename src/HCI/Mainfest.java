/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HCI;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Mainfest {

    public static void main(String[] args) {
      SplashScreen splash = new SplashScreen();
        splash.setVisible(true);
        
        for(int i=0;i<=100;i++)
        {
           splash.jp.setValue(i);
           splash.jp.setStringPainted(true);
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                Logger.getLogger(Mainfest.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        splash.dispose();
        Login lo = new Login();
        lo.setVisible(true);
    }
    
}
