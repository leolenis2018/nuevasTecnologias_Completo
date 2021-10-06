/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete_2;

/**
 *
 * @author Usuario
 */
public class Heroe {
    //Datos :Atributos => Variables
    public String nombre;
    public int edad;

    //Metodos = Acciones => Funciones

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if(edad>1&& edad<200){
        this.edad = edad;
    }else {
            System.out.println("Edad Invalida");
        }
        
    }
    
    
    
    
    
    public Heroe() {
    }
    
    
}
