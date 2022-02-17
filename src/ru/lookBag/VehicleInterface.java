package ru.lookBag;

public interface VehicleInterface {

    default public void updateTyre() {
        System.out.println("Меняем покрышку");
    };

    default public void checkEngine() {
        System.out.println("У данного транспорта нет двигателя!");
    }

    default public void checkTrailer() {
        System.out.println("У данного транспорта нет прицепа!");
    }

}
