package co.trystan;


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
        
        Joueur joueur1 = new Joueur("Player",1);
        Joueur joueur2 = new Joueur("Player",2);

        System.out.println("Bienvenue à toi " + joueur1 + "!");
        System.out.println("Bienvenue à toi " + joueur2 + "!");
    }

}