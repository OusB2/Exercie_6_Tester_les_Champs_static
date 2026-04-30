// On définit la classe Personne
public class Personne {

    // Ce compteur est 'static' : il est PARTAGÉ par tout le monde.
    // Il ne revient jamais à zéro quand on crée une nouvelle personne.
    public static int nbInstances = 0;

    // Ce compteur est normal (non-static) : il est PROPRE à chaque personne.
    // Chaque nouvelle personne aura son propre nbLocal qui commence à 0.
    public int nbLocal = 0;

    // Le constructeur : c'est le code qui s'exécute à chaque 'new'
    public Personne() {
        // On ajoute +1 au compteur global
        nbInstances++;

        // On ajoute +1 au compteur de l'individu
        nbLocal++;
    }
}