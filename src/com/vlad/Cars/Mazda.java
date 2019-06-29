package com.vlad.Cars;

import com.vlad.Car;
import com.vlad.Characteristics.CarColor;
import com.vlad.Characteristics.CarModel;
import com.vlad.Characteristics.CarSize;

public class Mazda extends Car {


    public Mazda(CarSize carSize, CarColor carColor, double engineVolume, int price, int maxSpeed) {
        super();
        this.setPrice(price);
        this.setMaxSpeed(maxSpeed);

        this.setCarSize(carSize);
        this.setColor(carColor);
        this.setEngineVolume(engineVolume);
        this.setModel(CarModel.MAZDA);
    }


}
