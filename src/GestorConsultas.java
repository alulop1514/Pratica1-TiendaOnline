import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.stream.Stream;

public class GestorConsultas {
    private RandomAccessFile stream;




    private void crearFichero(String nombreFichero) {
        File fichero = new File("hola.txt");
        if (fichero.exists()) {
            try {
                stream = new RandomAccessFile(nombreFichero, "rw");
            } catch (FileNotFoundException e) {
                System.out.println("Error al abir el fichero");
            }
        } else {
            try {
                fichero.createNewFile();
                stream
            } catch (IOException e) {
                System.out.println("Error al crear el fichero");
            }
        }
    }
    public void cierraGestor() {
        try {
            stream.close();
        } catch (IOException ex) {
            System.out.println("Error al cerrar el fichero");
        }
    }
}
