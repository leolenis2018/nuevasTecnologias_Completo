/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seleccioncolombia;

import java.util.Scanner;
import jugadores.Jugador;

/**
 *
 * @author Usuario
 */
public class SeleccionColombia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int opcion;
        int contador = 0;

        Jugador[] jugadores = new Jugador[5];

        do {
            System.out.println("Bienvenido");
            System.out.println("***********");
            System.out.println("1. Agregar Jugador");
            System.out.println("2. Buscar Jugador ");
            System.out.println("3. Editar infomacion por id");
            System.out.println("4. Mostrar toda la convocatoria ");
            System.out.println("5. Salir");
            System.out.println("");

            System.out.println("Digite una opción:");
            opcion = entrada.nextInt(); //Preguntar
            Jugador jug;

            switch (opcion) {
                case 1:
                    if (contador <= 15) {
                        jugadores[contador] = new Jugador(); //Preguntar
                        System.out.println("Número de camiseta:");
                        jugadores[contador].setNumeroCamiseta(entrada.nextInt());

                        System.out.println("Nombre:");
                        jugadores[contador].setNombre(entrada.next());

                        System.out.println("Posición en campo:");
                        jugadores[contador].setPosicion(entrada.next());

                        System.out.println("Edad:");
                        jugadores[contador].setEdad(entrada.nextInt());

                        System.out.println("Equipo Actual:");
                        jugadores[contador].setEquipo(entrada.next());
                    } else {
                        contador++;
                    }
                    break;
                case 2:
                    System.out.println("Introduce numero del jugador: ");
                    jugadores[contador].setNumeroCamiseta(entrada.nextInt());

                    break;
                case 3:
                    break;
                case 4:
                    for (int i = 0; i < contador; i++) {
                        System.out.println(jugadores[i].getNombre());
                    }
                    break;
                case 5:
                    break;
            }

        } while (opcion != 5);
    }
}
