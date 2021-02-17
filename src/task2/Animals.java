package task2;

public enum Animals {
    Dog (10), Cat (5), Cow (2), Horse (3), Giraf (4);

    private int age;

    Animals(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return this.name() + ": age = " + this.age;
    }
}
