package com.trabelsi.malek.weatherappfilestructure.Common;

import android.support.annotation.NonNull;
import android.util.Log;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Spaceclaim on 28/11/2017.
 */

public class Common {
    public static String API_KEY ="da2c25f3db4ad67da1b9812699d5d6b9";
    public static String API_LINK = "http://api.openweathermap.org/data/2.5/forecast";

    //Create a functional link to the API path
    @NonNull
    public static String apiRequest(String lat, String lng){
        StringBuilder sb = new StringBuilder(API_LINK);
        sb.append(String.format("?lat=%s&lon=%s&APPID=%s&units=metric",lat,lng,API_KEY));
        Log.d("API","apiRequest");
        Log.d("API",sb.toString());
        return sb.toString();
    }

    //Function that converts unix time stamp to Data type with format “HH:mm”
    public static String unixTimeStampToDateTime (double unixTimeStamp){
        Log.d("API","unixTimeStampToDateTime");
        DateFormat dateFormat = new SimpleDateFormat("HH:mm");
        Date date = new Date();
        date.setTime((long)unixTimeStamp*1000);
        return dateFormat.format(date);
    }

    //Function to get a link image from OpenWeatherMap
    public static String getImage (String icon){
        Log.d("API","getImage");
        return String.format("http://openweathermap.org/img/w/%s.png",icon);
    }

    //Function to get Date with format “dd MMMM yyyy HH:mm”
    public static String getDateNow () {
        Log.d("API", "getDateNow");
        DateFormat dateFormat = new SimpleDateFormat("dd MMMM yyyy HH:mm");
        Date date = new Date();
        return dateFormat.format(date);
    }

}
