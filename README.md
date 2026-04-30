# Exercice 6 - Test des Champs Static

##  Description
Ce projet est un exercice pratique visant à démontrer la différence fondamentale entre une **variable de classe (static)** et une **variable d'instance (non-statique)** en Java[cite: 1].

##  Concepts Clés Appliqués
*   **Mot-clé `static`** : Utilisé pour créer une variable partagée par toutes les instances d'une même classe. Elle appartient à la classe elle-même[cite: 1].
*   **Variable d'instance** : Une variable propre à chaque objet créé. Chaque objet possède sa propre copie en mémoire.
*   **Constructeur** : Utilisé pour incrémenter les compteurs à chaque fois qu'une nouvelle personne est créée via l'opérateur `new`.

##  Fichiers du Projet
1.  **`Personne.java`** : Contient la logique des compteurs (un compteur statique `nbInstances` et un compteur local `nbLocal`).
2.  **`Main.java`** : Contient la méthode principale qui crée 4 objets `Personne` et affiche les résultats pour vérifier le comportement des variables[cite: 1].

##  Exécution
Pour compiler et lancer le test :
1.  Compilez les fichiers : `javac *.java`
2.  Lancez le programme : `java Main`

##  Résultat Attendu
Le programme affichera `(1,4)`. 
- **1** : Représente la valeur de `nbLocal` pour la 4ème personne (chaque personne a son propre compteur qui ne dépasse jamais 1).
- **4** : Représente la valeur de `nbInstances` (le compteur partagé qui a comptabilisé les 4 créations).

---

##  Auteur
**Bamba Ousmane  RGL3 B**  
