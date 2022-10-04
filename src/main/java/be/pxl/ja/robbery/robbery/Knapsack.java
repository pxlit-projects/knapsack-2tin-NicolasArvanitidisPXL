package be.pxl.ja.robbery.robbery;

import java.util.ArrayList;
import java.util.List;

public class Knapsack {
    private double maximumCapacity;
    private List<Product> items = new ArrayList<Product>();

    public Knapsack(int maximumCapacity){
        this.maximumCapacity = maximumCapacity;

    }

    public double getCurrentWeight(){
        double som = 0;
        for (Product item: items){
            som += item.getWeight();
        }
        return som;
    }

    public void add(Product product) throws KnapsackFullException {
        if (getCurrentWeight() + product.getWeight() <= maximumCapacity){
            this.items.add(product);
        }
        else {
            throw new KnapsackFullException("Het maximum gewicht wordt overschreden als dit product erbij komt");
        }
    }

    public List<Product> getItems() {
        return items;
    }
}
