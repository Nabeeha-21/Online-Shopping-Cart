import java.util.ArrayList;
import java.util.HashMap;

public class ShoppingCart {

    ArrayList<Product> cart = new ArrayList<>();
    HashMap<String, Integer> quantity = new HashMap<>();

    public void addProduct(String name, double price) {

        boolean exists = false;

        for (Product p : cart) {

            if (p.name.equalsIgnoreCase(name)) {

                quantity.put(p.name, quantity.get(p.name) + 1);
                exists = true;
                break;
            }
        }

        if (!exists) {

            Product p = new Product(name, price);
            cart.add(p);
            quantity.put(name, 1);
        }

        System.out.println("Product Added!");
    }

    public void viewCart() {

        if (cart.size() == 0) {
            System.out.println("Cart is Empty");
            return;
        }

        System.out.println("\nProducts in Cart");

        for (Product p : cart) {

            int q = quantity.get(p.name);

            System.out.println("------------------------");
            System.out.println("Product : " + p.name);
            System.out.println("Price   : " + p.price);
            System.out.println("Quantity: " + q);
            System.out.println("Total   : " + (p.price * q));
        }
    }

    public void totalPrice() {

        double total = 0;

        for (Product p : cart) {

            total += p.price * quantity.get(p.name);
        }

        System.out.println("Total Price = " + total);
    }
}

