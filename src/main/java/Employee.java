public abstract class Employee extends Customer implements Discountable {
    private static final double DISCOUNT = .10;
    public Employee(String name) {
        super(name);
    }

    public double getDiscount() {
        return DISCOUNT;
    }

    public abstract void printElementPriceAfterDiscount(Clothing clothing);
}
