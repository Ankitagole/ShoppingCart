package shoppingCart;

import java.util.HashMap;
import java.util.Map;

public class Cart {
  public Map<Product, Integer> cart = new HashMap<>();

   public void add(Product product, Integer quantity){
        cart.put(product, quantity);
    }
   public Map<Product,Integer> getProducts() {
        return cart;
    }
}
