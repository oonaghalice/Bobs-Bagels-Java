import java.util.*;
public class Basket {

    public Basket() {
        String item;
        int capacity;
    }
    ArrayList<String> basketItems = new ArrayList<>();
    public static void main(String[] args) {
        //Remove an item from basket
        //basketItems.remove("item");
    }

    public void addItem(String item) {
        basketItems.add("item");
    }

//    public void removeItem(String item) {
//        if (basketItems.contains("item")) {
//            basketItems.remove("item");
//        } else {
//            System.out.println("Item is not in basket.");
//
//        }

    public String removeItem(String item) {
        if (basketItems.contains("item")) {
            basketItems.remove("item");
        } else {
            return "Item is not in basket.";

        }

        return item;
    }}


