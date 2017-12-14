package com.trabelsi.malek.weatherappfilestructure.Helper;

import android.util.Log;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by Spaceclaim on 28/11/2017.
 */

public class Helper {
    static String stream = null;

    public Helper() {

    }

    //Function to make a request to OpenWeatherMap’s API and get return result
    public String getHTTPData (String urlString){
        try {
            Log.d("HELPER","getHTTPData");
            URL url = new URL(urlString);
            HttpURLConnection httpURLConnection = (HttpURLConnection)url.openConnection();
            if (httpURLConnection.getResponseCode()==200)
            {
                Log.d("HELPER","ResponseCode 200");
                BufferedReader r = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
                StringBuilder sb = new StringBuilder();
                String line;
                while ((line = r.readLine()) != null)
                    sb.append(line);
                stream = sb.toString();
                Log.d("HELPER", sb.toString());
                httpURLConnection.disconnect();
            }else{
                Log.d("HELPER","status code : "+ httpURLConnection.getResponseCode());
            }

        } catch (MalformedURLException e) {
            Log.d("HELPER","catchMalformedURL");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
            Log.d("HELPER","Error");
        }
        Log.d("HELPER",stream.toString());

        return stream;
    }
}
