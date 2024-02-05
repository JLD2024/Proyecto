import java.util.Scanner;
import java.util.Vector;

public class Ejercicio3 {
    public static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {

        Vector vec = new Vector(5); //creamos un vector de tamano 5

        //bucle for para escribir los cinco numeros por teclado y añadirlos al vector
        for(int i=0;i<5;i++){
            System.out.print("Escribe numero: ");
            int numero = teclado.nextInt();
            vec.add(numero);
        }
        //bucle for para mostrar los numeros introducidos al vector anteriormente
        System.out.println("Mis numeros son:");
        for (int i = 0; i < vec.size(); i++) {
            System.out.println(vec.get(i));
        }

        int resultado = sumar(vec, 0, vec.size() - 1);

        // Mostrar el resultado
        System.out.println("La suma de los números en el Vector es: " + resultado);
    }

    // Función recursiva para sumar elementos en un rango específico del Vector
    private static int sumar(Vector<Integer> vec, int inicio, int fin) {
        if (inicio > fin) {
            return 0; // Caso base: si el inicio supera al fin, la suma es 0
        } else {
            // Caso recursivo: sumar el elemento actual y llamar a la función recursivamente
            return vec.get(inicio) + sumar(vec, inicio + 1, fin);
        }
    }
}

