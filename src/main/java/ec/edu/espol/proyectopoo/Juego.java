/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.proyectopoo;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author seoklie
 */
public class Juego {
    private ArrayList<Ficha> lineaJuego;
    private ArrayList<Jugador> jugadores;

    public Juego(ArrayList<Ficha> lineaJuego, ArrayList<Jugador> jugadores) {
        this.lineaJuego = lineaJuego;
        this.jugadores = jugadores;
    }
    public void agregarJugador(String nombre){
        Jugador j1 = new Jugador(nombre,Utilitaria.crearManoJugador());
    }
    public int obtenerValorInicioLinea(){
        Ficha f= lineaJuego.get(0);
        int l1= f.getLado1();
        return l1;
    }
    public int obtenerValorFinLinea(){
        Ficha f= lineaJuego.get(lineaJuego.size()-1);
        int l2= f.getLado2();
        return l2;
    }
    public void mostrarLinea(){
        for(Ficha ficha : lineaJuego){
            System.out.println(ficha.toString());
        }
    }
    public boolean agregarFichaLinea(Ficha f, Jugador j){
        Scanner s1 = new Scanner(System.in);
        if(!(f instanceof FichaComodin)){
            if(lineaJuego.isEmpty()){
                lineaJuego.add(f);
            }
            else if(f.getLado2()==this.obtenerValorInicioLinea() || f.getLado1()==this.obtenerValorFinLinea()){
                lineaJuego.add(f);
                j.getMano().remove(f); //no entiendo lo de "posicion"
            }
        }
        else{
            if(lineaJuego.isEmpty()){
                lineaJuego.add(f);
                System.out.println("Ingrese el nuevo valor de lado1: ");
                int l1 = s1.nextInt();
                System.out.println("Ingrese el valor del lado2: ");
                int l2 = s1.nextInt();
                f.setLado1(l1);
                f.setLado2(l2);
            }
            else{
                System.out.println("Quiere agregar en inicio (i) o fin (f).");
                String opcion = s1.next();
                if (opcion.toLowerCase().equals('i')){
                    lineaJuego.add(0,f);
                    System.out.println("Ingrese el lado1: ");
                    int l1 = s1.nextInt();
                    f.setLado1(l1);
                }
                else if(opcion.toLowerCase().equals('f')){
                    lineaJuego.add(lineaJuego.size()-1,f);
                    System.out.println("Ingrese el lado2: ");
                    int l2 = s1.nextInt();
                    f.setLado1(l2);
                }
            }
    }
        return false;
}
}
