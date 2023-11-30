
public class Seleccion {
    private String nombre;
    private int ranking;

    public Seleccion() {
        DatosTXT data = new DatosTXT();
        String[][] selecciones = data.getMatrizSeleccion();
        this.nombre = selecciones[0][1];
        this.ranking = Integer.parseInt(selecciones[0][2]);
    }
    public String getNombre() {
        return nombre;
    }
    public int getRanking() {
        return ranking;
    }
}
