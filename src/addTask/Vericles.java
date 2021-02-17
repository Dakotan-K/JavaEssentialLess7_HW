package addTask;

public enum Vericles {

    Car1(11000, "red"), Car2(15000, "black"), Car3(7500, "yellow"), Car4(9000, "green");

    private int price;
    private String color;

    Vericles(int price, String color) {
        this.price = price;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return this.name() + ": price = " + price + ", color = " + this.getColor();
    }
}
