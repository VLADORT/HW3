package com.vlad;

import com.vlad.Cars.Audi;
import com.vlad.Cars.BMW;
import com.vlad.Cars.Mazda;
import com.vlad.Cars.Mercedes;
import com.vlad.Characteristics.CarColor;
import com.vlad.Characteristics.CarSize;

import java.util.ArrayList;
import java.util.Collections;

public class CarShop {

    private int generalPrice;
    ArrayList<Car> cars = new ArrayList<>();
    Car audi = new Audi(CarSize.Big, CarColor.BLACK, 2.8, 4000, 140);
    Car bmw = new BMW(CarSize.Medium, CarColor.WHITE, 2.0, 8000, 250);
    Car mazda = new Mazda(CarSize.Small, CarColor.RED, 2.3, 12000, 300);
    Car mercedes = new Mercedes(CarSize.Medium, CarColor.GREEN, 1.9, 10000, 240);


    public int getGeneralPrice() {
        generalPrice = 0;

        for (Car car :
                cars) {
            generalPrice += car.getPrice();
        }
        return generalPrice;
    }

    void showInfo() {
        for (Car car :
                cars) {
            System.out.println("Model: " + car.getModel() + ", Price: " + car.getPrice() + ", Size: " + car.getCarSize() + ", Engine: " + car.getEngineVolume() + ", Color: " + car.getColor() + ", Max speed: " + car.getMaxSpeed());
        }
    }

    void sort() {
        Collections.sort(cars);
    }

    void find(int minValue, int maxValue) {
        for (Car car :
                cars) {
            if (minValue <= car.getMaxSpeed() && car.getMaxSpeed() <= maxValue) {
                car.getInfo();
            }
        }
    }

    void add(Car car) {
        this.cars.add(car);
    }


}
