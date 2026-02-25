package org.example.arge;

public class CarSkeleton {
    private String name;
    private String description;

    public CarSkeleton() { }

    public CarSkeleton(String description, String name) {
        this.description = description;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String startEngine() {
        System.out.println(getClass().getSimpleName());
        return getName() + " starting engine.";
    }

    protected void runEngine() {
        System.out.println("Engine is running...");
    }

    public String drive() {
        runEngine();
        return getName() + " is driving...";
    }
}
