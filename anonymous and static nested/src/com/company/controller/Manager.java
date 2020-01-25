package com.company.controller;

import com.company.logic.City;
import com.company.view.Printer;

public class Manager {

    private final static String STANDARD_NAME = "Minsk";
    private final static String DIVIDER = "\n";
    private final static int STANDARD_AMOUNT_OF_SQUARE = 7;
    private final static int STANDARD_AMOUNT_OF_STREET = 34;
    private final static int STANDARD_AMOUNT_OF_AVENUE = 10;
    private final static int STANDARD_AMOUNT_OF_ALLEY = 2;

    public static void main(String[] args) {

        City city = new City(STANDARD_NAME);
        City.Information information = new City.Information();

        Printer.print(DIVIDER);
        Printer.printCity(city);
        Printer.printInfo(information);

        city.getInformation().setAmountOfAvenue(STANDARD_AMOUNT_OF_AVENUE);
        city.getInformation().setAmountOfSquare(STANDARD_AMOUNT_OF_SQUARE);
        city.getInformation().setAmountOfStreet(STANDARD_AMOUNT_OF_STREET);
        information.setAmountOfStreet(STANDARD_AMOUNT_OF_STREET);
        information.setAmountOfSquare(STANDARD_AMOUNT_OF_SQUARE);
        information.setAmountOfAvenue(STANDARD_AMOUNT_OF_AVENUE);

        int amountOfThings = city.getInformation().getAmountOfThings();

        Printer.print(amountOfThings);

        Printer.print(DIVIDER);

        Printer.print(city.getInformation().hashCode());
        Printer.print(information.hashCode());
        Printer.print(DIVIDER);

        City.Information newInformation = new City.Information(){
            private int amountOFAlley;
            {
                amountOFAlley = STANDARD_AMOUNT_OF_ALLEY;
            }

            public int getAmountOFAlley() {
                return amountOFAlley;
            }

            public void setAmountOFAlley(int amountOfAlley) {
                this.amountOFAlley = amountOfAlley;
            }

            @Override
            public int getAmountOfThings(){
                return getAmountOfAvenue() + getAmountOfSquare() + getAmountOfStreet() + getAmountOFAlley();
            }
        };
        newInformation.setAmountOfStreet(STANDARD_AMOUNT_OF_STREET);
        newInformation.setAmountOfSquare(STANDARD_AMOUNT_OF_SQUARE);
        newInformation.setAmountOfAvenue(STANDARD_AMOUNT_OF_AVENUE);

        Printer.print(newInformation.getAmountOfThings());
    }
}
