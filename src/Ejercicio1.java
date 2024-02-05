import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        System.out.println("Escribe numero:"); //Pregunta que escribas un numero
        numero = teclado.nextInt();
        System.out.println("El factorial de " + numero + " es: ");
        //Muestra los numeros cuya multiplicacion entre si dan el resultado esperado como factorial.
        for(int i = numero; i >= 1;i--){
            if(i != 1){
                System.out.print(i + " * ");
            }else {
                System.out.print(i + " = ");
            }
        }
        System.out.println(factorial(numero)); //imprime el valor del factorial que viene del metodo factorial().
    }
    public static int factorial(int n) {
        if (n == 0) { // Caso base
            return 1;
        } else{
            return n * factorial(n - 1);
        }
    }
}