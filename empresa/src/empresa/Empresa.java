/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa;

import empleados.Empleado;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Empresa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int opcion;
        int contador = 0;

        Empleado[] empleados = new Empleado[5];

        do {
            System.out.println("Bienvenido");
            System.out.println("***********");
            System.out.println("1. Agregar empleado");
            System.out.println("2. Mostrar empleado");
            System.out.println("3. Mostrar empleados");
            System.out.println("4. Salir");
            System.out.println("");

            System.out.print("Digite una opcion:");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    //buscar el next line
                    //con arraylis no tengo que poner condicional
                    //contador= 0
                    if (contador <= 10) {
                        empleados[contador] = new Empleado();
                        System.out.println("Digite el id del empleado:");
                        empleados[contador].setId(entrada.nextInt());

                        System.out.println("Digita Nombre:");
                        empleados[contador].setNombre(entrada.next());

                        System.out.println("Digita cargo:");
                        empleados[contador].setCargo(entrada.next());

                        System.out.println("Digita Salario:");
                        empleados[contador].setSalario(entrada.nextInt());

                        System.out.println("Digita Telefono:");
                        empleados[contador].setTelefono(entrada.next());

                        System.out.println("Digita Direccion:");
                        empleados[contador].setDireccion(entrada.next());
                    } else {
                        contador++;
                    }
                    break;

                case 2:
                    break;
                case 3:
                    for (int i = 0; i < contador; i++) {
                        System.out.println(empleados[i].getNombre());
                    }
                    // para mostrar todo me sirve un ciclo for
                    break;
                case 4:
                    // Poner Mensaje
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcion no validad");
                    break;
            }

        } while (opcion != 4);

    }

}
