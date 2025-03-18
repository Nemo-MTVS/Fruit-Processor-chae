package model;
import service.Peelable;

public class FruitProcessor <T extends Peelable>{

    private T fruit;

    public FruitProcessor(T fruit) {
        this.fruit = fruit;
    }

    public String process(){
        String result = fruit.peel();
        ProcessingResult finalResult = new ProcessingResult<>(this.fruit, result);
        return result.toString();
    }
}
