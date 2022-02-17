package ru.lookBag;

public class ServiceStation {

    public void check(Car car){
        System.out.println("Обслуживаем " + car.getModelName() + ":");
        for (int i = 0; i < car.getWheelsCount(); i++) {
            System.out.print("Колесо №" + (i + 1) + " ");
            car.updateTyre();
        }
        car.checkEngine();
        System.out.println();
    }

    public void check(Bicycle bicycle){
        System.out.println("Обслуживаем " + bicycle.getModelName() + ":");
        for (int i = 0; i < bicycle.getWheelsCount(); i++) {
            System.out.print("Колесо №" + (i + 1) + " ");
            bicycle.updateTyre();
        }
        bicycle.checkEngine();
        bicycle.checkTrailer();
        System.out.println();
    }

    public void check(Truck truck){
        System.out.println("Обслуживаем " + truck.getModelName() + ":");
        for (int i = 0; i < truck.getWheelsCount(); i++) {
            System.out.print("Колесо №" + (i + 1) + " ");
            truck.updateTyre();
        }
        truck.checkEngine();
        truck.checkTrailer();
        System.out.println();
    }
}
