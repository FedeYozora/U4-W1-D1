//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.printf("Esercizio 2\n");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci la prima stringa:");
        String str1 = scanner.nextLine();

        System.out.println("Inserisci la seconda stringa:");
        String str2 = scanner.nextLine();

        System.out.println("Inserisci la terza stringa:");
        String str3 = scanner.nextLine();

        String concatenation = str1 + str2 + str3;
        System.out.println("La concatenazione delle stringhe è: " + concatenation);

        String concatenationInverse = str3 + str2 + str1;
        System.out.println("La concatenazione in ordine inverso delle stringhe è: " + concatenationInverse);
    }
}