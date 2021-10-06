/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

import paquete_2.Heroe;

/**
 *
 * @author Usuario
 */
public class Arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Como se utiliza una clase
        //Que es un objeto: Una variable
       
        Heroe heroe= new Heroe();
        Enemigo enemigo = new Enemigo();
        
        //Acceder a los atributos
        
        enemigo.nombre = "Borré";
        //Modidicador de acceso: palabras reservadas para enviar 
        
        heroe.nombre= "Borja";
        
               
        //Accediendo a un atributo privado
        heroe.setEdad(-5);
        
        System.out.println(heroe.nombre);
        System.out.println(heroe.getEdad());
        
        
    }
    
}
