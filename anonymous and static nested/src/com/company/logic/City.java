package com.company.logic;

//?? почему IDE ругается на именование Сшен$Information.java

import java.util.Objects;

public class City {

    private String nameOfCity;
    private Information information;


    public City(String nameOfCity){
        information = new Information();
        this.nameOfCity = nameOfCity;
    }

    public String getNameOfCity() {
        return nameOfCity;
    }

    public void setNameOfCity(String nameOfCity) {
        this.nameOfCity = nameOfCity;
    }

    public Information getInformation() {
        return information;
    }

    public void setInformation(Information information) {
        this.information = information;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return getNameOfCity().equals(city.getNameOfCity()) &&
                getInformation().equals(city.getInformation());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNameOfCity(), getInformation());
    }

    @Override
    public String toString() {
        return "City{" +
                "nameOfCity='" + nameOfCity + '\'' +
                ", information=" + information +
                '}';
    }

    public static class Information {

        private static final int MIN_AMOUNT = 0;

        private int amountOfAvenue;
        private int amountOfStreet;
        private int amountOfSquare;

        {
            this.amountOfAvenue = MIN_AMOUNT;
            this.amountOfStreet = MIN_AMOUNT;
            this.amountOfSquare = MIN_AMOUNT;
        }


        public Information(){

        }

        Information(int amountOfAvenue){
            this.amountOfAvenue = amountOfAvenue;
        }

        Information(int amountOfAvenue, int amountOfSquare){
            this.amountOfAvenue = getAmountOfAvenue();
            this.amountOfSquare = amountOfSquare;
        }

        Information(int amountOfAvenue, int amountOfSquare, int amountOfStreet){
            this.amountOfAvenue = amountOfAvenue;
            this.amountOfSquare = amountOfSquare;
            this.amountOfStreet = amountOfStreet;
        }

        public int getAmountOfAvenue() {
            return amountOfAvenue;
        }

        public void setAmountOfAvenue(int amountOfAvenue) {
            this.amountOfAvenue = amountOfAvenue;
        }

        public int getAmountOfStreet() {
            return amountOfStreet;
        }

        public void setAmountOfStreet(int amountOfStreet) {
            this.amountOfStreet = amountOfStreet;
        }

        public int getAmountOfSquare() {
            return amountOfSquare;
        }

        public void setAmountOfSquare(int amountOfSquare) {
            this.amountOfSquare = amountOfSquare;
        }

        public int getAmountOfThings(){
            return this.getAmountOfAvenue() + this.getAmountOfSquare() + this.getAmountOfStreet();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Information that = (Information) o;
            return getAmountOfAvenue() == that.getAmountOfAvenue()&&
                    getAmountOfStreet() == that.getAmountOfStreet() &&
                    getAmountOfSquare() == that.getAmountOfSquare();
        }

        @Override
        public int hashCode() {
            return Objects.hash(getAmountOfAvenue(), getAmountOfStreet(), getAmountOfSquare());
        }

        @Override
        public String toString() {
            return "information{" +
                    "avenue=" + amountOfAvenue +
                    ", street=" + amountOfStreet +
                    ", square=" + amountOfSquare +
                    '}';
        }
    }

}
