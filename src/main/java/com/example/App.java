package com.example;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class App {
    public static void main(String[] args) {
        try {
            Document doc = Jsoup.connect("").get();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("bookk data");
    }
}
