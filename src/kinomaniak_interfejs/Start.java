/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kinomaniak_interfejs;

import java.util.ArrayList;
import javax.swing.JToggleButton;
import kinomaniak_z_interfejsem.Klient2;

/**
 *
 * @author JK
 */
public class Start {
    
    //FrameLogin flog = new FrameLogin();
    
    
         public static String wpisanyLogin;
         public static String wpisaneHaslo ;
         public static String imieNazRez;
         public static String[] movnames = new String[10];
         public static boolean seatsCreated = false;
         public static int idSeansu;
         public static int ilMiejsc;
         public static int bindex = 0;
         
         public static ArrayList<JToggleButton> buttons = new ArrayList<JToggleButton>();
         public static int[][] potencjalnieZarezerwowane = new int[10][10];
        // public static int[][] irytujacaTablica = new ;
         
         //KinomaniakInterface kin = new Klient2();
         
         
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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }


    
}
