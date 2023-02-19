package example2;

public class Lorry extends Car{
    @Override
    public void move() {
        System.out.println("Lorry is move");
    }

    @Override
    public void stop() {
        System.out.println("Lorry is stop");
    }

    @Override
    public void open() {
        System.out.println("Lorry is open");
    }

    @Override
    public void start() {
        System.out.println("Lorry is start");
    }
}
