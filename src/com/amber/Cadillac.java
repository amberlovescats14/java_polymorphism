package com.amber;

public class Cadillac extends Car {
    private String engine;

    public Cadillac() {
        super("V6", "SRX");
    }

    @Override
    public Car startingEngine(){
        System.out.println("Cadillac");
        super.startingEngine();
        System.out.println("------------------");
        return null;
    }
}
