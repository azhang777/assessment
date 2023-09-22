public class HourlyEmployee extends Employee {
    public HourlyEmployee(String name) {
        super(name);
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
