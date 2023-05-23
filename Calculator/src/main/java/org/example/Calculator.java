package org.example;

import java.util.Scanner;

public class Calculator {
    public static void calculator () {
        System.out.println("Enter menu!\n1.Addition\n2.Subtraction\n3.Multiplying\n4.Dividing");
        Scanner sc = new Scanner(System.in);
        int menu= sc.nextInt();

        sc = new Scanner(System.in);

        System.out.println("Enter the first number");
        double a = sc.nextDouble();
        System.out.println("Enter the second number");
        double b = sc.nextDouble();

        if(menu==1){
            Util.add(a,b);
        } else if (menu==2) {
            Util.subtract(a,b);
        } else if (menu==3) {
            Util.multi(a,b);
        } else if (menu==4) {
            Util.divide(a,b);

        }
    }


}
