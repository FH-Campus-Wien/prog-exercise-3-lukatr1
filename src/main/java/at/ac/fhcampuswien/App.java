package at.ac.fhcampuswien;

import java.util.Random;
import java.util.Scanner;

public class App {
    // Implement all methods as public static

    public static void oneMonthCalender(int days, int startday) {

    }

    public static void guessingGame(int i) {
        { int min = 1;
            int max = 100;

            Random rand =  new Random();
            int r = rand.nextInt((max - min) + 1) + min;

            int number;
            int c = 0;
            int c2 = 0;

            while (c < 10) {
                c2++;
                c++;
                Scanner s = new Scanner(System.in);
                System.out.print("Guess number " + c2 + ": ");
                int n = s.nextInt();

                if (n < r) {
                    System.out.println("The number AI picked is higher than your guess.");
                }if (c == 10 && n != r) {
                    System.out.println("You lost! Have you ever heard of divide & conquer?");
                    System.out.println(r);
                    break;
                }
                else if (n > r) {
                    System.out.println("The number AI picked is lower than your guess.");
                } if (n == r){
                    System.out.println("You won wisenheimer!");
                    break;

                }

            }
        }


    }





    public static void main(String[] args) {
        // test your method implementations here
        // make method calls
        // print their results
        // etc.
    }
}