public class  Item {
    String name;
    int price;

    public Item(String name) {
        this.name = name;
        this.price = 0;
        System.out.println(name);
    }

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }
}
