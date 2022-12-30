import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to calculate Fakultät: ");
        int n = sc.nextInt();
        System.out.println("choose a method 1 for Rekursiv 2 for Iterativ: ");
        int choose = sc.nextInt();
        if (choose == 1) {

            rechneFakultaetRekursiv(n);
            System.out.println("Fakultaet von n ist: " + rechneFakultaetRekursiv(n));
        }else if(choose == 2){
            rechneFakultaetIterativ(n);
        }else{
            System.out.println("Falsche Eingabe");
        }
    }
    public static int rechneFakultaetRekursiv(int a) {
        if (a <= 1 ) {
            return 1;
        } else {
            return a * rechneFakultaetRekursiv(a - 1);
        }
    }
    public static int rechneFakultaetIterativ (int a) {
        int ergebnis = 1;
        for (int i = 1; i <= a; i++) {
            ergebnis = ergebnis * i;
        }
        return ergebnis;
    }
}