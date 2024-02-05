import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String palabra;
        System.out.println("Escribe una frase:");
        palabra = teclado.nextLine();
        System.out.println(reverse(palabra));
    }
    public static String reverse(String palabra) {
        if (palabra.length() == 1)
            return palabra;
        else
            return reverse(palabra.substring(1)) + palabra.charAt(0);
    }
}
