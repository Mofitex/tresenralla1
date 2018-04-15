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
public class Tablero {
    private Casilla [][] casillas;

    public Tablero() {
        casillas = new Casilla[3][3];
    }

    public Casilla getCasillas(Posicion p) {
        return casillas[p.getX()][p.getY()];
    }

    public void setCasilla(char ficha, Posicion p) {
        casillas[p.getX()][p.getY()].setFicha(ficha);
    }
    
}
