package LessonsSimple.CKZiU.company;

import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {
	// write your code here
        float a = 3;
        float b = 1;

        Scanner li = new Scanner(System.in);
        System.out.println("Poaj lizbę a: ");
        a = li.nextFloat();
        System.out.println("Podaj liczbę b: ");
        b = li.nextFloat();

        float w;
        w = a / b;
        System.out.println("Wynik dzielenia to: " + w);
    }
}
