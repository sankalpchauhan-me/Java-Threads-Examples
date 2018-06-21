/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sankalp
 */
class Runner extends Thread{

    @Override
    public void run() {
        for(int i=0; i <=9; i++){
            System.out.println("Thread " + i + " is Running");
        }
        
        try {
            Thread.sleep(500);
        } catch (InterruptedException ex) {
            Logger.getLogger(Runner.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}



public class Threads {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Runner t1 = new Runner();
        Runner t2 = new Runner();
        t1.start();
        t2.start();
        
        
        
        System.out.println("Task Sucess");
        
    }
    
}
