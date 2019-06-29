package com.vlad;

import com.vlad.Characteristics.CarColor;
import com.vlad.Characteristics.CarModel;
import com.vlad.Characteristics.CarSize;

public class Car implements Comparable<Car> {

    private int price;

    private double engineVolume;

    private CarModel model;

    private CarColor color;

    private int maxSpeed;
    private CarSize carSize;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public CarModel getModel() {
        return model;
    }

    public void setModel(CarModel model) {
        this.model = model;
    }

    public CarColor getColor() {
        return color;
    }

    public void setColor(CarColor color) {
        this.color = color;
    }

    public CarSize getCarSize() {
        return carSize;
    }

    public void setCarSize(CarSize carSize) {
        this.carSize = carSize;
    }

    public void getInfo() {
        System.out.println("Model: " + this.getModel() + ", Price: " + this.getPrice() + ", Size: " + this.getCarSize() + ", Engine: " + this.getEngineVolume() + ", Color: " + this.getColor() + ", Speed: " + this.getMaxSpeed());

    }

    @Override
    public int compareTo(Car o) {

        int a = (int) (getEngineVolume() * 10);
        int b = (int) (o.getEngineVolume() * 10);
        return a - b;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
