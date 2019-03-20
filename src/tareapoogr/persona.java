/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tareapoogr;

/**
 *
 * @author Marvin Trigueros
 */
public class persona {
    
     
     //atributos
    private String nombre; 
    public String profesion; 
    
    public persona() {
        //constructor
    }
    
    // establecer y obtener
    
    public void establecerNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String obtenerNombre(){
        return this.nombre;
        
    }
    
    // establecer y obtener
    
    public void establecerProfesion(String profesion){
        this.nombre = profesion;
    }
    
    public String obtenerProfesion(){
        return this.profesion;
        
    }
    
    
    
}
