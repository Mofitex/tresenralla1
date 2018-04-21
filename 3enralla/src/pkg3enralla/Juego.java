/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3enralla;

/**
 *
 * @author Mofitex
 */
public class Juego {
    private Tablero tablero;

    public Juego(Tablero tablero) {
        this.tablero = tablero;
    }
    
    
    public boolean GameOver(){
        if(Tablerofull()==true){
            return true;
        }
        if(someoneWon()==true){
            return true;
        }  
        return false;
    }
    
    
    private boolean Tablerofull() {
        boolean isFull = true;
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                Posicion pos = new Posicion(x, y);
                if (tablero.getCasillas(pos).esBlanca()) {
                    isFull = false;
                } 
            }
        }
        return isFull;
    }
    
    private boolean someoneWon(){
        if(columna()==true){
            return true;
        }
        if(fila()==true){
            return true;
        }
        /*
        if(diagonal==true){
            return true;
        }
        */
        return false;
    }
    
    private boolean columna(){
        boolean columna = true;
        char aux;
        for (int x = 0; x < 3; x++) {
            Posicion p = new Posicion(x,0);
            aux = tablero.getCasillas(p).getFicha();
             for (int y = 0; y < 3; y++) {
                 Posicion p2 = new Posicion(x,y);
                 if(tablero.getCasillas(p2).getFicha()!=aux){
                     columna=false;
                 }  
            }
            if(columna){
                return columna;
            }
        }
       return false;
    }
    
    private boolean fila(){
        boolean fila = true;
        char aux;
        for (int y = 0; y < 3; y++) {
            Posicion p = new Posicion(0,y);
            aux = tablero.getCasillas(p).getFicha();
            for (int x = 0; x < 3; x++) {
                Posicion p2 = new Posicion(x,y);
                if(tablero.getCasillas(p2).getFicha()!=aux){
                    fila=false;
                }
            }
            if(fila){
                return fila;
            }
        }
        return false;
    }
}
