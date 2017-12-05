package com.trabelsi.malek.weatherappfilestructure.Model;

import java.util.List;

/**
 * Created by Spaceclaim on 30/11/2017.
 */

public class OpenWeatherMap {
    private int cod;
    private double message;
    private int cnt;
    private List<Instants> instantsList;
    private City city;

    public OpenWeatherMap() {
    }

    public OpenWeatherMap(int cod, double message, int cnt, List<Instants> instantsList, City city) {
        this.cod = cod;
        this.message = message;
        this.cnt = cnt;
        this.instantsList = instantsList;
        this.city = city;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public double getMessage() {
        return message;
    }

    public void setMessage(double message) {
        this.message = message;
    }

    public int getCnt() {
        return cnt;
    }

    public void setCnt(int cnt) {
        this.cnt = cnt;
    }

    public List<Instants> getInstantsList() {
        return instantsList;
    }

    public void setInstantsList(List<Instants> instantsList) {
        this.instantsList = instantsList;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }
}
