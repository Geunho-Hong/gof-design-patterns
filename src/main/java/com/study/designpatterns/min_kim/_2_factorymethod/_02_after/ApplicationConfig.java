package com.study.designpatterns.min_kim._2_factorymethod._02_after;

public class ApplicationConfig {

    public static void main(String[] args) {
        ClientDI client = new ClientDI(new WhiteshipFactory());
    }

}
