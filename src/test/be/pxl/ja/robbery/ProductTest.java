package be.pxl.ja.robbery;

import be.pxl.ja.robbery.robbery.Product;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProductTest {
    @Test
    public void shouldReturnPositiveWhenBigger(){
        Product fiets = new Product("fiets",50,150);
        Product motor = new Product("Motor",150,2000);
        int number = fiets.compareTo(motor);
        Assertions.assertEquals(1,number);
    }

    @Test
    public void shouldReturnNegativeWhenBigger(){
        Product fiets = new Product("fiets",50,150);
        Product motor = new Product("Motor",150,2000);
        int number = motor.compareTo(fiets);
        Assertions.assertEquals(-1,number);
    }

    @Test
    public void shouldReturnZeroWhenBigger(){
        Product fiets = new Product("fiets",50,150);
        Product mountainbike = new Product("mountainbike",150,150);
        int number = fiets.compareTo(mountainbike);
        Assertions.assertEquals(0,number);
    }
}
