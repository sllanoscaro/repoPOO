public class Jugador {
    private String nombre;
    private int numero;
    private String posicion;
    public Jugador() {
        DatosTXT data = new DatosTXT();
        String[][] jugadores = data.getMatrizJugadores();
        this.nombre = jugadores[0][1];
        this.numero = Integer.parseInt(jugadores[0][0]);
        this.posicion = jugadores[0][2];
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumero() {
        return numero;
    }

    public String getPosicion() {
        return posicion;
    }
}
