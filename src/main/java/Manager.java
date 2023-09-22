public class Manager extends Employee{
    public Manager(String name) {
        super(name);
    }
    @Override
    public double getDiscount() {
        return super.getDiscount() + 0.05;
    }

    @Override
    public double calculateDiscount(Clothing clothing) {
        return clothing.getPrice() * getDiscount();
    }

    @Override
    public void printElementPriceAfterDiscount(Clothing clothing) {
        double amountOff = calculateDiscount(clothing);
        double priceAfterDiscount = clothing.getPrice() - amountOff;
        System.out.println(priceAfterDiscount);
    }

}
