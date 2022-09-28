package conversiondetipo;

import java.util.Scanner;

public class ConversionDeTipo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Instancia una variable de la clase Scanner
        Scanner lectura = new Scanner(System.in);
        //Solicitamos por teclado el nº
        System.out.println("introduce el nº entero que quieres que muestre: ");
        //Convierto el String a tipo entero
        int entero = Integer.parseInt(lectura.nextLine());
        //Muestro el resultado por pantalla
        System.out.println("El entero que has teclado es: " +entero);
    }
    
}
