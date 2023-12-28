package models;

public class PremiumCar extends Car {

    int price;

    public PremiumCar(int countOfWheels, int volumeOfEngine, String model, int price) {
        super(countOfWheels, volumeOfEngine, model);
        this.price = price;
    }

    @Override
    public void showCarInfo() {
        super.showCarInfo();
        System.out.println("Price: " + price);
        System.out.println("Method from premium car");
    }
}
