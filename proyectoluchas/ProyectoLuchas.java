
package proyectoluchas;

import java.util.Scanner;

public class ProyectoLuchas {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Jugador 1, elige un personaje: (1: Humano, 2: LuchadorY, 3: LuchadorX, 4: Enano, 5: Mago):");
        int seleccionJugador1 = sc.nextInt();

        System.out.println("Jugador 2, elige un personaje: (1: Humano, 2: LuchadorY, 3: LuchadorX, 4: Enano, 5: Mago):");
        int seleccionJugador2 = sc.nextInt();

        //(String nombre, int salud, int ataque)
        Personaje jugador1;
        Personaje jugador2;

        switch (seleccionJugador1) {
            case 1:
                jugador1 = new Humano("Humano 1");
                break;
            case 2:
                jugador1 = new LuchadorY("Elfo 1");
                break;
            case 3:
                jugador1 = new LuchadorX("Orco 1");
                break;
            case 4:
                jugador1 = new Enano("Enano 1");
                break;
            case 5:
                jugador1 = new Mago("Mago 1");
                break;
            default:
                System.out.println("Seleccione un personaje correcto");
                return;
        }

        switch (seleccionJugador2) {
            case 1:
                jugador2 = new Humano("Humano 2");
                break;
            case 2:
                jugador2 = new LuchadorY("Elfo 2");
                break;
            case 3:
                jugador2 = new LuchadorX("Orco 2");
                break;
            case 4:
                jugador2 = new Enano("Enano 2");
                break;
            case 5:
                jugador2 = new Mago("Mago 2");
                break;
            default:
                System.out.println("Seleccione un personaje correcto");
                return;
        }

        System.out.println("PELEAAAAAAAAA");

        while (jugador1.salud > 0 && jugador2.salud > 0) {

            System.out.println("Turno de " + jugador1.nombre);
            
            jugador1.atacar(jugador2);
            jugador1.usarHabilidad(jugador2);

            System.out.println("Turno de " + jugador2.nombre);
            
            jugador2.atacar(jugador1);
            jugador2.usarHabilidad(jugador1);

            System.out.println("Salud de " + jugador1.nombre + ": " + jugador1.salud);
            System.out.println("Salud de " + jugador2.nombre + ": " + jugador2.salud);
        }

        if (jugador1.salud <= 0) {
            System.out.println(jugador2.nombre + " gana la partida.");
        } else {
            System.out.println(jugador1.nombre + " gana la partida.");
        }

    }
}
