package ejercicio.pkg2;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double EstaturaYPeso[][] = new double[5][2];
        int cantidadPersonas = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese su Estutura: ");
            EstaturaYPeso[i][0] = Double.parseDouble(teclado.nextLine());
            System.out.println("Ingrese su Peso: ");
            EstaturaYPeso[i][1] = Double.parseDouble(teclado.nextLine());
            if ((EstaturaYPeso[i][0] < 1.70) && (EstaturaYPeso[i][1] < 70)) {
                cantidadPersonas++;
            }
        }
        double sumaEstatura = 0;
        double sumaPeso = 0;
        for (int i = 0; i < EstaturaYPeso.length; i++) {
            sumaEstatura = sumaEstatura + EstaturaYPeso[i][0];
            sumaPeso = sumaPeso + EstaturaYPeso[i][1];
        }
        double promedioEst = sumaEstatura / EstaturaYPeso.length;
        double promedioPes = sumaPeso / EstaturaYPeso.length;
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("Las Pesonas que miden menos de 1.70 y cuyo peso es menor a 70 kilos son: " + cantidadPersonas);
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("El promedio de la estatura es: " + promedioEst + " y el promedio del peso es: " + promedioPes);
    }

}
