package ru.pro.sky;

public abstract class Vehicle {
    private String modelName;
    private int wheelCount;

    public  Vehicle(String modelName, int wheelCount) {
        this.modelName = modelName;
        this.wheelCount = wheelCount;
    }
    public void updateTyre() {
        System.out.println(modelName + " Меняем покрышку");}

    //public static void check(Vehicle vehicle) {
      //  String modelName = vehicle.modelName;
      //  System.out.println("Обслуживаем " + modelName);
      //  for (int i = 0; i < vehicle.wheelCount; i++) {
      //      vehicle.updateTyre();

       // }
    //}

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public void setWheelCount(int wheelCount) {
        this.wheelCount = wheelCount;
    }

    public String getModelName() {
        return modelName;
    }

    public int getWheelCount() {
        return wheelCount;
    }

}
