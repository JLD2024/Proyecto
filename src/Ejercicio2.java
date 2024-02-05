import java.util.Scanner;

public class Ejercicio2 {
    public  static  Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Introduce la tabla que quieres mostrar: ");
        int tabla = teclado.nextInt();
        System.out.print("Introduce el número de multiplicadores: ");
        int numVeces = teclado.nextInt();
        teclado.close();
        System.out.println("\n\tTabla del " + tabla);
        System.out.println("****************************\n");
        multiplicar(tabla, numVeces);
    }
    public static void multiplicar(int tabla, int numVeces) {
        if (numVeces > 1) {
            multiplicar(tabla, numVeces - 1);
        }
        System.out.println("\t" + tabla + " x " + numVeces + " = " + (tabla * numVeces));
    }

}










