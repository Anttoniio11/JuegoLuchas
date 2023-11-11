
package proyectoluchas;

public class Personaje {
    
    String nombre;
    int salud;
    int ataque;

    public Personaje(String nombre, int salud, int ataque) {
        this.nombre = nombre;
        this.salud = salud;
        this.ataque = ataque;
    }

    public void atacar(Personaje enemigo) {
        enemigo.salud = enemigo.salud - this.ataque;
        System.out.println(this.nombre + " ataca a " + enemigo.nombre + " y hace " + this.ataque + " puntos de daño.");
    }

    void usarHabilidad(Personaje jugador2) {
    }
    
}
