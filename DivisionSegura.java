// Crear un programa que solicite al usuario dos números y realice una división, manejando la excepción de división por cero.

// Entrada: Dos números enteros ingresados por el usuario.
// Salida: El resultado de la división o un mensaje de error si el segundo número es cero.

import java.util.Scanner;

public class DivisionSegura{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el numero 1: ");
        int x = entrada.nextInt();

        System.out.print("Ingrese el numero 2: ");
        int y = entrada.nextInt();

        try {
            int resultado = x/y;
            System.out.println("El resultado es: " + resultado);
        } catch (ArithmeticException ae) {
            System.out.println("No puede dividirse por cero");
        }

        entrada.close();
        
    }
}