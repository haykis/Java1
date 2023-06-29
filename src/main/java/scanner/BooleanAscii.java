package scanner;

import java.util.Scanner;

public class BooleanAscii {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen giris icin mail adresini giriniz");
        String userName=input.next();
        boolean ilk= userName.endsWith("@gmail.com")
                ||userName.endsWith("@hotmail.com")
                ||userName.endsWith("@yahoo.com");
        String userName1=userName.split("@")[0];
        System.out.println("userName1 = " + userName1);
        boolean aaa= userName1.replaceAll("[^A-Z]","").length()>0;
        System.out.println(userName1.replaceAll("[A-Z]",""));
        System.out.println("aaa = " + aaa);
        boolean bbb= userName1.replaceAll("[^a-z]","").length()>1;
        System.out.println("bbb = " + bbb);
        boolean ccc= userName1.replaceAll("[^aeiouAEIOU]","").length()>0;
        System.out.println("ccc = " + ccc);
        boolean ddd=!userName1.contains(" ");
        System.out.println("ddd = " + ddd);
        boolean eee= userName1.length()>4;
        System.out.println("eee = " + eee);
        boolean fff= userName1.charAt(userName1.length()-1)>='0'
                && userName1.charAt(userName1.length()-1)<='9';
        int a=userName1.charAt(userName1.length()-1);
        System.out.println("a = " + a);
        System.out.println("fff = " + fff);

        if (ilk&&aaa&&bbb&&ccc&&ddd&&eee&&fff){
            System.out.println("Kullanici giris ismi kabul edildi");
        }
        else {
            System.out.println("hatali giris");
        }

    }
}
