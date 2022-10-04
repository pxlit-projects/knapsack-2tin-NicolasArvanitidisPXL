package be.pxl.ja.robbery;

import be.pxl.ja.robbery.robbery.Knapsack;
import be.pxl.ja.robbery.robbery.KnapsackFullException;
import be.pxl.ja.robbery.robbery.KnapsackUtil;
import be.pxl.ja.robbery.robbery.Product;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class KnapsackTest {
    @Test
    public void shouldThrowExceptionTest() throws KnapsackFullException {
        Knapsack knapsack = new Knapsack(30);
        Product product = new Product("muis",5,5);
        Product product2 = new Product("laptop",40,5);
        knapsack.add(product);
        assertThrows(KnapsackFullException.class,()-> knapsack.add(product2));
    }

    @Test
    public void getCurrentWeightTest() throws KnapsackFullException {
        Knapsack knapsack = new Knapsack(30);
        Product product = new Product("muis",5,5);
        Product product2 = new Product("laptop",10,5);
        knapsack.add(product);
        knapsack.add(product2);

        assertEquals(knapsack.getCurrentWeight(),15);
    }

    @Test
    public void addTest() throws KnapsackFullException {
        Knapsack knapsack = new Knapsack(30);
        Product product = new Product("steen",35,5);
        Product product2 = new Product("lichte steen",15,5);
        try {
            knapsack.add(product);
            knapsack.add(product2);
        }
        catch (KnapsackFullException e){
            System.out.println(e.getMessage());
        }

        assertEquals(1,(int) knapsack.getItems().size());
    }
}
