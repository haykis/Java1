package scanner;

import java.util.Scanner;

public class Method {
    static int staticSayi=10;
    int staticOlmayanSayi=15;

    public static void main(String[] args) {
        //*******1********
        Scanner scan = new Scanner(System.in);
//        System.out.println("mail adres gir");
//        String email=scan.nextLine();
//        System.out.println("sifreni gir");
//        int sifre=scan.nextInt();
//        System.out.println("mail adresiniz= "+email+"\nsifreniz= "+sifre);

        //*********2***********

        System.out.println("bir sayi gir");
        Integer sayi1 = scan.nextInt();
        System.out.println("ikinci sayiyi gir");
        Integer sayi2=scan.nextInt();
        System.out.println("kiyaslama = " + sayi1.compareTo(sayi2));


        //*********3***********
//        System.out.println("birinci sayi gir");
//        int a=scan.nextInt();
//        double doubleA=(double)a;
//        System.out.println("ikinci sayi gir");
//        int b=scan.nextInt();
//        double doubleB=(double)b;
//        double c=doubleA%doubleB;
//        System.out.println("bulumden kalan = " + c);

        //**********4*********
        Variable variable = new Variable();
//        System.out.println("variable.sayi1 = " + variable.sayi1);
//        System.out.println("variable.kelime = " + variable.kelime);
//        System.out.println(staticSayi);
//        Method method = new Method();
//        System.out.println(method.staticOlmayanSayi);

        //*********5**********
//        System.out.println("baba adini gir");
//        String babaAdi = scan.next();
//        System.out.println("\""+babaAdi+"\"");

        //********6**********
//        System.out.println("bba adini gir");
//        String babaAdi=scan.next();
//        System.out.println("dogum yili gir");
//        int dogumYili=scan.nextInt();
//        System.out.println("Baba Adi: "+babaAdi+","+"Dogum Yili: "+dogumYili);
    }

    public void method(){
        System.out.println(staticOlmayanSayi);
        System.out.println(Method.staticSayi);

    }


}
