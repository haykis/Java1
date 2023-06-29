package scanner;

import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");
        String name= input.next();
        System.out.println("Lutfen soyisminizi giriniz");
        String surName= input.next();
        String name1=name.substring(0,1).toUpperCase()+name.substring(1).toLowerCase();
        String surName1=surName.substring(0,1).toUpperCase()
                +surName.substring(1).toLowerCase();
        String surName2=surName.toUpperCase();

        if (name.length()>surName.length()){
            System.out.println(name1+" "+surName1);
        }
        else {
            System.out.println(name1+" "+surName2);
        }

    }
}
