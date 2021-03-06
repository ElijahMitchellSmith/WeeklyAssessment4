package com.company.Question_3;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private List<Car> carsList = new ArrayList<>();
    private List<Car> modelsList = new ArrayList<>();


    public static void main(String[] args) {
        /*
        The Arraylist in this class is populated with Car objects.
        1. Create a method in this class that will list all of the models of the cars in the list.
         */

        Main main = new Main();
        main.populateArrayList();
        main.getCarModel();
    }

    private void populateArrayList() {

        carsList.add(new Car("Toyota", "Prius", "Red"));
        carsList.add(new Car("Toyota", "Tacoma", "Silver"));
        carsList.add(new Car("Honda", "Civic", "Black"));
        carsList.add(new Car("Honda", "Insight", "Blue"));
        carsList.add(new Car("Tesla", "Model 3", "Grey"));
    }

    protected void getCarModel() {
        int position = 1;

        for (int i = 0; i < carsList.size(); i++) {
            System.out.println(position + ". " + carsList.get(i).getModel());
            position++;
            // Again a for loop seemed more appropriate but the instructor is always correct
           // for (Car car : carsList)
                   // System.out.println(car.getModel()); {

            }

        }


    }
