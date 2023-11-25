/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.proyectopoo;
import java.util.ArrayList;
/**
 *
 * @author seoklie
 */
public class Jugador {
    private String nombre;
    private ArrayList<Ficha> mano;
    
    public Jugador(String nombre, ArrayList<Ficha> mano){
        Jugador j1 = new Jugador(nombre,mano);
    }
    public Ficha getFicha(int indice){
        Ficha f1 = mano.get(indice);
        return f1;
    }

    public ArrayList<Ficha> getMano() {
        return mano;
    }
    public void removerFicha(Ficha f){
        int i=-1;
        while(!mano.get(i).equals(f)){
            i+=1;
        }
        mano.remove(i);
    }
    public String getNombre(){
        return nombre;
    }
    public void imprimirMano(){
        for (Ficha ficha : mano){
            System.out.println(ficha.toString() + "-");
        }
    }
}

