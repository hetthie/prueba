/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espol.proyectopoo;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
/**
 *
 * @author seoklie
 */
public class ProyectoPOO {
    

    public static void main(String[] args) {
        // iniciamlizamos
        
        ArrayList<Ficha> linea= Utilitaria.crearManoJugador();
        ArrayList<Jugador> jug = new ArrayList<>();
        Juego juego = new Juego(linea, jug);
        
        
        Scanner s1 = new Scanner(System.in);
        System.out.println("Ingrese nombre del jugador 1: ");
        String j1 = s1.next();
        System.out.println("Ingrese nombre del jugador 2: ");
        String j2 = s1.next();
        juego.agregarJugador(j1);
        juego.agregarJugador(j2);
        
        System.out.println(juego
        
        
        
        
        
    }
}
