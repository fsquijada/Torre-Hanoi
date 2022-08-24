//Juego de Torre de Hanoi
package torrehanoi;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class TorreHanoi {
    
    public static VentanaConfiguracion config = new VentanaConfiguracion();
    public static VentanaTopJugadores topJugadores = new VentanaTopJugadores();
    public static VentanaJuegoAutomatico juegoAutomatico = new VentanaJuegoAutomatico();
    public static VentanaJuego juego = new VentanaJuego();
    public static VentanaJuegoTerminado finJuego = new VentanaJuegoTerminado();
    public static VentanaInicio menu = new VentanaInicio();
    //Datos de matrices del juego
    public static int matrizJuego [][] = new int [7][3]; //Matriz del juego
    public static int matrizFinal [][] = new int [7][3]; //Matriz objetivo final del juego
    //Datos de top de jugadores
    static public TopJugadores jugadores [] = new TopJugadores[6];
    static public int contJugadores = 0;
    
    public static void main(String[] args) {
        LeerJugadores("top/Top 5 jugadores.dat"); //Primero que lea el archivo
        ConteoJugadores(); //Que haga el conteo del top de jugadores
        VentanaJuegoTerminado.LlenadoTopJugadores(); //Que los llene en la ventana del Top 5
    }
    
    static public void SerializarJugadores (Object arreglo [], String ruta){ //Método para guardar a los jugadores
        try {
            ObjectOutputStream escribirArchivo = new ObjectOutputStream(new FileOutputStream(ruta));
            escribirArchivo.writeObject(arreglo);
            escribirArchivo.close ();
        } catch (Exception e) {
            System.out.println("Ocurrió un error al guardar el documento");
            e.printStackTrace();
        }
    }
    
    static Object [] LeerJugadores (String ruta) { //Método para leer el documento de los mejores jugadores
        try {
            ObjectInputStream leerArchivoSerializado = new ObjectInputStream(new FileInputStream(ruta));
            Object archivoRecuperado [] = (Object []) leerArchivoSerializado.readObject();
            leerArchivoSerializado.close();
            jugadores = (TopJugadores []) archivoRecuperado;
        } catch (Exception e) {
            
        }
        return null;
    }
    
    static void ConteoJugadores () {
        for (TopJugadores jugador : jugadores) {
            if (jugador != null){
                if (TorreHanoi.contJugadores < 5){ //Esto es para asegurar que guarde el ultimo jugador en la posicion 6 del arreglo
                    TorreHanoi.contJugadores++;
                }
            }
        }
    }
    
}
