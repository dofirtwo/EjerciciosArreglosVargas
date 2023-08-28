package ejercicio.pkg2;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String Nombre[] = new String[10];
        int Icfes[] = new int[10];
        for (int i = 0; i < 10; i++) {;
            boolean maximoPermitido = false;
            do {
                System.out.println("Ingrese su nombre");
                String nombre = teclado.next();
                System.out.println("Ingrese su puntaje de las ICFES");
                int Puntaje = teclado.nextInt();
                System.out.println("----------------------------------------------------------------");
                if (Puntaje <= 300) {
                    Icfes[i] = Puntaje;
                    Nombre[i] = nombre;
                    maximoPermitido = true;
                } else {
                    System.out.println("Puntaje Superior al permitido");
                    System.out.println("----------------------------------------------------------------");
                    teclado.nextLine();
                }
            } while (!maximoPermitido);
        }
        String estudiantePuntajeMaximo = Nombre[1];
        int MaximoPuntaje = Icfes[1];
        for (int i = 0; i < 10; i++) {
            if (Icfes[i] > MaximoPuntaje) {
                MaximoPuntaje = Icfes[i];
                estudiantePuntajeMaximo = Nombre[i];
            }
        }
        System.out.println("");
        System.out.println("El estudiante con mayor puntaje fue: " + estudiantePuntajeMaximo);
        System.out.println("El puntaje fue: " + MaximoPuntaje);
        System.out.println("----------------------------------------------------------------");
        System.out.println("");
        String estudiantePuntajeMenor = Nombre[1];
        int MenorPuntaje = Icfes[1];
        for (int i = 0; i < 10; i++) {
            if (Icfes[i] < MenorPuntaje) {
                MenorPuntaje = Icfes[i];
                estudiantePuntajeMenor = Nombre[i];
            }
        }
        System.out.println("El estudiante con menor puntaje fue: " + estudiantePuntajeMenor);
        System.out.println("El puntaje fue: " + MenorPuntaje);
        System.out.println("----------------------------------------------------------------");
        System.out.println("");
        double suma = 0;
        for (int i = 0; i < Icfes.length; i++) {
            suma = suma + Icfes[i];
        }
        double promedio = suma / Icfes.length;
        System.out.println("El promedio del puntaje de las ICFES es: " + promedio);
    }
}
