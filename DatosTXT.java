import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DatosTXT {
    private String[][] matrizDatosSeleccion;
    private String[][] matrizDatosJugadores;

    public DatosTXT() {
        this.matrizDatosSeleccion = cargarDatosSelecciones("/home/sebastianll/Documents/intellij_IDEA/test/Datos/raw/teams.txt");
        this.matrizDatosJugadores = cargarDatosJugadores("/home/sebastianll/Documents/intellij_IDEA/test/Datos/raw/aus.txt");
    }

    public String[][] cargarDatosSelecciones(String rutaSelecciones) {
        try (BufferedReader lector = new BufferedReader(new FileReader(rutaSelecciones))) {
            String line;
            String[][] matrizDatosSeleccion = new String[4][4];
            int fila = 0;

            while ((line = lector.readLine()) != null && fila < 4) {
                String[] partes = line.split(";");

                System.arraycopy(partes, 0, matrizDatosSeleccion[fila], 0, partes.length);
                fila++;
            }
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    System.out.print(matrizDatosSeleccion[i][j] + " ");
                }
                System.out.println();
            }
            this.matrizDatosSeleccion = matrizDatosSeleccion;
        } catch (IOException e) {
            System.out.print("Se ha ingresado una dirección inválida o el archivo no está en el formato correcto." + e);
        }
        return matrizDatosSeleccion;
    }
    public String[][] cargarDatosJugadores(String rutaJugadores) {
        try (BufferedReader lector = new BufferedReader(new FileReader(rutaJugadores))) {
            String line;
            String[][] matrizDatosJugadores = new String[23][3];
            int fila = 0;

            while ((line = lector.readLine()) != null && fila < 23) {
                String[] partes = line.split(";");

                System.arraycopy(partes, 0, matrizDatosJugadores[fila], 0, partes.length);
                fila++;
            }
            for (int i = 0; i < 23; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(matrizDatosJugadores[i][j] + " ");
                }
                System.out.println();
            }
            this.matrizDatosJugadores = matrizDatosJugadores;
        } catch (IOException e) {
            System.out.print("Se ha ingresado una dirección inválida o el archivo no está en el formato correcto." + e);
        }
        return matrizDatosJugadores;
    }
    public String[][] getMatrizJugadores() {
        return matrizDatosJugadores;
    }
    public String[][] getMatrizSeleccion() {
        return matrizDatosSeleccion;
    }
}
