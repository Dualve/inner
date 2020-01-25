package com.company.view;

import com.company.logic.City;

public class Printer {

    public static void printCity(City city){
        System.out.println(city);
    }

    public static void printInfo(City.Information info){
        System.out.println(info);
    }

    public static <T> void print(T msg){
        System.out.println(msg);
    }
}
