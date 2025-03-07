// Descripción: Crear una excepción personalizada llamada EdadInvalidaException y un programa 
//              que valide la edad de un usuario, lanzando dicha excepción si la edad está fuera del rango permitido (1-120).
// Entrada: Un número entero que representa la edad.
// Salida: Confirmación de edad válida o mensaje detallado del error si la edad es inválida.

package ejercicio_4;

import java.util.Scanner;

public class ValidadorEdad {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite su edad: ");
        int edad = input.nextInt();

        try{
            validarEdad(edad);
        }catch(EdadInvalidaException e){
            System.out.println("Error: " + e.getMessage());
        }

        input.close();
    }

    public static void validarEdad(int edad) throws EdadInvalidaException{
        if(edad <= 120 && edad >= 1){
            System.out.println("La edad es valida");
        }else{
            throw new EdadInvalidaException("La edad no es valida..");
        }
    }
}
