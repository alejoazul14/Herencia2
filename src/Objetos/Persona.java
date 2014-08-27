/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Objetos;

/**
 *
 * @author ESTACION
 */
public class Persona {
    
    int cedula;
    String nombre;
    Direccion direccion;
    
   public Persona (int cedula, String nombre, Direccion dir){
       
           direccion = dir;
   }
           
   public Persona (int cedula, String nombre, String dir){
       
       direccion = new Direccion (dir);   
       
   }
       
}
