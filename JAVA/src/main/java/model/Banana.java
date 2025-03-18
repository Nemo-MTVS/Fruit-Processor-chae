package model;

import service.Peelable;

public class Banana implements Peelable {

    private  String name;
    private int ripeness;
    private double price;

    public Banana(String name, int ripeness, double price) {
        this.name = name;
        this.ripeness = ripeness;
        this.price = price;
    }

    @Override
    public String peel() {
        if (ripeness > 5) {
            return "잘 익어서 아주 부드러운 바나나 껍질을 벗깁니다.";
        } else if (ripeness < 3) {
            return "적당히 익어서 부드러운 바나나 껍질을 벗깁니다.";
        } else{
            return "덜 익어서 딱딱한 바나나 껍질을 벗깁니다.";
        }

    }
}
