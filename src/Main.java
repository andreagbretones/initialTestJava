import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    private static BufferedReader br;
    static ArrayList<Disco> discos = new ArrayList<>();

    public static void main(String[] args) throws IOException {

        int opcion;

        do {
            System.out.println("_______MENÚ_______");
            System.out.println("");
            System.out.println("1.Añade un disco a la colección.");
            System.out.println("2.Modificar disco.");
            System.out.println("3.Eliminar disco.");
            System.out.println("4.Mostrar discos.");
            System.out.println("5.Salir.");
            System.out.println("");
            System.out.println("Elige una opcion: ");

            br = new BufferedReader(new InputStreamReader(System.in));
            opcion = Integer.parseInt(br.readLine());
            switch (opcion) {
                case 1:
                    addDisco();
                    break;
                case 2:
                    modificarDisco();
                    break;
                case 3:
                    eliminarDisco();
                    break;
                case 4:
                    mostrarinfoDisco();
                    break;
                case 5:
                    System.out.println("Hasta pronto.");
                    break;
                default:
                    System.out.println("Opción incorrecta.");

            }

        } while (opcion != 5);
    }

    public static void addDisco() throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));

        Disco disco = newDisco();

        discos.add(disco);
        System.out.println("Disco guardado.");
        System.out.println();

    }

    public static void eliminarDisco() throws IOException {

        mostrarinfoDisco();
        int opcion;
        System.out.println("Elige el disco que quieres eliminar: ");

        br = new BufferedReader(new InputStreamReader(System.in));
        opcion = Integer.parseInt(br.readLine());
        Disco discoSeleccionado = discos.get(opcion - 1);
        discos.remove(discoSeleccionado);
        System.out.println("Disco eliminado.");
    }

    public static void modificarDisco() throws IOException {

        mostrarDisco();
        int opcion;
        System.out.println("Elige el disco que quieres modificar: ");

        br = new BufferedReader(new InputStreamReader(System.in));
        opcion = Integer.parseInt(br.readLine());

        Disco discoSeleccionado = discos.get(opcion - 1);
        System.out.println("Titulo: " + discoSeleccionado.getTitulo() +
                ". Artista: " + discoSeleccionado.getArtista() + ". Número de temas: " +
                discoSeleccionado.getNumTemas() + ". Duracion: " + discoSeleccionado.getDuracion());

        discos.set(opcion-1,newDisco());

    }

    public static void mostrarinfoDisco() throws IOException {
        int i = 0;
        for (Disco disco : discos) {
            i++;
            System.out.println(i + ". Titulo: " + disco.getTitulo() + ". Artista: " + disco.getArtista() + ". Número de temas: " + disco.getNumTemas() + ". Duracion: " + disco.getDuracion());
        }
    }

    public static void mostrarDisco() throws IOException {
        int i = 0;
        for (Disco disco : discos) {
            i++;
            System.out.println(i + ". Titulo: " + disco.getTitulo());

        }
    }

    private static Disco newDisco() throws IOException {
        System.out.println("Introduce el título: ");
        String titulo = br.readLine();
        System.out.println("Introduce el artista: ");
        String artista = br.readLine();
        System.out.println("Introduce el número de temas: ");
        int numTemas = Integer.parseInt(br.readLine());
        System.out.println("Introduce la duración: ");
        float duracion = Float.parseFloat(br.readLine());

        return new Disco(titulo, artista, numTemas, duracion);
    }


}
