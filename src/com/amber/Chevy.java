package com.amber;

public class Chevy extends Car {

    public Chevy() {
        super("V8", "Suburban");
    }

    @Override
    public Car startingEngine(){
        System.out.println("Chevy");
        super.startingEngine();
        System.out.println("------------------");
        return null;
    }
}
