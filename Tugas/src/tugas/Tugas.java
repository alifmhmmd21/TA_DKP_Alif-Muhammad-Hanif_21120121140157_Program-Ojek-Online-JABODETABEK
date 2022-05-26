/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Tugas {

    public static void main(String[] args) {
        loading load = new loading();
        load.setVisible(true);
        user use = new user();
        
        try {
            for(int i=0;i<=100;i++){
            Thread.sleep(10);
            load.loadbar.setValue(i);
            if(i==100){
                load.setVisible(false);
                use.setVisible(true); 
            }
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(Tugas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
