/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package folder;

import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author fikri muhammad
 */
public class fa {
    	public static String generateRandomPassword(int len) {
		String chars = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijk"
          +"lmnopqrstuvwxyz!@#$%&";
		Random rnd = new Random();
		StringBuilder sb = new StringBuilder(len);
		for (int i = 0; i < len; i++)
			sb.append(chars.charAt(rnd.nextInt(chars.length())));
		return sb.toString();
	}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] nama = new String[]{
            "Pak Jarmo" ,"Pak Kimin" ,"Pak Owi","Pak Darto"
        };
    
        Random r = new Random();
        int id = r.nextInt(nama.length);
        System.out.println("Terpilih : " + nama[id]);

 
    
    
      JFrame frame = new JFrame();
       //JOptionPane.showMessageDialog(frame, "Hello Java");
      //JOptionPane.showMessageDialog(frame, "You have less amount, please recharge","Apocalyptic message", JOptionPane.WARNING_MESSAGE);
      /** int result = JOptionPane.showConfirmDialog(null, "Do you want to remove item now?");
      switch (result) {
         case JOptionPane.YES_OPTION:
         System.out.println("Yes");
         break;
         case JOptionPane.NO_OPTION:
         System.out.println("No");
         break;
         case JOptionPane.CANCEL_OPTION:
         System.out.println("Cancel");
         break;
         case JOptionPane.CLOSED_OPTION:
         System.out.println("Closed");
         break;
      }
      * */
      
      //String name = JOptionPane.showInputDialog(null, "Please enter your name.");
      //System.out.println(name);
      int i=0;
      do{
      JTextField userField = new JTextField();
      JPasswordField passField = new JPasswordField();
      
      String message = "Please enter your user name and password.";
      int result = JOptionPane.showOptionDialog(frame, new Object[] {message, userField, passField},
      "Login", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
      
      if (result == JOptionPane.OK_OPTION){
           String username,password;
        
        username="alif";
        password="12345";
        
        if (username.equalsIgnoreCase(userField.getText())&& password.equalsIgnoreCase(passField.getText()))
        {

            new JFrame1().setVisible(true);
            i=1;
            
        }
        else{
            JOptionPane.showMessageDialog(null, "Maaf username dan password salah");
            
        }
      }

        
      }while(i==0);
}
}

