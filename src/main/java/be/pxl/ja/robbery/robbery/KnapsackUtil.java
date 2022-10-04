package be.pxl.ja.robbery.robbery;

import java.util.Collections;

public class KnapsackUtil {
    public static void fill(Knapsack knapsack,Shop shop) throws KnapsackFullException {
        Collections.sort(shop.items);
        for(Product item : shop.items){
            try {
                knapsack.add(item);
            }catch (KnapsackFullException e){
                System.out.println(e.getMessage());
                break;
            }
        }
    }
}
