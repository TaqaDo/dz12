package com.company;

public class Main {

    public static void main(String[] args) {

        Driver<Number> driver2 = new Driver(9, 8);
        System.out.println("Мои гонки: " + driver2.getNumOfRuftings() + "  " + "Мои победы:  " + driver2.getVictories());

        driver2.getCar();
        driver2.getWhereGet();

    }
}