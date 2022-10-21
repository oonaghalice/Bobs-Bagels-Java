import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BobsBagelsTest {

    @Test
    @DisplayName("Add to basket and check the basket has only 1 item")
    void add(){
        //Arrange
        Basket basket = new Basket();

        //Act
       basket.basketItems.add("Bagel");

        //Assert
        int result = basketItems.toArray().length;
        assertEquals(result,1);
        System.out.println("Basket Length is " +" "+ result);
    }

    @Test
    @DisplayName("Remove from basket and check the basket has only 0 item")
    void add(){
        //Arrange
        Basket basket = new Basket();

        //Act
        basket.basketItems.add("Bagel");
        basket.basketItems.remove("Bagel");

        //Assert
        int result = basketItems.toArray().length;
        assertEquals(result,0);
        System.out.println("Basket Length is " +" "+ result);
    }



}
