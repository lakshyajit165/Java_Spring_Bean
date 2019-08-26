package com.stackroute.DI;

public class Location {

    String Area, City;
    public String getArea() {
        return Area;
    }

    public void setArea(String area) {
        Area = area;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    @Override
    public String toString() {
        return "Location{" +
                "Area='" + Area + '\'' +
                ", City='" + City + '\'' +
                '}';
    }
}
