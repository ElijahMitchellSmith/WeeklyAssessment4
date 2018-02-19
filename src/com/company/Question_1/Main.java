package com.company.Question_1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    ArrayList<String> list = new ArrayList<String>();
    // private List<String> myArrayList = new ArrayList<>()
   /*
    YOUR NAME HERE! - No really put your name here so we know who this belongs to when we grade it <3
    Elijah Mitchell Smith
     */

    public static void main(String[] args) {
        Main main = new Main();
        main.addToArrayList();
        main.displayArray();
         /*
        1. In this class initialize a List as an ArrayList.
        2. Create a method called addToArrayList to add 6 values of your choosing to this ArrayList.
        3. Create a new method in this class called displayArray.
        4. Have this new method use a ForEach loop to iterate through the ArrayList and display each item to the user.
         */


    }

    private void addToArrayList() {
        list.add("Fighter");
        list.add("Warlock");
        list.add("Wizard");
        list.add("Druid");
        list.add("Barbarian");
        list.add("Bard");
    }

    private void displayArray() {
        int position = 1;
        for (int i = 0; i < list.size(); i++) {
            System.out.println(position + ". " + list.get(i));
            position++;
        }
        for (String item :
                list) {
            System.out.println(item);
            // Um...Ok. A for loop seems more appropriate but whatever.

        }


    }
}
