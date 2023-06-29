package scanner;

import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("bir kenar uzunlugunu girin");
        int kenar1 = input.nextInt();
        System.out.println("bir kenar uzunlugunu girin");
        int kenar2 = input.nextInt();
        System.out.println("bir kenar uzunlugunu girin");
        int kenar3 = input.nextInt();

        String s = kenar1 == kenar2 && kenar2==kenar3 ? "eskenar" : kenar1==kenar2 || kenar1==kenar3 || kenar2==kenar3 ? "ikizkenar":"cok kenar";
        System.out.println("s = " + s);

    }
}
