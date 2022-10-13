import java.util.*;
public class Basket {
    public static void main(String[] args) {

        String[] basketItems;
        String item;

//    public Basket(String[] basketItems) {
//        this.basketItems = basketItems;
//    }

        public static void add() {
            ArrayList<String> newBasketItems = new ArrayList<String>(Arrays.asList(basketItems));
            newBasketItems.add(item);
        }
    }
