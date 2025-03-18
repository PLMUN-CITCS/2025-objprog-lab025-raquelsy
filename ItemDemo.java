class Item {
    static int objectCount = 0; // Static variable to track object count
    String itemName; // Instance variable for item name

    // Constructor
    public Item(String itemName) {
        this.itemName = itemName;
        objectCount++; // Increment object count
    }

    // Static method to display object count
    public static void displayObjectCount() {
        System.out.println("Total objects created: " + objectCount);
    }

    // Instance method to display item name
    public void displayItem() {
        System.out.println("Item: " + itemName);
    }
}

public class ItemDemo {
    public static void main(String[] args) {
        // Creating Item objects
        Item item1 = new Item("Laptop");
        Item item2 = new Item("Smartphone");
        Item item3 = new Item("Tablet");

        // Displaying item names
        item1.displayItem();
        item2.displayItem();
        item3.displayItem();

        // Displaying total object count
        Item.displayObjectCount();
    }
}
