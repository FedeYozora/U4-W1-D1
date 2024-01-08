public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.print("Esercizio 1\n");
        //Metodo 1
        int prodotto = moltiplica(5,6);
        System.out.println(prodotto);
        //Metodo 2
        String concat =  concatena("Java", 123);
        System.out.println(concat);
        //Metodo 3
        String[] array = {"a", "b", "c", "d", "e"};
        String stringa = "z";

        String[] arrayAggiornato = inserisciInArray(array, stringa);

        for (String s : arrayAggiornato) {
            System.out.println(s);
        }

    }
    //Moltiplica
    public static int moltiplica(int a, int b){
        return a*b;
    }
    //Concatena
    public static String concatena(String a, int b){
        return a + b;
    }
    //AddToArray
    public static String[] inserisciInArray(String[] array, String stringa) {
        String[] arrayAggiornato = new String[6];
        arrayAggiornato[0] = array[0];
        arrayAggiornato[1] = array[1];
        arrayAggiornato[2] = stringa;
        arrayAggiornato[3] = array[2];
        arrayAggiornato[4] = array[3];
        arrayAggiornato[5] = array[4];
        return arrayAggiornato;
    }
}