import java.util.Scanner;

public class Factura {

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
       
        String nombreCliente;
        int valorCompra;

       
        System.out.println("Ingrese el nombre: ");
        nombreCliente = scanner.nextLine();

        
        System.out.println("Ingrese el valor de la compra: ");
        
        valorCompra = scanner.nextInt();


        int descuento = 0;
       
        if (valorCompra >= 200000) {

            descuento = (int) (valorCompra * 0.15);
            
        } else if (valorCompra >= 50000) {
           
            descuento = (int) (valorCompra * 0.02);

        } else if (valorCompra >= 20000) {
            
            descuento = (int) (valorCompra * 0.015);

        } else if (valorCompra < 20000) {
            descuento = 0;
            
        }

      
       
        int total = valorCompra - descuento;

        
        System.out.println("_____________________________________");
        System.out.println("                                     ");
        System.out.println("         Factura Restaurante         ");
        System.out.println("_____________________________________");
        System.out.println("                                     ");
        System.out.println("Cliente: " + nombreCliente);
        System.out.println("Valor total: $" + valorCompra);
        System.out.println("Descuento: $" + descuento);
        System.out.println("Total a pagar: $" + total);
        System.out.println("_____________________________________");
        System.out.println("                                     ");
        System.out.println("         Gracias por la compra       ");
        System.out.println("_____________________________________");
        
    }
}







