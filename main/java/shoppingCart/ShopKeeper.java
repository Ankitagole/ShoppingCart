package shoppingCart;

public class ShopKeeper {
    public void shopKepper(int price, String name, String category, Integer quantity, boolean imported){

        Product product = new Product(price,name,imported,category);
        Cart cart = new Cart();
        cart.addCart(product,quantity);

    }
}
