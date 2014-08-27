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
public class Direccion {
    
    String calle;
    String carrera;
    String pais;
    String codigo_postal;
    
    public Direccion (String dir){
        
    }

    public Direccion(String calle, String carrera, String pais, String codigo_postal) {
        this.calle = calle;
        this.carrera = carrera;
        this.pais = pais;
        this.codigo_postal = codigo_postal;
    }
    
    
    
    
}
