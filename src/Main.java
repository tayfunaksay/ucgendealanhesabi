import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Main {
    public static void main(String[] args) {
        System.out.println("Üçgende Alan Hesaplama...");
        int a,b,c;
        Scanner inp = new Scanner(System.in);
        System.out.println("1. Kenarın Uzunluğunu Giriniz: ");
        a= inp.nextInt();
        System.out.println("2. Kenarın Uzunluğunu Giriniz: ");
        b= inp.nextInt();
        System.out.println("3. Kenarın Uzunluğunu Giriniz: ");
        c= inp.nextInt();

        double  yc= (a+b+c)/2;      //yc=yarı çevre
        double alan= sqrt(yc*(yc-a)*(yc-b)*(yc-c));

        System.out.println("Üçgenin Alanı: " + alan);

    }
}
