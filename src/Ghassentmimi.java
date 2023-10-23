import java.util.Scanner;

public class Ghassentmimi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez la base : ");
        int base = scanner.nextInt();
        System.out.print("Entrez l'exposant : ");
        int exponent = scanner.nextInt();
        int[] tab = new int[0];
        System.out.println("La puissance de " + base + " à la puissance " + exponent + " est : " + calculPuiss(base,exponent));
        System.out.println("Le maximum est " + maximum(tab));
<<<<<<< HEAD
        System.out.print("Cause de conflit");
=======
>>>>>>> c076ac716434e3db0940ce9f426942cf010b9598
    }

    private static int maximum(int[] tableau) {
        int maximum = 0;
        for (int i = 1; i < tableau.length; i++) {
            if (tableau[i] > maximum) {
                maximum = tableau[i];
            }
        }
        return maximum
    }

    private static int calculPuiss(int base, int exponent) {
        int result2 = 1;
        for (int i = 0; i < exponent; i++) {
            result2 *= base;
        }
        return result2;
    }


}