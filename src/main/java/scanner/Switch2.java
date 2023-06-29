package scanner;

import java.util.Locale;
import java.util.Scanner;

public class Switch2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("bir gun giriniz");
        String gun=input.next().toLowerCase();

        switch (gun) {
            case "pazar":
            case "cumartesi":
                System.out.println("tatil");
                break;
            case "pazartesi":
            case "sali":
            case "carsamba":
            case "persembe":
            case "cuma":
                System.out.println("is gunu");
                break;
            default:
                System.out.println("lütfen gecerli bir gun giriniz");
        }
    }
}
