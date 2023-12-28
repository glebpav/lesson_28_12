package models;

public class OldCar extends Car {

    int year;

    public OldCar(int countOfWheels, int volumeOfEngine, String model, int year) {
        super(countOfWheels, volumeOfEngine, model);
        this.year = year;
    }

    @Override
    public void showCarInfo() {
        super.showCarInfo();
        System.out.println("Year: " + year);
    }

}
