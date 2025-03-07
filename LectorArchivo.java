// Descripción: Crear un programa que lea un archivo de texto cuyo nombre es proporcionado por el usuario, 
//              manejando las excepciones relacionadas con la apertura y lectura de archivos.
// Entrada: Nombre del archivo a leer.
// Salida: Contenido del archivo o mensajes de error específicos según el tipo de 
//         excepción (archivo no encontrado, problemas de permisos, etc.).

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class LectorArchivo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        BufferedReader lector;

        System.out.print("Ingrese el nombre del archivo: ");
        String nombreArchivo = input.nextLine();

        try {
            FileReader archivo = new FileReader(nombreArchivo);
            if(archivo.ready()){
                lector = new BufferedReader(archivo);
                String cadena;
                while((cadena = lector.readLine()) != null){
                    System.out.println(cadena);
                }
            }else{
                System.out.println("El archivo esta vacio");
            }
        } catch (FileNotFoundException fe) {
            System.out.println("Error: " + fe.getMessage());
        } catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }

        input.close();
    }
}
