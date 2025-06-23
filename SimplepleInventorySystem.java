

import java.util.HashMap;
import java.util.Map;

public class InventorySystem {

    // Product class to hold product name and quantity
    static class Product {
        private String name;
        private int quantity;

        public Product(String name, int quantity) {
            this.name = name;
            this.quantity = quantity;
        }

        public String getName() {
            return name;
        }

        public int getQuantity() {
            return quantity;
        }
    }

    // Inventory class to manage products
    static class Inventory {
        private Map<String, Product> products;

        public Inventory() {
            products = new HashMap<>();
        }

        // Add a product
        public void addProduct(String name, int quantity) {
            products.put(name, new Product(name, quantity));
        }

        // Remove a product
        public void removeProduct(String name) {
            products.remove(name);
        }

        // Check low inventory (quantity < 100)
        public void checkLowInventory() {
            boolean found = false;
            for (Product product : products.values()) {
                if (product.getQuantity() < 100) {
                    System.out.println(product.getName() + " is running low on inventory. Current quantity: " + product.getQuantity());
                    found = true;
                }
            }
            if (!found) {
                System.out.println("No products are low on inventory.");
            }
        }
    }

    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        // Add 3 products
        inventory.addProduct("Mobile", 80);
        inventory.addProduct("Laptop", 150);
        inventory.addProduct("Tablet", 50);

        // Check low inventory
        System.out.println("Check low inventory:");
        inventory.checkLowInventory();

        // Remove "Tablet"
        System.out.println("\nRemove Tablet from the inventory!");
        inventory.removeProduct("Tablet");

        // Check again
        System.out.println("\nAgain check low inventory:");
        inventory.checkLowInventory();
  }
}
