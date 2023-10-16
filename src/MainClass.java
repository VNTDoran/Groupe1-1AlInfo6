import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez la taille tableau 1 :");
        int tailleTableau1 = scanner.nextInt();

        System.out.println("Entrez la taille du tableau 2 : ");
        int tailleTableau2 = scanner.nextInt();

        int[] tableau1 = new int[tailleTableau1];
        int[] tableau2 = new int[tailleTableau2];

        System.out.println("Saisissez les éléments du premier tableau :");
        for (int i = 0; i < tailleTableau1; i++) {
            System.out.print("Élément " + i + ": ");
            tableau1[i] = scanner.nextInt();
        }

        System.out.println("Saisissez les éléments du deuxième tableau :");
        for (int i = 0; i < tailleTableau2; i++) {
            System.out.print("Élément " + i + ": ");
            tableau2[i] = scanner.nextInt();
        }

        BenHamoudaMariem instance = new BenHamoudaMariem();

        System.out.print("Veuillez entrer une chaîne : ");
        String chaine = scanner.nextLine();

        int longeur = instance.stringLength(chaine);
        System.out.println("La longeur de la chaine est : " +longeur);
    }

}
