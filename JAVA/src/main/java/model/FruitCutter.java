package model;
import service.Cuttable;

public class FruitCutter <T extends Cuttable>{

    private T fruit;

    public FruitCutter(T fruit) {
        this.fruit = fruit;
    }

    public String process(){
        String result = fruit.cut();
        ProcessingResult finalResult = new ProcessingResult(fruit, result);
        return finalResult.toString();
    }

}
