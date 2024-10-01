package com.cydeo;

import java.util.Scanner;

public class C01_BagimsizIfCalismlari {

    public static void main(String[] args) {
        //kullanicidan iki sayi al
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen iki tam sayi giriniz");
        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();

        //eger 1.sayi daha büyükse "girilen ilk sayi büyük" yazdirin
      if ( sayi1 > sayi2 ) {
          System.out.println(" girilen ilk sayi daha büyük");
      }

      //eger 2.sayi cift ise "Girilen 2.sayiyi cift yazdirin"
        if(sayi2 % 2 == 0){
            System.out.println("\"Girilen 2.sayiyi cift yazdirin\" ");
        }
        

    }

}
