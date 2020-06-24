public class ZadanieNr1 {
    public static void main(String[] args) {
        int [] mojaTablica = new int[10];
        int elementTablicy = 1;
        int piecDoPotegiZerowej = 1;
        System.out.println(piecDoPotegiZerowej);
        //nie wiem jak zrobić żeby wyświetlić tę potęgę w ciągu ;)
        for (int i = 1; i < mojaTablica.length; i++) {
            elementTablicy = elementTablicy * 5;
            mojaTablica[i] = elementTablicy;
            System.out.println(mojaTablica[i]);

        }
    }
}


