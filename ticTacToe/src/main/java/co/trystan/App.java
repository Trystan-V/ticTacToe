package co.trystan;

import java.util.Scanner;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        
        // creation joueur
        Joueur joueur1 = new Joueur("Player_1",1);
        Joueur joueur2 = new Joueur("Player_2",2); 

        //creation grille
        Grille plateau = new Grille();

       

        /////////////////Start the game\\\\\\\\\\\\\\\\\\\

        System.out.println("Quel est ton nom?");

        Scanner scan = new Scanner(System.in);
        String entreTonNom = scan.next("[0-9A-Za-z]*");

        System.out.println("Bienvenue à toi " + entreTonNom + " !" + "\n");
        System.out.println("\n" + "Très bien " + entreTonNom + ". Tu connais surement les règles du morpion, choisit une lettre, soit X, soit O : " + "\n");

        //choix du symbole

        joueur1.chooseSymboleJoueur();

        //le plateau !

        plateau.remplirTableau();
        //System.out.println("Tu es " + joueur1 + "!");
        
    }

}