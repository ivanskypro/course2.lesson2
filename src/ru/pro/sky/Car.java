package ru.pro.sky;

public class Car extends Vehicle {


    public Car (String modelName, int wheelsCount) {
        super(modelName,wheelsCount);
    }


    public void checkEngine() {
        System.out.println(getModelName() + " Проверяем двигатель");
    }
}

