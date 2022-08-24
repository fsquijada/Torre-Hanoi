//Datos de los mejores jugadores
package torrehanoi;

import java.io.Serializable;


public class TopJugadores implements Serializable {
    private int discos, movimientos, tiempoInicial, tiempoFinal;
    private String nombreJugador;

    public TopJugadores(int discos, int movimientos, int tiempoInicial, int tiempoFinal, String nombreJugador) {
        this.discos = discos;
        this.movimientos = movimientos;
        this.tiempoInicial = tiempoInicial;
        this.tiempoFinal = tiempoFinal;
        this.nombreJugador = nombreJugador;
    }

    public int getDiscos() {
        return discos;
    }

    public int getMovimientos() {
        return movimientos;
    }

    public int getTiempoInicial() {
        return tiempoInicial;
    }

    public int getTiempoFinal() {
        return tiempoFinal;
    }

    public String getNombreJugador() {
        return nombreJugador;
    }

    public void setDiscos(int discos) {
        this.discos = discos;
    }

    public void setMovimientos(int movimientos) {
        this.movimientos = movimientos;
    }

    public void setTiempoInicial(int tiempoInicial) {
        this.tiempoInicial = tiempoInicial;
    }

    public void setTiempoFinal(int tiempoFinal) {
        this.tiempoFinal = tiempoFinal;
    }

    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }
        
    @Override
    public String toString (){
        return "Discos: " + this.discos + "\nNombre: " + this.nombreJugador + "\nMovimientos: " + this.movimientos + "\nTiempo Inicial: " + this.tiempoInicial + "\nTiempo Final: " + this.tiempoFinal;
    }
}
