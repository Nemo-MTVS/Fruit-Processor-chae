package model;

import service.Cuttable;

public class Apple implements Cuttable {

    private String name;
    private String color;
    private double price;

    public Apple(String name, String color, double price) {
        this.name = name;
        this.color = color;
        this.price = price;
    }

    @Override
    public String cut() {
        return color + " 사과 껍질을 깎습니다.";
    }
}
