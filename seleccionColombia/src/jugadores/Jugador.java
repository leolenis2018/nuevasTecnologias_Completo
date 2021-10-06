/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jugadores;

/**
 *
 * @author Usuario
 */
public class Jugador {

    //atributos= datos = variables
    private int numeroCamiseta;
    private String nombre;
    private String posicion;
    private int edad;
    private String equipo;

    
    //metodo especial= fotocopia = inicia la clase (Construct0r)
    public Jugador() {
    }

    public Jugador(int numeroCamiseta, String nombre, String posicion, int edad, String equipo) {
        this.numeroCamiseta = numeroCamiseta;
        this.nombre = nombre;
        this.posicion = posicion;
        this.edad = edad;
        this.equipo = equipo;
    }
    
    // METODOS DE ENCAPSULAMIENTO
    // GET AND SET

    public int getNumeroCamiseta() {
        return numeroCamiseta;
    }

    public void setNumeroCamiseta(int numeroCamiseta) {
        this.numeroCamiseta = numeroCamiseta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }
    
    
    
    
    
}
