public class Main {
    public static void main(String[] args) {

        // On crée 4 personnes différentes
        Personne p1 = new Personne();
        Personne p2 = new Personne();
        Personne p3 = new Personne();
        Personne p4 = new Personne();

        // On affiche les résultats pour la dernière personne (p4)
        // On utilise Personne.nbInstances car c'est une variable de CLASSE.
        // On utilise p4.nbLocal car c'est une variable d'OBJET.

        System.out.println("Résultat final pour la personne 4 :");
        System.out.println("(" + p4.nbLocal + " , " + Personne.nbInstances + ")");
    }
}