import Generics.*;

public class Main {
    public static void main(String[] args) {
        Candy candy = new Candy("Red Vine");
        Pastila pastila = new Pastila("Apple");

        candy.consume();
        pastila.consume();

        var switchSuccessful = pastila.tryGivingCandyTo(new Object());
        pastila.<Candy>decorateWith(candy);
    }
}