import java.util.Scanner;

public class ZadanieNr4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj imię :");
        String imie = input.nextLine();
        System.out.println("Podaj płeć :");
        String plec = input.nextLine();
        if ("kobieta".equals(plec)) {
            System.out.println("Dzień dobry Pani " + imie);
        } else {
            System.out.println("Dzień dobry Panu " + imie);


        }
    }
}
