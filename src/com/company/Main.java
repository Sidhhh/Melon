package com.company;
import java.util.List;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean run = true;

        System.out.println("\uD83C\uDF48 MELON \uD83C\uDF48");
        while (run){

            try {
                System.out.print("Enter first term: ");
                double term = input.nextDouble();
                input.nextLine();
                System.out.print("Enter second term: ");
                double term2 = input.nextDouble();
                input.nextLine();
                System.out.println("What you wanna do? (+, -, *, /): ");
                String opperations = input.nextLine();
                System.out.println();
                if (opperations.equals("+")){
                    add(term, term2);
                }
                else if (opperations.equals("-")){
                    sub(term, term2);
                }
                else if (opperations.equals("*")){
                    multi(term, term2);
                }
                else if (opperations.equals("/")){
                    divide(term, term2);
                }
                else {
                    System.out.println("Unmatched character\n");
                }
            }
            catch (java.util.InputMismatchException err){
                System.out.println("Unmatched character");
                input.nextLine();
            }

        }
    }

    public static void add (double term, double term2){
        double answer = term + term2;
        System.out.println("\uD83C\uDF48 " + answer +"\n");
    }
    public static void sub (double term, double term2){
        double answer = term - term2;
        System.out.println("\uD83C\uDF48 " + answer +"\n");
    }
    public static void multi (double term, double term2){
        double answer = term * term2;
        System.out.println("\uD83C\uDF48 " + answer +"\n");
    }
    public static void divide (double term, double term2){
        double answer = term / term2;
        System.out.println("\uD83C\uDF48 " + answer +"\n");
    }
}
