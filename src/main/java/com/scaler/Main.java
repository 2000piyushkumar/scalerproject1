package com.scaler;
import java.io.*;
import java.util.*;
import java.lang.*;
import com.scaler.http.Client;

public class Main {
    public static void main(String[] args) {
        Client client = new Client();
        System.out.println("Sending Request..............");
        String response = client.get("https://square.github.io/okhttp/");
        System.out.println(response);
    }
}
