package com.example.bmicalculator.model;

public class BmiForm {
    private double weight; // masa ciała w kilogramach
    private double height; // wzrost w metrach

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height/100;
    }

    public double calculateBmi() {
        if (height > 0) {
            return weight / (height * height);
        } else {
            return 0.0; // zabezpieczenie przed dzieleniem przez zero
        }
    }
}
