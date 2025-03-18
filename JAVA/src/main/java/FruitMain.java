import model.Apple;
import model.Banana;
import model.FruitCutter;
import model.FruitProcessor;

public class FruitMain {
    public static void main(String[] args) {
        Banana banana = new Banana("바나나", 8, 3000.0);
        Apple apple = new Apple("사과", "빨간색", 5000.0);

        FruitProcessor processor = new FruitProcessor<>(banana);
        FruitCutter cutter = new FruitCutter<>(apple);

        System.out.println(processor.process());
        System.out.println(cutter.process());
    }
}
