package com.vlad.Cars;

import com.vlad.Car;
import com.vlad.Characteristics.CarColor;
import com.vlad.Characteristics.CarModel;
import com.vlad.Characteristics.CarSize;

public class Audi extends Car {


    public Audi(CarSize carSize, CarColor carColor, double engineVolume, int price, int maxSpeed) {
        super();
        this.setMaxSpeed(maxSpeed);
        this.setPrice(price);
        this.setCarSize(carSize);
        this.setColor(carColor);
        this.setEngineVolume(engineVolume);
        this.setModel(CarModel.AUDI);
    }

}
