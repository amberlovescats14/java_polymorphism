package com.amber;

public class Main {

    public static void main(String[] args) {
        for(int i=0; i<10; i++){
            car();
        }
    }

    public static Car car(){
        int randomNumber = (int)(Math.random() * 3) +1;
        switch(randomNumber){
            case 1: return new Cadillac().startingEngine();
            case 2: return new Chevy().startingEngine();
            case 3: return new Toyota().startingEngine();
            default: return null;
        }
    }
}
