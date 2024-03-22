package Logica;

import java.util.Scanner;

public class Gestion {

    private static String Combate;

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Piloto p1 = new Piloto(1, "Pete Maverick", 10.000, "capitán");
        Piloto p2 = new Piloto(2, "Natasha Phoenix", 3.000, "teniente");
        Piloto p3 = new Piloto(3, "Bradley Rooster", 3.500, "teniente");
        Piloto p4 = new Piloto();
        Piloto p5 = new Piloto();

        Avion a1 = new Avion(1, "Combate", 1, p1.nomPiloto);
        Avion a2 = new Avion(2, "Entrenamiento", 2, p2.nomPiloto);
        Avion a3 = new Avion(3, "Combate", 1, p3.nomPiloto);
        Avion a4 = new Avion();
        Avion a5 = new Avion();

        System.out.println("Ingrese el ID del piloto");
        p4.idPiloto = teclado.nextInt();
        System.out.println("Ingrese el Nombre del piloto");
        p4.nomPiloto = teclado.next();
        System.out.println("Ingrese las horas de vuelo");
        p4.horasVueloPiloto = teclado.nextDouble();
        System.out.println("Ingrese el rango del piloto");
        p4.rangoPiloto = teclado.next();

        System.out.println(" ");
        System.out.println("Ingrese el ID del piloto");
        p5.idPiloto = teclado.nextInt();
        System.out.println("Ingrese el Nombre del piloto");
        p5.nomPiloto = teclado.next();
        System.out.println("Ingrese las horas de vuelo");
        p5.horasVueloPiloto = teclado.nextDouble();
        System.out.println("Ingrese el rango del piloto");
        p5.rangoPiloto = teclado.next();

        p1.mostrarPiloto();
        p3.mostrarPiloto();
        p4.mostrarPiloto();
        p5.mostrarPiloto();

        System.out.println(" ");
        System.out.println("Ingrese el ID del avion");
        a4.idAvion = teclado.nextInt();
        System.out.println("Modelo del avion");
        a4.modAvion = "Entrenamiento";
        System.out.println("Capacidad del avion");
        a4.capAvion = 2;
        System.out.println("Nombre del piloto asignado");
        a4.Piloto = teclado.next();

        System.out.println(" ");
        System.out.println("Ingrese el ID del avion");
        a5.idAvion = teclado.nextInt();
        System.out.println("Modelo del avion");
        a5.modAvion = "Entrenamiento";
        System.out.println("Capacidad del avion");
        a5.capAvion = 2;
        System.out.println("Nombre del piloto asignado");
        a5.Piloto = teclado.next();
        
        a1.mostrarAvion();
        a2.mostrarAvion();
        a3.mostrarAvion();
        a4.mostrarAvion();
        a5.mostrarAvion();
        
        
    }
}
