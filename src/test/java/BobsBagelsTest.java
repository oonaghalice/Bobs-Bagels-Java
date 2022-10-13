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
        Set<String> Basket = new HashSet<String>();

        //Act
       Basket.add("Bagel");
        //Assert

        int result = Basket.toArray().length;
        assertEquals(result,1);
        System.out.println("Basket Length is " +""+ result);
    }



}
