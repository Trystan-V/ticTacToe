package co.trystan;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Joueur {
    private String name;
    private char symbolJoueur; 
    private int numJoueur;


    // constructor
    
    public Joueur(String name, int numJoueur) {
        this.name = name;
        this.numJoueur = numJoueur;
    }

    //getter

    public String getName() {
        return name;
    }

    //setter

    public void setName(String name) {
        this.name = name;
    }

    //getter

    public int getNumJoueur() {
        return numJoueur;
    }

    //setter

    public void setNumJoueur(int numJoueur) {
        this.numJoueur = numJoueur;
    }

    //toString

    @Override
    public String toString() {
        return 
            getName() + " " + getNumJoueur();
    }
   
    //Choisir son symbole

    public void chooseSymboleJoueur(){
        Scanner scan = new Scanner(System.in);
        try {
            char chooseSymbol = scan.next("[O|Xo|x]*").charAt(0);
            if(chooseSymbol == 'x' || chooseSymbol =='X'){
              this.symbolJoueur = 'X';  
            }else if(chooseSymbol == 'o' || chooseSymbol =='O'){
                this.symbolJoueur = 'O';  
              }
            System.out.println("\n" + "Tu es donc le " + this.name + " et tu auras le symbole : "  + this.symbolJoueur + "\n");
        } catch (InputMismatchException e) {
            System.out.println("Choisit une lettre, soit X, soit O !");
        }
    }
    

}
