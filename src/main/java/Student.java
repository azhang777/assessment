public class Student extends Customer implements Discountable {
    private long studentID;
    private static final double DISCOUNT = .50;
    public Student(String name) {
        super(name);
    }

    @Override
    public double calculateDiscount(Clothing clothing) {
        return clothing.getPrice() * DISCOUNT;
    }
}
