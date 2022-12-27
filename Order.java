import java.util.ArrayList;

public class Order {

    private String name;
    private boolean ready;
    private ArrayList<Item> items = new ArrayList<Item>();

    public Order() {
        this.name = "Guest";
        this.items = new ArrayList<Item>();
    }

    public Order(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isReady() {
        return ready;
    }

    public void setReady(boolean ready) {
        this.ready = ready;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    public void addItem(Item item){
        items.add(item);
    }

    public String getStatusMessage(){
        if (ready){
            return "Your order is ready.";
        } else
            return "Thank you for waiting. Your order will be ready soon.";
    }

    public double getOrderTotal(){
        double total = 0.0;
        for (int i = 0; i < items.size(); i++) {
            Item item = items.get(i);
            total += item.getPrice();
        }

        return total;
    }
//
//    public void display(){
//        System.out.println("Customer name: " + getName());
//        for (int i = 0; i < items.size(); i++) {
//            Item item = items.get(i);
//            System.out.println(item.getName() + " - " + item.getPrice());
//        }
//        System.out.println("Total: " + getOrderTotal());
//    }
}
