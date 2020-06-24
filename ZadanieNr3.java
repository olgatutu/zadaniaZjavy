import java.util.Scanner;

    public class ZadanieNr3 {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            System.out.println("Wpisz pierwszą cyfrę :");
            int pierwszaCyfra = s.nextInt();
            System.out.println("Wpisz drugą cyfrę :");
            int drugaCyfra = s.nextInt();
            int sum = pierwszaCyfra + drugaCyfra;
            System.out.println("Suma podanych przez Ciebie cyfr to: " + sum);
        }
    }

