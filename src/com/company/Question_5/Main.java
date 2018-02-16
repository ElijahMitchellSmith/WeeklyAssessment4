package com.company.Question_5;

import java.util.Scanner;

public class Main {
    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Main main = new Main();
        main.attackNumber();
         /*
         1. Create a new method in this class.  Make sure to instantiate the main to break out of the static context.
         2. Create a switch statement in this new method that has 4 cases and a default.  This switch should take user input of a string .
         3. Make sure you prompt your user as to what they should enter
         4. Have the default case tell the user to input the correct input you are looking for and use recursion to run the switch again.
         */


    }
    protected void attackNumber() {
        System.out.println("Choose an attack!Select a number");
        System.out.println("1.Punch \n2.Kick \n3.HeadButt \n4.Run");
        switch (input.nextLine()) {
            case "1":
                System.out.println("PUNCH!");
                attackNumber();
                break;
            case "2":
                System.out.println("KICK!");
                attackNumber();
                break;
            case "3":
                System.out.println("HEADBUTT!");
                attackNumber();
                break;
            case "4":
                System.out.println("COWARD!");
                System.exit(0);
                break;
                default:
                    System.out.println("Please make a selection");
                    attackNumber();
                    break;


        }
    }


}
