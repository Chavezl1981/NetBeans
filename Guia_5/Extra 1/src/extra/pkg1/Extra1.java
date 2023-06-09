/*
 Realizar un algoritmo que calcule la suma de todos los elementos de un 
vector de tamaño N, con los valores ingresados por el usuario.
 */

package extra.pkg1;

import java.util.Scanner;

/**
 *
 * @author arLuChavez
 */
public class Extra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
      int n;
      int suma = 0;

      System.out.print("Ingrese el tamaño del vector: ");
      n = leer.nextInt();

      int[] vector = new int[n];

      for (int i = 0; i < n; i++) {
         System.out.print("Ingrese el elemento " + (i+1) + " del vector: ");
         vector[i] = leer.nextInt();
         suma += vector[i];
      }

      System.out.println("La suma de los elementos del vector es: " + suma);
   }
}