package lib;

import java.util.Scanner;
import java.lang.Math;


public class Lib {
    public int defined() {
        Scanner sc = new Scanner(System.in);
        int in = sc.nextInt();
        return in;
    }

    private double input() {
        Scanner sc = new Scanner(System.in);
        return sc.nextDouble();
    }

    private double xyz(String var) {
        System.out.printf("\r%s = ", var);
        return input();
    }

    public void menuList(int action) {
        if (action == 0) {
            System.out.printf("________________________________________\n " +
                    "\t%d\t%s\t\t%d\t%s\n" +
                    "\t%d\t%s\t\t%d\t%s\n" +
                    "\t%d\t%s\t\t%d\t%s\n" +
                    "\t%d\t%s\t\t%d\t%s\n" +
                    "________________________________________\r",

                    1, "+", 5, "trigonometry",
                    2, "-", 6, "ln",
                    3, "*", 7, "x^y",
                    4, "/", 8, "exit");

            menu(defined());
        }
        else {
            for (int i = 0; i < 100; i++) { System.out.println(); }
            System.out.printf("________________________________________\n " +
                     "\t%d\t%s\t\t%d\t%s\n" +
                     "\t%d\t%s\t\t%d\t%s\n" +
                     "\t%d\t%s\t\t%d\t%s\n" +
                     "\t%d\t%s\t\t%d\t%s\n" +
                     "________________________________________\r",

                     9, "Sin",  13, "lol",
                    10, "Cos",  14, "6",
                    11, "Tan",  15, "7",
                    12, "...",  16, "16");
            menu(defined());
        }

    }

//    private double arithmetic() {
//        double x = xyz("x");
//        double y = xyz("y");
//        System.out.print(x + " + " + y + "= ");
//        return x + y;
//    }


    public void menu(int action) {
        //double out = 0;
        switch (action) {
            case 0: System.out.println("the operation is not defined"); break;

            case 1: {
                double x = xyz("x");
                double y = xyz("y");
                System.out.println(x + " + " + y + "= " + (x + y));
                } break;

            case 2: {
                double x = xyz("x");
                double y = xyz("y");
                System.out.println(x + " - " + y + "= " + (x - y));
                } break;

            case 3: {
                double x = xyz("x");
                double y = xyz("y");
                System.out.println(x + " * " + y + "= " + (x * y));
            } break;

            case 4: {
                double x = xyz("x");
                double y = xyz("y");
                System.out.println(x + " / " + y + "= " + (x / y));
            } break;

            case 5 : menuList(action);  break;

            case 6 :{
                double x = xyz("x");
                System.out.println("ln(" + x + ") = " + Math.log(x));
            } break;

            case 7 :{
                double x = xyz("x");
                double y = xyz("y");
                System.out.println(x + "^" + y + " = " + Math.pow(x, y));
            } break;

            case 8 : System.exit(0); break;

            case 9 : {
                double x = xyz("x");
                System.out.println("Sin(" + x + ")= " + Math.sin(x));
            } break;

            case 10 : {
                double x = xyz("x");
                System.out.println("Cos(" + x + ")= " + Math.cos(x));
            } break;

            case 11 : {
                double x = xyz("x");
                System.out.println("Tan(" + x + ")= " + Math.tan(x));
            } break;
        }

    }
}
