/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juego;

/**
 *
 * @author Usuario
 */
public class heroe {

    private String nombre;
    private int vida;
    private boolean saltando;
    private int x;

    public heroe(String nombre) {
        this.nombre = nombre;
        this.vida = 3;
        this.x = 0;
        this.saltando = false;

    }

    public String getnombre() {
        return nombre;
    }

    public int getvida() {
        return vida;
    }
    public int getx(){
    return x;
    }

    public void avanzar() {
        if (!saltando) {
            x += 1;
            System.out.println(nombre + " avanza a la posicion " + x);
            if (x != 0 && saltando) {
                System.out.println(nombre + "  avanza ");
            }

            if (x % 10 == 0 && saltando) {
                System.out.println("enemigo esquivado");
                this.saltando = false;

            } else {
                System.out.println(nombre + "avanza");
            }
        }

    }

    public void saltar() {
        this.saltando = true;
    }
}
