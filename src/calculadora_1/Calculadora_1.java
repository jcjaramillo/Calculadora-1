//calculadora sencilla sin GUI
package calculadora_1;
//IMPORTACION PARA CLASE SCANNER

import java.util.Scanner;

/**
 *
 * @author jcarl
 */
public class Calculadora_1 {

    public static void main(String[] args) {
        // TODO code application logic here
        //LECTURA DE DATOS ENTRADA
        Scanner sc = new Scanner(System.in);
        //VARIABLES
        int numero1, numero2, opcion;
        //LECTURA DE NUMEROS
        do {
            System.out.println("Ingrese numero 1 : ");
            numero1 = sc.nextInt();
            System.out.println("Ingrese numero 2 : ");
            numero2 = sc.nextInt();

            //MENU (se repite con un do while mientras este dentro de las opciones)
            do {
                System.out.println("1.- Sumar");
                System.out.println("2.- Restar");
                System.out.println("3.- Multiplicar");
                System.out.println("4.- Dividir");
                System.out.println("5.- Salir");
                System.out.println("\nIngrese una opcion: ");
                opcion = sc.nextInt();
            } while (opcion < 1 || opcion > 5);
            switch (opcion) {
                case 1:
                    System.out.println(numero1 + numero2);
                    break;
                case 2:
                    System.out.println(numero1 - numero2);
                    break;
                case 3:
                    System.out.println(numero1 * numero2);
                    break;
                case 4:
                    System.out.println(numero1 / numero2);
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Gracias");
            }
        } while (opcion != 5);
    }

}
