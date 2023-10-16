import java.util.Scanner;

public class YassineRaouafi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("donner un nombre pour calculer le racine carre");
        int n = sc.nextInt();
        System.out.println("le racine carre de " + n + " est = " + Math.sqrt((double)n));
        System.out.println("donner un nombre pour verifier nombre pair ou non");
        int m = sc.nextInt();
        if (m / 2 == 0) {
            System.out.println("le nombre est pair");
        } else {
            System.out.println("le nombre est impair");
        }

    }
}
