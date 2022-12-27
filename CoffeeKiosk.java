import java.util.ArrayList;

public class CoffeeKiosk {

    private ArrayList<Item> menu;
    private ArrayList<Order> orders;

    public CoffeeKiosk() {
        menu = new ArrayList<Item>();
        orders = new ArrayList<Order>();
    }

    public void addMenuItem() {
        Item item1 = new Item("banana", 2.0);
        menu.add(item1);
        Item item2 = new Item("coffee", 1.5);
        menu.add(item2);
        Item item3 = new Item("latte", 4.5);
        menu.add(item3);
        Item item4 = new Item("cappuccino", 3.0);
        menu.add(item4);
        Item item5 = new Item("muffin", 4.0);
        menu.add(item5);
    }


    public void displayMenu() {

        for (int index = 0; index < menu.size(); index++) {
            Item currentItem = menu.get(index);
            System.out.println(index + " " + currentItem.getName() + " -- " + currentItem.getPrice());
        }
    }



    public void newOrder() {

        System.out.println("Please enter customer name for new order:");
        String name = System.console().readLine();
        Order currentOrder = new Order(name);

        addMenuItem();
        displayMenu();

        String itemNumber = "";
        // Write a while loop to collect all user's order items
        while (!itemNumber.equals("q")) {
            System.out.println("Please enter a menu item index or q to quit:");
             itemNumber = System.console().readLine();

            if (!itemNumber.equals("q")) {
                currentOrder.addItem(menu.get(Integer.parseInt(itemNumber)));
            }
        }
        orders.add(currentOrder);
       
        System.out.println("Thank you " + name + ". Here are your order details: ");
        System.out.println("Customer name: " + name);
        ArrayList<Item> currentItems = currentOrder.getItems();
        for (int i = 0; i < currentItems.size(); i++) {
            Item item = currentItems.get(i);
            System.out.println(item.getName() + " " + item.getPrice());
        }

        System.out.println("Total: " + currentOrder.getOrderTotal());


    }

}
