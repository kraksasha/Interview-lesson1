package example2;

public class LightWeightCar extends Car {
    @Override
    public void move() {
        System.out.println("LightWeightCar is move");
    }

    @Override
    public void stop() {
        System.out.println("LightWeightCar is stop");
    }

    @Override
    public void open() {
        System.out.println("LightWeightCar is open");
    }

    @Override
    public void start() {
        System.out.println("LightWeightCar is start");
    }
}
