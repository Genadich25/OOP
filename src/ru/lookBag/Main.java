package ru.lookBag;

public class Main {

    public static void main(String[] args) {
        Car car = new Car("car1", 4);
        Car car2 = new Car("car2", 4);
        car.setModelName("Lada");
        car2.setModelName("Deo");
        car.setWheelsCount(4);
        car2.setWheelsCount(4);

        Truck truck = new Truck("truck1", 6);
        Truck truck2 = new Truck("truck2", 8);
        truck.setModelName("KAMA");
        truck2.setModelName("Tesla");
        truck.setWheelsCount(6);
        truck2.setWheelsCount(8);

        Bicycle bicycle = new Bicycle("bicycle1", 2);
        Bicycle bicycle2 = new Bicycle("bicycle2", 2);
        bicycle.setModelName("Steels");
        bicycle2.setModelName("Speed");
        bicycle.setWheelsCount(2);
        bicycle2.setWheelsCount(2);

        ServiceStation serviceStation = new ServiceStation();
        serviceStation.check(car);
        serviceStation.check(car2);
        serviceStation.check(bicycle);
        serviceStation.check(bicycle2);
        serviceStation.check(truck);
        serviceStation.check(truck2);

        Bicycle testBicycle = new Bicycle("coolBicycle", 2);
        System.out.println("Проверка: есть ли в велосипеде двигатель и прицеп ");
        serviceStation.check(testBicycle);
    }
}
