package com.scaler.http;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import java.io.*;

public class Client {
    OkHttpClient client = new OkHttpClient();

    public String get(String url){
        Request request = new Request.Builder().url(url).build();
        try{
            return client.newCall(request).execute().body().string();
        }
        catch(IOException ex){
            System.out.println("Error in get request." + ex.getMessage() + ex.getStackTrace());
            return null;
        }
    }
}
