
//Autores
//Carlos Esteban Bello Salinas,
//Nahun David Castro Vega

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Bancos b = new Bancos();
        while (true) {
            System.out.println("\nIngrese una opcion:");
            System.out.println("1.Agregar Cliente");
            System.out.println("2. Atender Cliente");
            System.out.println("3. Ver Clientes");
            System.out.println("4. Salir");
            int opcion = s.nextInt();
            switch (opcion) {
                case 1:
                    b.agregar();
                    break;
                case 2:
                    b.atender();
                    break;
                case 3:
                    b.verClientes();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Opcion no valida");
            }

        }

    }
}   
