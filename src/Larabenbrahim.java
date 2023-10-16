public class Larabenbrahim {
    public static String inverserChaine(String chaine) {
        StringBuilder inverse = new StringBuilder();
        inverse.append(chaine);
        inverse = inverse.reverse();
        return inverse.toString();
    }

    public static double calculerPuissance(double base, int exposant) {
        double resultat = 1.0;

        if (exposant >= 0) {
            for (int i = 0; i < exposant; i++) {
                resultat *= base;
            }
        } else {

            for (int i = 0; i < -exposant; i++) {
                resultat /= base;
            }
        }

        return resultat;
    }

    public static void main(String[] args) {
        String chaine = "Hello, World!";
        String chaineInverse = inverserChaine(chaine);
        System.out.println("Chaîne inversée : " + chaineInverse);

        double base = 2.0;
        int exposant = 3;
        double resultatPuissance = calculerPuissance(base, exposant);
        System.out.println(base + " ^ " + exposant + " = " + resultatPuissance);
    }

}
