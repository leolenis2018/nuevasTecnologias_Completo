/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empleados;

/**
 *
 * @author Usuario
 */
public class Empleado {
    //atributos= datos = variables

    private int id;
    private String nombre;
    private String cargo;
    private int salario;
    private String telefono;
    private String direccion;

    //metodo especial= fotocopia = inicia la clase (Construct0r)
    public Empleado() {
    }

    public Empleado(int id, String nombre, String cargo, int salario, String telefono, String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.cargo = cargo;
        this.salario = salario;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    // METODOS DE ENCAPSULAMIENTO
    // GET AND SET
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    //metodos= acciones = funciones
    public int calcularSalario() {
        return (0);
    }

}
