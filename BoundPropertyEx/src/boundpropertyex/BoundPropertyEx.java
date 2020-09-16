/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boundpropertyex;

import java.util.Scanner;

/**
 *
 * @author 01111
 */
public class BoundPropertyEx {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         MyPropertyBean mySource = new MyPropertyBean();
         Listener1 annoucer1 = new Listener1();
         Listener2 annoucer2 = new Listener2();
         mySource.addPropertyChangeListener(annoucer1);
         mySource.addPropertyChangeListener(annoucer2);
         Scanner in = new Scanner(System.in);
         String nscore = "";
         while(nscore!=null){
            System.out.print("Enter Score ");
            nscore = in.nextLine(); 
            if("".equals(nscore)){break;}
            mySource.setScore(nscore);
           
         }         
    }
}
  

