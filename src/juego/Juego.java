/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package juego;

import java.util.Scanner;

public class Juego {

    public static void main(String[] args) {
        heroe luigi = new heroe("luigi");
        Scanner lector = new Scanner(System.in);
        char tecla;

        do {
            System.out.println("a. salta");
            System.out.println("s. avanza");
            System.out.println("z. salir");
            tecla = lector.next().charAt(0);
            tecla = Character.toLowerCase(tecla);

            switch (tecla) {

                case 'a':
                 luigi.saltar();
                    break;

                case 's':
                    luigi.avanzar();
                    break;

                case 'z':
                    System.out.println(" saldrá del juego en breves"); 
                    break;
                    
                default:
                    System.out.println("no se reconoce la acción");

            
            }
            if (luigi.getvida() <= 0) {
                System.out.println(luigi.getnombre() + " pierde");
                tecla = 'z'; 

            }

        }while (tecla != 'z');
            System.out.println(" game over!!!");
            
        }
        }

