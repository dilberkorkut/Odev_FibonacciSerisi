import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* Fibonacci Serisi
        9 Elemanlı Fibonacci Serisi : 0 1 1 2 3 5 8 13 21 34
        0 + 1 = 1
        1 + 1 = 2
        1 + 2 = 3
        2 + 3 = 5
        3 + 5 = 8
        ...
        s1 ve s2 sayilari toplandi.
        s1=s2 ve s2=toplam oldu.
        */
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        int n = input.nextInt();

        int s1 = 0;
        int s2 = 1;
        int toplam;

        System.out.print(n + " sayisinin Fibonacci serisi:  ");

        for( int i = 1; i <= n; i ++ ) {
            System.out.print(s1 + ",");

            toplam = s1 + s2 ;
            s1 = s2;
            s2 = toplam;
        }



    }
}