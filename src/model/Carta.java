package model;

public class Carta{

    //Atributos
    private String id; //Esto se referencia al usar this
    private String nombre;
    private int puntosVida;
    private String tipo;
    private String rareza;

    //Comportamientos - Metodos
                    //A12
    public Carta(String id, String nombre, int puntosVida, String tipo, String rareza){

        this.id = id;
        this.nombre = nombre;
        this.puntosVida = puntosVida;
        this.tipo = tipo;
        this.rareza = rareza;

    }

    //Modificador
    public void setId(String id){
        this.id = id;
    }

    //Analizador
    public String getId(){
        return id;
    }

     //Modificador
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    //Analizador
    public String getNombre(){
        return nombre;
    }

      //Modificador
    public void setPuntosVida(int puntosVida){
        this.puntosVida = puntosVida;
    }

    //Analizador
    public int getPuntosVida(){
        return puntosVida;
    }

   //Modificador
    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    //Analizador
    public String getTipo(){
        return tipo;
    }







}