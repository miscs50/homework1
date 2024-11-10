package org.example.car;

public class Car implements Drivable {

    private String brand;
    private String model;
    private int year;
    private boolean isStarted = false;
    private boolean isStopped = true;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void start() throws RuntimeException {
        if (this.isStopped) {
            System.out.println("Start movement");
            this.isStopped = false;
            this.isStarted = true;
        } else {
            throw new RuntimeException("Already started");
        }
    }

    public void stop() throws RuntimeException {
        if (this.isStarted) {
            System.out.println("Stop movement");
            this.isStarted = false;
            this.isStopped = true;
        } else {
            throw new RuntimeException("Not started yet");
        }
    }

    public void drive(int distance) {
        try {
            this.start();
            System.out.printf("Distance of %skm passed %n", distance);
            this.stop();
        } catch (RuntimeException exc) {
            System.out.printf(
                    "%s. Keep moving. Distance of %skm passed %n", exc.getMessage(), distance);
            this.stop();
        }
    }
}
