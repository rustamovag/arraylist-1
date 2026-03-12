import java.util.*;

public class ArrayListBasic {
    public static void main(String[] args) {
        // Create and populate
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");
        fruits.add("Elderberry");
        System.out.println("List: " + fruits);
        System.out.println("Size: " + fruits.size());

        // Access
        System.out.println("\n=== Access ===");
        System.out.println("First : " + fruits.get(0));
        System.out.println("Last  : " + fruits.get(fruits.size()-1));
        System.out.println("Index of 'Cherry': " + fruits.indexOf("Cherry"));
        System.out.println("Contains 'Grape': " + fruits.contains("Grape"));

        // Modify
        System.out.println("\n=== Modify ===");
        fruits.set(1, "Blueberry");
        fruits.add(2, "Coconut");
        System.out.println("After set+insert: " + fruits);
        fruits.remove("Date");
        System.out.println("After remove 'Date': " + fruits);
        fruits.remove(0);
        System.out.println("After remove index 0: " + fruits);

        // Iteration
        System.out.println("\n=== Iteration ===");
        for (String f : fruits) System.out.println("  " + f + " (" + f.length() + " chars)");

        // Sorting
        System.out.println("\nBefore sort: " + fruits);
        Collections.sort(fruits);
        System.out.println("After sort : " + fruits);
        Collections.sort(fruits, Comparator.comparingInt(String::length));
        System.out.println("By length  : " + fruits);

        // Shopping cart simulation
        System.out.println("\n=== Shopping Cart ===");
        ArrayList<String> cart = new ArrayList<>();
        cart.add("Laptop $999");
        cart.add("Mouse $29");
        cart.add("Keyboard $79");
        System.out.println("Cart: " + cart);
        System.out.println("Items: " + cart.size());
        cart.remove("Mouse $29");
        System.out.println("After removing mouse: " + cart);
    }
}
