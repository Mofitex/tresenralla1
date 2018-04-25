/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3enralla;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Mofitex
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        ArrayList juegos = new ArrayList();
        boolean salir=false;
        int opcio = 0;
        while(salir==false){
            System.out.println("1. jugar 3 en ralla");
            System.out.println("2. Salir");
            opcio = sc.nextInt();
            sc.nextLine();
            switch(opcio){
                case 1:
                 Casilla[][] board = new Casilla[3][3];
                 
                 for (int x = 0; x < 3; x++) {
                    for (int y = 0; y < 3; y++) {
                        Casilla occupiedSquare = new Casilla();
                        board[x][y] = occupiedSquare;
                    }
                }
                 Tablero t1 = new Tablero(board);
                 Juego j1 = new Juego(t1);
                 while(j1.GameOver()==false){
                     System.out.println("Turno de player 1");
                     System.out.println("Y");
                     System.out.println("2 "+t1.getCasillas(0,2).getFicha()+" | "+t1.getCasillas(1,2).getFicha()+" | "+t1.getCasillas(2,2).getFicha());
                     System.out.println("  --|---|--");
                     System.out.println("1 "+t1.getCasillas(0,1).getFicha()+" | "+t1.getCasillas(1,1).getFicha()+" | "+t1.getCasillas(2,1).getFicha());
                     System.out.println("  --|---|--");
                     System.out.println("0 "+t1.getCasillas(0,0).getFicha()+" | "+t1.getCasillas(1,0).getFicha()+" | "+t1.getCasillas(2,0).getFicha());
                     System.out.println("  0   1   2   X");
                     System.out.println("");
                     System.out.println("Inserta la posicion y");
                     int y = sc.nextInt();
                     sc.nextLine();
                     System.out.println("Inserta la posicion x");
                     int x = sc.nextInt();
                     sc.nextLine();
                     Posicion p1 = new Posicion(x,y);
                     Casilla c1 = new Casilla('x');
                     t1.setCasilla(c1, p1);
                     if(j1.GameOver()==true){
                         if(j1.whoWon()!=' '){
                            System.out.println("Y");
                            System.out.println("2 "+t1.getCasillas(0,2).getFicha()+" | "+t1.getCasillas(1,2).getFicha()+" | "+t1.getCasillas(2,2).getFicha());
                            System.out.println("  --|---|--");
                            System.out.println("1 "+t1.getCasillas(0,1).getFicha()+" | "+t1.getCasillas(1,1).getFicha()+" | "+t1.getCasillas(2,1).getFicha());
                            System.out.println("  --|---|--");
                            System.out.println("0 "+t1.getCasillas(0,0).getFicha()+" | "+t1.getCasillas(1,0).getFicha()+" | "+t1.getCasillas(2,0).getFicha());
                            System.out.println("  0   1   2   X");
                            System.out.println("");
                            char ficha = j1.whoWon();
                            if(ficha=='x'){
                              System.out.println("Ha Ganado el jugador 1");
                            }
                            else if(ficha=='o'){
                              System.out.println("Ha Ganado el jugador 2");
                            }
                             
                             
                         }
                         else{
                           System.out.println("Empate");
                         }
                     }
                     else{
                        System.out.println("Turno de player 2");
                        System.out.println("Y");  
                        System.out.println("2 "+t1.getCasillas(0,2).getFicha()+" | "+t1.getCasillas(1,2).getFicha()+" | "+t1.getCasillas(2,2).getFicha());
                        System.out.println("  --|---|--");
                        System.out.println("1 "+t1.getCasillas(0,1).getFicha()+" | "+t1.getCasillas(1,1).getFicha()+" | "+t1.getCasillas(2,1).getFicha());
                        System.out.println("  --|---|--");
                        System.out.println("0 "+t1.getCasillas(0,0).getFicha()+" | "+t1.getCasillas(1,0).getFicha()+" | "+t1.getCasillas(2,0).getFicha());
                        System.out.println("  0   1   2   X");
                        System.out.println("");
                        System.out.println("Inserta la posicion y");
                        int y2 = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Inserta la posicion x");
                        int x2 = sc.nextInt();
                        sc.nextLine();
                        Posicion p2 = new Posicion(x2,y2);
                        Casilla c2 = new Casilla('o');
                        t1.setCasilla(c2, p2);
                        if(j1.GameOver()==true){
                          if(j1.whoWon()!=' '){
                            System.out.println("Y");
                            System.out.println("2 "+t1.getCasillas(0,2).getFicha()+" | "+t1.getCasillas(1,2).getFicha()+" | "+t1.getCasillas(2,2).getFicha());
                            System.out.println("  --|---|--");
                            System.out.println("1 "+t1.getCasillas(0,1).getFicha()+" | "+t1.getCasillas(1,1).getFicha()+" | "+t1.getCasillas(2,1).getFicha());
                            System.out.println("  --|---|--");
                            System.out.println("0 "+t1.getCasillas(0,0).getFicha()+" | "+t1.getCasillas(1,0).getFicha()+" | "+t1.getCasillas(2,0).getFicha());
                            System.out.println("  0   1   2   X");
                            System.out.println("");
                             char ficha = j1.whoWon();
                             if(ficha=='x'){
                                 System.out.println("Ha Ganado el jugador 1");
                             }
                             else if(ficha=='o'){
                                 System.out.println("Ha Ganado el jugador 2");
                             }
                             
                             
                            }
                            else{
                             System.out.println("Empate");
                            }
                        }  
                     }
                     
                 }
                 break;
             case 2:
                 salir=true;
                 break;
                 
         }
     }
    }
    
}
