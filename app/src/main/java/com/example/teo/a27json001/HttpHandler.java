package com.example.teo.a27json001;

import android.util.Log;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by teo on 20/02/2017.
 */

public class HttpHandler {

    private static final String TAG = HttpHandler.class.getSimpleName();

    public HttpHandler(){

    }

    public String makeServiceCall(String reqUrl){
        String response = null;
        try {
            URL url = new URL(reqUrl);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            // read the response
            InputStream in = new BufferedInputStream(conn.getInputStream());
            response = convertStreamToString(in);

        } catch (MalformedURLException e){
            Log.e(TAG);
        } catch (Exception e) {
            Log.e(TAG,"Exception: " + e.getMessage());
        }

        return response;
    }

    private String convertStreamToString(InputStream is) {
    }


}
