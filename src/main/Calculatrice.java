/**
*
* @author Jikael FILOMIN M1 MIAGE
* @version 1.0.0
*/

public class Calculatrice {
    private int x;
    private int y;

    /**
     * Constructeur de la classe
     * @param a Première opérande 
     * @param b Deuxième opérande
     *             
     */
    public Calculatrice(int a, int b) {
        x = a;
        y = b;
    }

    /**
     * Méthode addition
     *
     * @return La somme des deux opérandes
     */
    public int plus() {
        return x+y;
    }


    /**
     * Méthode soustraction
     *
     * @return La soustraction des deux opérandes
     */
    public int moins() {
        return x-y;
    }

    /**
     * Méthode multiplication
     *
     * @return La multiplication des deux opérandes
     */
    public int fois() {
        return x*y;
    }

    /**
     * Méthode division
     *
     * @return La division des deux opérandes
     */
    public int div() {
        return x/y;
    }
}