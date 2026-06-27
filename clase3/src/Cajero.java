import java.util.Scanner;

public class Cajero {
    public static void main(String[] args) {
       /*
       Scanner sc = new Scanner(System.in);

        System.out.print("Subtotal de la cuenta: ");
        double subtotal = sc.nextDouble();

        if (subtotal >= 200000) {
            System.out.println("Descuento VIP aplicado");
        } else if (subtotal > 100000) {
            System.out.println("Descuento normal aplicado");
        } else {
            System.out.println("Sin descuento");
        }
        */
       Scanner sc = new Scanner(System.in);

        System.out.println("--- CAJERO ---");
        System.out.println("1. Nuevo pedido");
        System.out.println("2. Cerrar caja");
        System.out.print("Elige una opcion: ");

        int opcion = sc.nextInt();

        switch (opcion) {

            case 1:
                System.out.print("Subtotal: ");
                double subtotal = sc.nextDouble();
                if (subtotal > 100000) {
                    System.out.println("Pedido con descuento");
                } else {
                    System.out.println("Pedido sin descuento");
                }
                break;
            case 2:
                System.out.println("Caja cerrada");
                break;
            default:
                System.out.println("Opcion invalida");
            /*switch (opcion) {

            case 1 -> System.out.println("Nuevo pedido");

            case 2 -> System.out.println("Aplicar descuento");

            case 3 -> System.out.println("Cerrar caja");

            default -> System.out.println("Opcion invalida");

            }
            */
        }

    }
}

