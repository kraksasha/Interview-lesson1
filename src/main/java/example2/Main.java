package example2;

public class Main {

    public static void main(String[] args) {
        Car car1 = new Lorry();
        Car car2 = new LightWeightCar();
        car1.open();
        car1.start();
        car1.move();
        car1.stop();
        car2.open();
        car2.start();
        car2.move();
        car2.stop();
    }
}
