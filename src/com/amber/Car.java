package com.amber;

public class Car {
   private String engine;
   private byte wheels = 4;
   private String name;
   static int speed = 0;

    public Car(String name) {
        this("v4", "Ford");
    }
    public Car(String engine, String name) {
        this.engine = engine;
        this.name = name;
    }

    public Car startingEngine(){
        System.out.println(engine + " started!");
        System.out.println("------------------");
        return null;
    }

    public void accelerate(){
        speed++;
        System.out.println("Speed: " + speed);
    }
    public void braking(){
        speed--;
        System.out.println("Breaking, Speed: " + speed);
    }

    //GETTERS

    public String getEngine() {
        return engine;
    }

    public byte getWheels() {
        return wheels;
    }

    public String getName() {
        return name;
    }
}
