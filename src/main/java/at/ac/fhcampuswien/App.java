package at.ac.fhcampuswien;

import java.util.Random;
import java.util.Scanner;

public class App {
    // Implement all methods as public static
    public static boolean  swapArrays(int[] n1, int[] n2) {
        boolean l = n1.length == n2.length;    //final result
        if (l != true)
            return l;
        int x;    //storage
        // idea from following source: https://stackoverflow.com/questions/13766209/efficient-swapping-of-elements-of-an-array-in-java
        for (int i = 0; i < n1.length; i++) {
            x = n1[i];
            n1[i] = n2[i];
            n2[i] = x;
        }return l;
    }


    public static void oneMonthCalendar(int days, int startday) {

        // idea from following link: https://stackoverflow.com/questions/26962388/printing-a-calendar
        // another idea from following link: https://www.codeproject.com/Questions/5297638/How-do-I-correctly-print-out-a-calendar-in-java

        int counter = 0;

        for (int i = 0; i < startday - 1; i++) {
            System.out.print("   ");
            counter++;
        }

        for (int k = 1; k <= days; k++) {
            if (k < 10)
                System.out.print(" " + k + " ");
            else
                System.out.print(k + " ");
            counter++;
            if (counter % 7 == 0 && days != k)
                System.out.println();
        }
        System.out.println();
    }


    public static long[] lcg(long seed) {

        // ideas from following source: https://www.geeksforgeeks.org/java-program-to-implement-the-linear-congruential-generator-for-pseudo-random-number-generation/

        long l = seed;
        long k = seed;
        long[] array = new long[10];
        long c = 12345;     //Inkrement
        long m = (long) Math.pow(2,31);     //Modul
        long a = 1103515245;    //Faktor
        long f;

        for (int j = 0; j < array.length; j++) {
            f = (a * l + c) % m;
            array[j] = f;
            l = f;
        }
        return array;
    }


    public static void camelCase(String args[]) {
        // couldn't solve this

    }

    public static void guessingGame(int i) {
        {

            //int number;
            //int c = 0;
            //int c2 = 0;

            //while (c < 10) {
            Scanner s = new Scanner(System.in);
            for (int k = 1; k <= 10; k++) {
                //c2++;
                //c++;

                System.out.print("Guess number " + k + ": ");
                int n = s.nextInt();


                if (k == 10 && n != i) {
                    System.out.println("You lost! Have you ever heard of divide & conquer?");
                    break;
                }if (n == i){
                        System.out.println("You won wisenheimer!");
                        break;
                }
                if (n > i) {
                    System.out.println("The number AI picked is lower than your guess.");
                } if (n < i) {
                    System.out.println("The number AI picked is higher than your guess.");
                }

            }

        }
    }
    public static int randomNumberBetweenOneAndHundred() {
        Random rand = new Random();
        return rand.nextInt(100) + 1;
    }

    public static int checkDigit(int[] num) {
        //int digitChecker = -5;
        int p = 2;      //Gewichtung
        int digitchecker = 0;    //Prüfnummer
        //int x = 0;
        //int r = 0;    //remainder
        int o = 0;
        int u = 0;

        System.out.println("Check Digit");
        for (int s = 0; s < num.length; s++) {
            p = s + 2;
            for (int i = 0; i < num.length; i++) {
                o = p * num[s];

            } u = u + o;

        }
            u = u % 11;
            digitchecker = 11 - u;
            if (digitchecker == 11) {
                digitchecker = 5;

            }
            if (digitchecker == 10) {
            digitchecker = 0;

            } return digitchecker;
        }


    public static void main(String[] args) {
        // test your method implementations here
        // make method calls
        // print their results
        // etc.

    }
}