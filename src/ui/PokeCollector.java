package ui;

import java.util.Scanner;
import model.Carta;

public class PokeCollector {

    public static Carta[] memoria;
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
        memoria = new Carta[50];

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
                    solicitarDatosCarta();
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
    public static void solicitarDatosCarta(){
        
        reader.nextLine(); //Limpieza de buffer
        System.out.println("Proporcione el ID de la carta");
        String id = reader.nextLine();

        System.out.println("Proporcione el nombre del Pokemon en la carta");
        String nombre = reader.nextLine();

        System.out.println("Proporcione los puntos de vida del Pokemon en la carta");
        int puntosVida = reader.nextInt();
        reader.nextLine();//Limpieza de buffer

        System.out.println("Proporcione el tipo del Pokemon en la carta (Agua, Fuego, etc.)");
        String tipo = reader.nextLine();

        System.out.println("Proporcione la rareza de la carta (Basico, Raro, Mitico, Legendario)");
        String rareza = reader.nextLine();

        boolean resultado = guardarCartaEnMemoria(id, nombre, puntosVida, tipo, rareza);

        if(resultado){
            System.out.println("Carta registrada exitosamente");
        }else{
            System.out.println("Error memoria llena!");
        
        }


     
    }

    public static boolean guardarCartaEnMemoria(String id, String nombre, int puntosVida, String tipo, String rareza){

        Carta nuevaCarta = new Carta(id, nombre, puntosVida, tipo, rareza);

        for(int i=0; i<memoria.length;i++){
            if(memoria[i]==null){
                memoria[i] = nuevaCarta;
                return true;
            }
        } 

        return false;

    }

    /**
     * Descripcion: Este metodo se encarga de desplegar al usuario los datos de una carta registrada en el sistema
     * pre: El Scanner reader debe estar inicializado
     */
    public static void consultarCarta(){

        Carta consulta = memoria[0];

        System.out.println("La carta es: "+consulta.getNombre()
        +" - "+consulta.getPuntosVida()
        +" - "+consulta.getTipo());     
    }

   /**
     * Descripcion: Este metodo se encarga de preguntar al usuario los datos necesarios para modificar una carta en el sistema
     * pre: El Scanner reader debe estar inicializado
     */
    public static void modificarCarta(){
        
        reader.nextLine();
        System.out.println("Proporcione el nuevo tipo del Pokemon en la carta (Agua, Fuego, etc.)");
        String nuevoTipo = reader.nextLine();

        Carta consulta = memoria[0];
        consulta.setTipo(nuevoTipo);
        
    }

    /**
     * Descripcion: Este metodo se encarga de preguntar al usuario los datos necesarios para eliminar una carta en el sistema
     * pre: El Scanner reader debe estar inicializado
     */
    public static void eliminarCarta(){

        memoria[0]=null;

     
    }

    

}
