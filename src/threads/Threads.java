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
class worker implements Runnable{

    @Override
    public void run() {
        for(int i=0; i <=9; i++){
            System.out.println("Thread " + i + " is Running");
        }
        
        try {
            Thread.sleep(500);
        } catch (InterruptedException ex) {
            Logger.getLogger(worker.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}



public class Threads {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        worker w1 = new worker();
        Thread t1 = new Thread(w1);
        
        worker w2 = new worker();
        Thread t2 = new Thread(w2);
        t1.start();
        t2.start();
        worker w3 = new worker();
        Thread t3 = new Thread(w3);
       // t3.start();
        worker w4 = new worker();
        Thread t4 = new Thread(w4);
      //  t4.start();
        worker w5 = new worker();
        Thread t5 = new Thread(w5);
       // t5.start();
        
        
        System.out.println("Task Sucess");
        
    }
    
}
