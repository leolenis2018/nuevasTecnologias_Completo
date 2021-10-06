/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package convocatoria;

import java.util.Scanner;
import jugador.Jugador;

/**
 *
 * @author MR.S
 */
public class Convocatoria{
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int MAX_JUGADORES = 23, numJug = 0, opt, contador = 0;
        Jugador[] jugador = new Jugador[MAX_JUGADORES];
        
        
        for(int i = 0; i < MAX_JUGADORES; i++)
        {
            jugador[i] = new Jugador();
        }
        
        do
        {
            System.out.println("\n Bienvenido al sistema de convocatoria de la Selección Colombia.");
            System.out.println("1. Agregar jugador.");
            System.out.println("2. Buscar jugador.");
            System.out.println("3. Editar jugador.");
            System.out.println("4. Mostrar jugadores.");
            System.out.println("5. Salir.");
            
            System.out.print("Digite la opción que necesites: ");
            opt = s.nextInt();
            
            switch(opt)
            {
                case 1:
                    agregarJugador(contador, numJug, MAX_JUGADORES, jugador, s);
                    contador++;
                    break;
                case 2:
                    mostrarJugador(MAX_JUGADORES,jugador,s);
                    break;
                case 3:
                    editarJugador(MAX_JUGADORES, jugador, s);
                    break;
                case 4:
                    mostrarJugadores(MAX_JUGADORES, jugador);
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("La opción seleccionada es incorrecta");
            }
        }
        while(opt != 5);
        
    }
    
    public static void agregarJugador(int contador, int numJug, int MAX_JUGADORES, Jugador jugador[], Scanner s)
    {
        if(contador >= 0 && contador < MAX_JUGADORES)
        {
            System.out.println("\n Agregar jugador:");
            System.out.println("************************");
            int a = 0;
            do{
                System.out.println("Digite el número de la camisa: ");
                numJug = s.nextInt();
                for(int i = 0; i < MAX_JUGADORES; i++)
                {
                    if(numJug == jugador[i].getNumCamisa())
                    {
                        System.out.println("\n**********************************");
                        System.out.println("El número del jugador ya existe");
                        System.out.println("Intentalo de nuevo");
                        System.out.println("************************************\n");
                        a=0;
                        i = MAX_JUGADORES;
                    }
                    else{
                        a++;
                    }
                }
            }while(a == 0);
            jugador[contador].setNumCamisa(numJug);

            s.nextLine();

            System.out.println("Digite el nombre: ");
            jugador[contador].setNombre(s.nextLine());

            System.out.println("Digite los apellidos: ");
            jugador[contador].setApellido(s.nextLine());

            System.out.println("Digite la posición: ");
            jugador[contador].setPosicion(s.nextLine());

            System.out.println("Digite la edad: ");
            jugador[contador].setEdad(s.nextInt());

            s.nextLine();

            System.out.println("Digite el equipo: ");
            jugador[contador].setEquipo(s.nextLine());
            
        }
        else
        {
            System.out.println("La convocatoria está completa.");
            
        }
    }
    
    public static void mostrarJugador(int MAX_JUGADORES, Jugador jugador[], Scanner s)
    {
        System.out.println("\n Mostrar jugador:");
        System.out.println("************************");

        System.out.print("Digite el número de la camisa: ");
        int numCam = s.nextInt();
        int aux = 0;
        for(int i = 0; i < MAX_JUGADORES; i++)
        {
            if(numCam == jugador[i].getNumCamisa())
            {
                aux = i+1;
            }
        }
        if(aux > 0)
        {
            System.out.println("********************************************");
            System.out.println("Número camisa: "+jugador[aux-1].getNumCamisa());
            System.out.println("Nombres: "+jugador[aux-1].getNombre());
            System.out.println("Apellidos: "+jugador[aux-1].getApellido());
            System.out.println("Posición: "+jugador[aux-1].getPosicion());
            System.out.println("Edad: "+jugador[aux-1].getEdad());
            System.out.println("Equipo: "+jugador[aux-1].getEquipo());
            System.out.println("********************************************");
        }
        else
        {
            System.out.println("\n El jugador indicado no existe");
        }
    }
    
    public static void editarJugador(int MAX_JUGADORES, Jugador jugador[], Scanner s)
    {
        System.out.println("\nEditar jugador:");
        System.out.println("************************");

        System.out.print("Digite el número de la camisa: ");
        int NumCam2 = s.nextInt();
        int aux2 = 0;
        for(int i = 0; i < MAX_JUGADORES; i++)
        {
            if(NumCam2 == jugador[i].getNumCamisa())
            {
                int opt2 = 0;
                do{
                    System.out.println("Datos del jugador "+jugador[i].getNombre());
                    System.out.println("****************************************");
                    System.out.println("1. Número camisa: "+jugador[i].getNumCamisa());
                    System.out.println("2. Nombres: "+jugador[i].getNombre());
                    System.out.println("3. Apellidos: "+jugador[i].getApellido());
                    System.out.println("4. Posición: "+jugador[i].getPosicion());
                    System.out.println("5. Edad: "+jugador[i].getEdad());
                    System.out.println("6. Equipo: "+jugador[i].getEquipo());
                    System.out.println("7. Cancelar");
                    System.out.println("****************************************");
                    System.out.print("Digite la opción que quieres editar: ");
                    opt2 = s.nextInt();
                    s.nextLine();
                    switch(opt2)
                    {
                        case 1:
                            System.out.println("********************************");
                            System.out.print("Digite el número de camisa: ");
                            jugador[i].setNumCamisa(s.nextInt());
                            opt2=7;
                            break;
                        case 2:
                            System.out.println("********************************");
                            System.out.print("Escribe el nombre: ");
                            jugador[i].setNombre(s.nextLine());
                            opt2=7;
                            break;
                        case 3:
                            System.out.println("********************************");
                            System.out.print("Digite los apellidos: ");
                            jugador[i].setApellido(s.nextLine());
                            opt2=7;
                            break;
                        case 4:
                            System.out.println("********************************");
                            System.out.print("Digite la posición: ");
                            jugador[i].setPosicion(s.nextLine());
                            opt2=7;
                            break;
                        case 5:
                            System.out.println("********************************");
                            System.out.print("Digite la edad: ");
                            jugador[i].setEdad(s.nextInt());
                            opt2=7;
                            break;
                        case 6:
                            System.out.println("********************************");
                            System.out.print("Digite el equipo: ");
                            jugador[i].setEquipo(s.nextLine());
                            opt2=7;
                            break;
                        case 7:
                            System.out.println("Cancelar");
                            break;
                        default:
                            System.out.println("\n******************************");
                            System.out.println("La opción seleccionada es incorrecta");
                            System.out.println("********************************\n");
                    }
                }while(opt2 != 7);
                aux2++;
            }
        }
        if(aux2 == 0)
        {
            System.out.println("\n El jugador buscado no existe!!");
        }
    }
    
    public static void mostrarJugadores(int MAX_JUGADORES, Jugador jugador[])
    {
        System.out.println("\n Mostrar jugadores:");
        System.out.println("************************");

        for(int i = 0; i < MAX_JUGADORES; i++)
        {
            if(jugador[i].getNumCamisa() > 0)
            {
                System.out.println("Número camisa: "+jugador[i].getNumCamisa());
                System.out.println("Nombres: "+jugador[i].getNombre());
                System.out.println("Apellidos: "+jugador[i].getApellido());
                System.out.println("Posición: "+jugador[i].getPosicion());
                System.out.println("Edad: "+jugador[i].getEdad());
                System.out.println("Equipo: "+jugador[i].getEquipo());
                System.out.println("***************************************");
            }
        }
    }
}