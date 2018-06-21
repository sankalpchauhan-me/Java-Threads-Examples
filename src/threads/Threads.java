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
public class Threads {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Thread thread1= new Thread(new Runnable()
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Hello: " + i + " Thread: " + Thread.currentThread().getName());

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException ignored) {}
                }
            }
        });
        
        
        
        System.out.println("Task Sucess");
        
    }
    
}
