package ui;

import java.util.Scanner;

public class PokeCollector {

    public static Scanner reader;
    
    public static void main(String[] args) {

        inicializarGlobales();
        menu();
    }

    /**
     * Descripcion: Este metodo se encarga de iniciar las variables globales
     * pre: El Scanner reader debe estar declarado
     * pos: l Scanner reader queda inicializado
    */
    public static void inicializarGlobales() {

        reader = new Scanner(System.in);

    }

    /**
     * Descripcion: Este metodo se encarga de desplegar el menu al usuario y mostrar los mensajes de resultado para cada funcionalidad
     * pre: El Scanner reader debe estar inicializado
    */
    public static void menu() {

        System.out.println("Bienvenido a PokeCollector!");

        boolean salir = false;

        do {

            System.out.println("\nMenu Principal:");
            System.out.println("1. Registrar una Carta (Create)");
            System.out.println("2. Consultar una Carta (Read)");
            System.out.println("3. Modificar una Carta (Update)");
            System.out.println("4. Eliminar una Carta (Delete)");
            System.out.println("0. Salir");
            System.out.println("\nDigite la opcion a ejecutar");
            int opcion = reader.nextInt();

            switch (opcion) {
                case 1:
                    registrarCarta();
                    break;
                case 2:
                    consultarCarta();
                    break;
                case 3:
                    modificarCarta();
                    break;
                case 4:
                    eliminarCarta();
                    break;
                case 0:
                    System.out.println("\nGracias por usar nuestros servicios!");
                    salir = true;
                    reader.close();
                    break;

                default:
                    System.out.println("\nOpción inválida!");
                    break;
            }

        } while (!salir);

    }

    /**
     * Descripcion: Este metodo se encarga de preguntar al usuario los datos necesarios para registrar una carta en el sistema
     * pre: El Scanner reader debe estar inicializado
     */
    public static void registrarCarta(){

     
    }

    /**
     * Descripcion: Este metodo se encarga de desplegar al usuario los datos de una carta registrada en el sistema
     * pre: El Scanner reader debe estar inicializado
     */
    public static void consultarCarta(){

     
    }

   /**
     * Descripcion: Este metodo se encarga de preguntar al usuario los datos necesarios para modificar una carta en el sistema
     * pre: El Scanner reader debe estar inicializado
     */
    public static void modificarCarta(){

     
    }

    /**
     * Descripcion: Este metodo se encarga de preguntar al usuario los datos necesarios para eliminar una carta en el sistema
     * pre: El Scanner reader debe estar inicializado
     */
    public static void eliminarCarta(){

     
    }

    

}
