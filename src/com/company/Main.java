package com.company;

import java.lang.reflect.Type;
import java.util.Locale;
import java.util.Scanner;


public class Main {

    public static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.CANADA);
        System.out.println(
                " \u001b[34m    ▄▄▄▄  \n" +
                "  ██▀▀▀▀█ ▛▀▖\n" +
                " ██▀      ▌ ▌\n" +
                " ██       ▘ ▘\n" +
                " ██▄      ▌▗▘\n" +
                "  ██▄▄▄▄█ ▛▚\n" +
                "    ▀▀▀▀  ▘ ▘"
        );
        System.out.print("Введите n:");
        int n=in.nextInt();
        System.out.print("\nВведите k:");
        int k=in.nextInt();
        System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println(
                "    ▄▄▄▄  \n" +
                "  ██▀▀▀▀█ ▛▀▖\n" +
                " ██▀      ▌ ▌   ▄▄▄▄▄▄\n" +
                " ██       ▘ ▘              "+factorial(n)/(factorial(k)*factorial(n-k))+"\n" +
                " ██▄      ▌▗▘   ▀▀▀▀▀▀\n" +
                "  ██▄▄▄▄█ ▛▚\n" +
                "    ▀▀▀▀  ▘ ▘"
        );
    }
}

/*

 */