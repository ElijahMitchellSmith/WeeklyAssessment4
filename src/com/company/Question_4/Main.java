package com.company.Question_4;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public Scanner input = new Scanner(System.in);


    public static void main(String[] args) {
        Main main = new Main();
        main.teleportationCirlce();
    }
        /*
        No Clue as to how to do this. Google was no help
        1. Create a new method to take user input of a number between 1 and 100
        2. Create an if statement that will take this number and if the number is between 1 and/or equal to 45 display,
        "You have been teleported to a swamp".  If the number is between 46 and/or 90 display, "Lucky you, you've been
        teleported to the beach".  If the number is between 91 and/or equal to 100 display, "Well, I hope you like it hot,
        you have been teleported to a volcano."
         */

    private void teleportationCirlce() {
            System.out.println("Please enter a number between 1 and 100");
        int userInput =input.nextInt();

           // if (userInput >= 91) {
    //            System.out.println("Well, I hope you like it hot, you have been teleported to a volcano.");
         //   } if (userInput <= 45) {
  //              System.out.println("You have been teleported to a swamp.");
         //   } if (userInput <= 90) {
//                System.out.println("Lucky you, you've been teleported to a beach!");


              if (userInput >= 1 && userInput <= 45){
                System.out.println("You have been teleported to a swamp.");
            } else if (userInput >= 46 && userInput <= 90){
                System.out.println("Lucky you, you've been teleported to a beach!");
            } else if (userInput >= 91 && userInput <= 100){
                System.out.println("Well, I hope you like it hot, you have been teleported to a volcano.");



//            } else (userInput < 1 || userInput > 100) {
//                System.out.println("That is not a valid option");
//                teleportationCirlce();

            }

            }
        }



//            input.nextInt();
//
//            if (userInput > 1) {
//            } else if (userInput <= 45) {
//                System.out.println("You have been teleported to a swamp.");
//            } else if (userInput <= 90) {
//                System.out.println("Lucky you, you've been teleported to a beach!");
//            } else if (userInput <= 100) {
//                System.out.println("Well, I hope you like it hot, you have been teleported to a volcano.");

