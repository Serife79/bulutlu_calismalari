package com.cydeo;

import java.util.Scanner;

public class C01_IndexOfSoru {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println( " Lütfen arama yapilacak metni giriniz.. " );
        String anaMetin = scanner.nextLine();

        System.out.println("Lütfen aranacak kelime veya metni giri...");
        String aranacakMetin = scanner.nextLine();

        //anaMetin = "javayi cok sevdik, hem de cok cok sevdik."
        //aranacakMetin = "Java"

        int ilkKullanimIndexi = anaMetin.indexOf(aranacakMetin);
        int sonKullanimIndexi = anaMetin.lastIndexOf(aranacakMetin);

        if(ilkKullanimIndexi == -1){
            System.out.println("Ana metin aranacak metni icermiyor");
        } else if (ilkKullanimIndexi == sonKullanimIndexi) {
            System.out.println("Ana metinde aranacak metin sadece 1 kere kullanilmis");

        }else {
            System.out.println("Ana metinde aranacak metin sadece 1 den fazla kullanilmis");
        }


    }
}
