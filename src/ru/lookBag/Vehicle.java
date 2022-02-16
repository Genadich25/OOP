package ru.lookBag;

public interface Vehicle {

    public void updateTyre();

    public default void checkEngine() {
        System.out.println("У данного транспорта нет двигателя");
    }

    public default void checkTrailer() {
        System.out.println("У данного транспорта нет двигателя");
    }

    public void setModelName(String steels);

    public void setWheelsCount(int wheelsCount);

    public int getWheelsCount();

    public String getModelName();
}
