package com.trabelsi.malek.weatherappfilestructure.Model;

/**
 * Created by Spaceclaim on 28/11/2017.
 */

public class City {
    private int id;
    private Coord coord;
    private String name;
    private String country;

    public City(int id, Coord coord, String name, String country) {
        this.id = id;
        this.coord = coord;
        this.name = name;
        this.country = country;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Coord getCoord() {
        return coord;
    }

    public void setCoord(Coord coord) {
        this.coord = coord;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
