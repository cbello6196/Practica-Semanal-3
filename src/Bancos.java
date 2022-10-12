
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class Bancos {

    Queue<Cliente> clientes = new LinkedList<>();

    public void agregar() {
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese nombre:");
        String nombre = s.nextLine();
        System.out.println("Ingrese cedula:");
        String cedula = s.nextLine();
        System.out.println("Discapacitado? (Si/No)");
        String dis = s.nextLine();
        boolean disa;
        if (dis.equalsIgnoreCase("si")) {
            disa = true;
        } else if (dis.equalsIgnoreCase("no")) {
            disa = false;
        } else {
            System.out.println("Opcion no valida");
            return;
        }
        clientes.add(new Cliente(nombre, cedula, disa));
        if (disa) {
            Cliente temp = clientes.poll();
            clientes.add(temp);
        }
    }
    
    public void atender() {
        if (clientes.isEmpty()) {
            System.out.println("No hay clientes");
            return;
        }
        System.out.println("Atendiendo a: " + clientes.poll());
    }

    public void verClientes() {
        if (clientes.isEmpty()) {
            System.out.println("No hay clientes");
            return;
        }
        for (Cliente c : clientes) {
            System.out.println(c);
        }
    }

}

