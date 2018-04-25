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
    private char fichaGanadora;
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
    
    public char whoWon(){
        if(someoneWon()==true){
            return fichaGanadora;
        }
        return ' ';
    }
    
    private boolean Tablerofull() {
        boolean isFull = true;
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                Posicion pos = new Posicion(x, y);
                if (tablero.getCasillas(x,y).esBlanca()) {
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
        if(diagonal()==true){
            return true;
        }
        return false;
    }
    
    private boolean columna(){
        boolean columna;
        char aux;
        for (int x = 0; x < 3; x++) {
            columna=true;
            aux = tablero.getCasillas(x,0).getFicha();
            if(aux==' '){
                columna=false;
            }
             for (int y = 0; y < 3; y++) {
                 
                 if(tablero.getCasillas(x,y).getFicha()!=aux){
                     columna=false;
                 }  
            }
            if(columna){
                this.fichaGanadora = aux;
                return columna;
            }
        }
       return false;
    }
    
    private boolean fila(){
        boolean fila;
        char aux;
        for (int y = 0; y < 3; y++) {
            fila=true;
            Posicion p = new Posicion(0,y);
            aux = tablero.getCasillas(0,y).getFicha();
            if(aux==' '){
                fila=false;
            }
            for (int x = 0; x < 3; x++) {
                Posicion p2 = new Posicion(x,y);
                if(tablero.getCasillas(x,y).getFicha()!=aux){
                    fila=false;
                }
            }
            if(fila){
                this.fichaGanadora = aux;
                return fila;
            }
        }
        return false;
    }
    
    private boolean diagonal(){
        if(diagonalLeft()==true){
            return true;
        }
        if(diagonalRight()==true){
            return true;
        }
        return false;
    }
    
    private boolean diagonalLeft(){
        if(tablero.getCasillas(0,0).getFicha()=='x'&&tablero.getCasillas(1,1).getFicha()=='x'&&tablero.getCasillas(2,2).getFicha()=='x'){
            this.fichaGanadora = 'x';
            return true;
        }
        if(tablero.getCasillas(0,0).getFicha()=='o'&&tablero.getCasillas(1,1).getFicha()=='o'&&tablero.getCasillas(2,2).getFicha()=='o'){
            this.fichaGanadora = 'o';
            return true;
        }
        return false;
    }
    private boolean diagonalRight(){
        if(tablero.getCasillas(2,0).getFicha()=='x'&&tablero.getCasillas(1,1).getFicha()=='x'&&tablero.getCasillas(0,2).getFicha()=='x'){
            this.fichaGanadora = 'x';
            return true;
        }
         if(tablero.getCasillas(2,0).getFicha()=='o'&&tablero.getCasillas(1,1).getFicha()=='o'&&tablero.getCasillas(0,2).getFicha()=='o'){
             this.fichaGanadora = 'o';
             return true;
        }
        return false;
    }
}
