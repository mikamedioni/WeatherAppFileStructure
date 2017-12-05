package com.trabelsi.malek.weatherappfilestructure.Model;

/**
 * Created by Spaceclaim on 28/11/2017.
 */

public class Main {
    private double temp;
    private double pressure;
    private int humidity;

    public Main(double temp, double pressure, int humidity) {
        this.temp = temp;
        this.pressure = pressure;
        this.humidity = humidity;
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }
}
