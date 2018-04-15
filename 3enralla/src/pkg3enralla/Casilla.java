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
public class Casilla {
    
    private boolean casillaBlanca;
    private String ficha;

    public Casilla() {
        this.casillaBlanca = true;
    }

    public Casilla(String ficha) {
        this.ficha = ficha;
        casillaBlanca = false;
    }

    public String getFicha() {
        return ficha;
    }

    public void setFicha(String ficha) {
        casillaBlanca = false;
        this.ficha = ficha;
    }
    public boolean esBlanca(){
        return casillaBlanca;
    }
}
