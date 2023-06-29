package scanner;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ay = input.nextInt();
        switch (ay) {
            case 1:
                System.out.println("kıs");
                break;
            case 2:
                System.out.println("kıs");
                break;
            case 3:
                System.out.println("ilkbahar");
                break;
            case 4:
                System.out.println("ilkbahar");
                break;
            case 5:
                System.out.println("ilkbahar");
                break;
            case 6:
                System.out.println("yaz");
                break;
            case 7:
                System.out.println("yaz");
                break;
            case 8:
                System.out.println("yaz");
                break;
            case 9:
                System.out.println("sonbahar");
                break;
            case 10:
                System.out.println("sonbahar");
                break;
            case 11:
                System.out.println("sonbahar");
                break;
            case 12:
                System.out.println("kıs");
                break;
            default:
                System.out.println("lütfen gecerli bir sayı giriniz");
        }
    }
}
