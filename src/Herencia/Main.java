/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Herencia;

/**
 *
 * @author ESTACION
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       Padre P = new Padre ();
       P.metodo1();
      
       Hijo H = new Hijo ();
       H.metodo1();
       
       Padre P1 = new Hijo ();
       P1.metodo1();
      /** Hijo H1 = (Hijo) new Padre (); */
       
    }
    
}
