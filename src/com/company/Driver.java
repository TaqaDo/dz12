package com.company;

public class Driver <T extends Number> implements Car {
    private T numOfRuftings;
    private  T victories;

    public Driver(T numOfRuftings, T victories) {
        this.numOfRuftings = numOfRuftings;
        this.victories = victories;
    }

    public T getNumOfRuftings() {
        return numOfRuftings;
    }

    public void setNumOfRuftings(T numOfRuftings) {
        this.numOfRuftings = numOfRuftings;
    }

    public T getVictories() {
        return victories;
    }

    public void setVictories(T victories) {
        this.victories = victories;
    }

    @Override
    public Number getCar() {
        System.out.println("Ferrari , Porche , Lambo , Mazzerati ");
        return numOfRuftings;
    }

    @Override
    public Number getWhereGet() {
        System.out.println("Получил их " + " в Формуле -1 во Франции ");
        return victories;

    }
}