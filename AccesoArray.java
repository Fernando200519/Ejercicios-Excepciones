// Descripción: Crear un programa que permita acceder a posiciones de un array según la entrada del usuario, 
//              manejando la excepción de índice fuera de rango.

// Entrada: Un número entero que representa la posición del array a la que se desea acceder.
// Salida: El valor en esa posición o un mensaje de error si la posición está fuera de los límites del array.

import java.util.Scanner;

public class AccesoArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int values[];

        System.out.print("Digite el tamaño del array: ");
        int size = input.nextInt();
        values = new int[size];

        for(int i = 0; i < size; i++){
            System.out.print("Digite el valor para la posicion " + (i + 1) + ": ");
            values[i] = input.nextInt();
        }

        System.out.print("Digite la posicion del array: ");
        try {
            int position = input.nextInt();
            System.out.println("El valor es " + values[position - 1]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("La posicion del array no existe");
        }
        
        input.close();
    }
}
