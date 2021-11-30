package ru.pro.sky;

public class Main {


    public static void main(String[] args) {

        Bicycle bicycle1 = new Bicycle("bicycle1", 2);
        Bicycle bicycle2 = new Bicycle("bicycle2", 2);


        Car car1 = new Car("car1", 4);
        Car car2 = new Car("car2", 4);

        Truck truck1 = new Truck("truck1", 4);
        Truck truck2 = new Truck("truck2", 4);

        ServiceStation station = new ServiceStation();
        station.check(car1);
        station.check(truck1);
        station.check(bicycle1);
        }
        }











