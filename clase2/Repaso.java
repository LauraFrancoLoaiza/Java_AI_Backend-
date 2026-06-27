
import jdk.jshell.spi.ExecutionControl;

/*class Repaso {
    static void main (String[] args){
    String nombre = "Laura";
    int edad = 51;
    double estatura = 1.66;

    System.out.println("Nombre: " + nombre);
    System.out.println("Edad: " + edad);
    System.out.println("Estatura: " + estatura);
    }
}
*/

/*class Repaso {
   public static void main(String[] args) {
    
   
    final double IVA = 0.19;

    final int DIAS_SEMANA = 7;

    System.out.println("Iva "+ IVA);
    System.out.println("Dias de la semana: " + DIAS_SEMANA);
   }
}
*/

import java.util.Scanner;

public class Operaciones {

    public static void main(String[] args) {

        int a;
        int b;

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese a");
        a = input.nextInt();

        System.out.println("Ingrese b");
        b = input.nextInt();

        input.close();

        int suma = a + b;
        int resta = a - b;
        int multiplicacion = a * b;
        double division = (double)a / b;

        System.out.println("La suma de " + a + " y " + b + " es: " + suma);
        System.out.println("La resta de " + a + " y " + b + " es: " + resta);
        System.out.println("El producto de " + a + " y " + b + " es: " + multiplicacion);
        System.out.println("El cociente de " + a + " entre " + b + " es: " + division);

    }

}