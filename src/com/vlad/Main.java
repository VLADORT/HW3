package com.vlad;

import com.vlad.Cars.Audi;
import com.vlad.Cars.BMW;
import com.vlad.Cars.Mazda;
import com.vlad.Cars.Mercedes;
import com.vlad.Characteristics.CarColor;
import com.vlad.Characteristics.CarSize;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        CarShop carShop = new CarShop();

        Car audi = new Audi(CarSize.Big, CarColor.BLACK, 2.8, 4000, 140);
        Car bmw = new BMW(CarSize.Medium, CarColor.WHITE, 2.0, 8000, 250);
        Car mazda = new Mazda(CarSize.Small, CarColor.RED, 2.3, 12000, 300);
        Car mercedes = new Mercedes(CarSize.Medium, CarColor.GREEN, 1.9, 10000, 240);

        carShop.cars.addAll(Arrays.asList(audi, bmw, mazda, mercedes));

        carShop.showInfo();

        System.out.println("General price: " + carShop.getGeneralPrice());

        carShop.sort();

        carShop.showInfo();

        System.out.println("=====================================================");

        carShop.find(200, 300);

    }
}
