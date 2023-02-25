package com.company;

import java.util.Objects;

public class City {
    private final String name;
    private final int numberOfPeople;

    public City(String name, int numberOfPeople) {
        this.name = name;
        this.numberOfPeople = numberOfPeople;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return numberOfPeople == city.numberOfPeople && Objects.equals(name, city.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, numberOfPeople);
    }

    @Override
    public String toString() {
        return name + ", " + numberOfPeople;
    }
}
