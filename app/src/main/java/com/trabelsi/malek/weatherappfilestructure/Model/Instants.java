package com.trabelsi.malek.weatherappfilestructure.Model;

import java.util.List;

/**
 * Created by Spaceclaim on 28/11/2017.
 */

public class Instants {
    private int dt;
    private Main main;
    private List<Weather> weatherList;
    private Sys sys;
    private String dt_txt;

    public Instants(int dt, Main main, List<Weather> weatherList, Sys sys, String dt_txt) {
        this.dt = dt;
        this.main = main;
        this.weatherList = weatherList;
        this.sys = sys;
        this.dt_txt = dt_txt;
    }

    public int getDt() {
        return dt;
    }

    public void setDt(int dt) {
        this.dt = dt;
    }

    public Main getMain() {
        return main;
    }

    public void setMain(Main main) {
        this.main = main;
    }

    public List<Weather> getWeatherList() {
        return weatherList;
    }

    public void setWeatherList(List<Weather> weatherList) {
        this.weatherList = weatherList;
    }

    public Sys getSys() {
        return sys;
    }

    public void setSys(Sys sys) {
        this.sys = sys;
    }

    public String getDt_txt() {
        return dt_txt;
    }

    public void setDt_txt(String dt_txt) {
        this.dt_txt = dt_txt;
    }
}
