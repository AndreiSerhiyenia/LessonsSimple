package LessonsSimple.CKZiU.company;

import java.util.Scanner;

public class Main4 {

    public static void main(String[] args) {
        // write your code here
        int a = 3;
        int b = 1;

        Scanner li = new Scanner(System.in);
        System.out.println("Poaj lizbę a: ");
        a = li.nextInt();
        System.out.println("Podaj liczbę b: ");
        b = li.nextInt();

        int w = 0;

        try {
            w=a/b;
            System.out.println(a/b);
        } catch (ArithmeticException e) {
            System.out.println("nie dzieli się przez 0 \n");
            e.printStackTrace();
        }

        w = a / b; // tu może pojawić się wyjątek

        System.out.println("Wynik dzielenia to: " + w);
    }
}
