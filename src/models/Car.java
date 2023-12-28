package models;

public class Car {

    int countOfWheels;
    int volumeOfEngine;
    String model;

    public Car(int countOfWheels, int volumeOfEngine, String model) {
        this.countOfWheels = countOfWheels;
        this.volumeOfEngine = volumeOfEngine;
        this.model = model;
    }

    public void showCarInfo() {
        System.out.println("Count of Wheels: " + countOfWheels);
        System.out.println("Volume of engine: " + volumeOfEngine);
        System.out.println("Model: " + model);
    }

    public void showCarInfo(int countOfTimes) {
        for (int i = 0; i < countOfTimes; i++) {
            showCarInfo();
        }
    }

}
