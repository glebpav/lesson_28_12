import models.Car;
import models.OldCar;
import models.PremiumCar;

public class Main {
    public static void main(String[] args) {

        PremiumCar premiumCar = new PremiumCar(4, 2, "RollsRoyce", 20_000_000);
        OldCar oldCar = new OldCar(4, 1, "Jeep", 1934);
        OldCar oldCar1 = new OldCar(4, 1, "Jeep1", 1934);
        OldCar oldCar2 = new OldCar(4, 1, "Jeep2", 1934);
        OldCar oldCar3 = new OldCar(4, 1, "Jeep3", 1934);

        // premiumCar.showCarInfo();
        // oldCar.showCarInfo();

        Car[] carsArray = new Car[10];

        carsArray[0] = premiumCar;
        carsArray[1] = oldCar;
        carsArray[2] = oldCar1;
        carsArray[3] = oldCar2;
        carsArray[4] = oldCar3;

        for (int i = 0; i < 5; i++) {
            carsArray[i].showCarInfo();
        }

    }
}