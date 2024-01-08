//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Esercizio 3\n");

        //PerimetroRettangolo
        double lunghezza = 10.5;
        double larghezza = 5.6;
        double perimetroRettangolo = perimetroRettangolo(lunghezza, larghezza);
        System.out.println("Il perimetro del rettangolo è: " + perimetroRettangolo);

        //Pari o Dispari

        int numero = 7;
        System.out.println("Il numero é: " + pariDispari(numero));

        //PerimetroTriangolo
        double lato1 = 4;
        double lato2 = 4;
        double lato3 = 5;
        double perimetroTriangolo = perimetroTriangolo(lato1, lato2, lato3);
        System.out.println("Il perimetro del triangolo è: " + perimetroTriangolo);
    }
    public static double perimetroRettangolo(double lunghezza, double larghezza) {
        return 2 * (lunghezza + larghezza);
    }

    public static double perimetroTriangolo(double lato1, double lato2, double lato3) {
        return (lato1 + lato2 + lato3);
    }
    public static int pariDispari(int numero) {
        if (numero % 2 == 0) {
            return 0;
        } else {
            return 1;
        }
    }
}