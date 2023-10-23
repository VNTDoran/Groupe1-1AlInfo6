import java.util.Scanner;

public class Alaeddinebenomrane {
    //Question 3
    static long fact(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * fact(n - 1);
        }
    }
    //Question 2
    public double moyTab(int[] tableau) {
        if (tableau.length == 0) {
            return 0.0;
        } else {
            int somme = 0;
            int[] var3 = tableau;
            int var4 = tableau.length;

            for (int var5 = 0; var5 < var4; ++var5) {
                int element = var3[var5];
                somme += element;
            }

            return (double) somme / (double) tableau.length;
        }
    }
    public static void main (String args[]){
        //Question 1
        int num;
        Scanner scan = new Scanner(System.in);
        System.out.println("Entrer un nombre : ");
        num = scan.nextInt();
        System.out.println(fact(num));

        //Question 2

        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez la taille du tableau : ");
        int taille = scanner.nextInt();

        int[] tableau = new int[taille];

        for (int i = 0; i < taille; i++) {
            System.out.print("Entrez un entier : ");
            tableau[i] = scanner.nextInt();
        }

        Alaeddine_benomrane calc = new Alaeddine_benomrane();
        double moyenne = calc.moyTab(tableau);

        System.out.println("La moyenne des éléments du tableau est : " + moyenne);

        scanner.close();
    }
}

