package co.trystan;

public class Joueur {
    private String name;
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
   

    

}
