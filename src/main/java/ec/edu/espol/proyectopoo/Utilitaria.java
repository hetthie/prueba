/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.proyectopoo;
import java.util.ArrayList;
import java.util.Random;
/**
 *
 * @author seoklie
 */
public class Utilitaria {
    public static ArrayList<Ficha> crearManoJugador(){
        Random random = new Random();
        ArrayList<Ficha> mano = new ArrayList<>();
        while (mano.size()<6){
            int l1 = random.nextInt(6)+1;
            int l2 = random.nextInt(6)+1;
            Ficha f = new Ficha(l1,l2);
            mano.add(f);
        }
        return mano;
    }
}
