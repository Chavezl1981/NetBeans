/*
 2. Crear un programa que pida una frase y si esa frase es igual a “eureka” el
 programa pondrá un mensaje de Correcto, sino mostrará un mensaje de
 Incorrecto. Nota: investigar la función equals() en Java.
 */

package ejercicio.pkg2;

import java.util.Scanner;

/**
 *
 * @author arLuChavez
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String frase = input.nextLine();
        if (frase.equals("eureka")) {
            System.out.println("Correcto");

        } else {
            System.out.println("Incorrecto");
        }

    }

}