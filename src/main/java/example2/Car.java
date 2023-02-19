package example2;

public abstract class Car {
    private Engine engine;
    private String color;
    private String name;

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    abstract void open();
    abstract void start();
    abstract void move();
    abstract void stop();
}
