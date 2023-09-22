import java.util.ArrayList;

public class Main {
    //having issues calling shop methods. They don't pop up with the smart lookup when trying to invoke them (besides sortAndPrintClothingItemsByPrice)
    public static double calculateTotal(Clothing[] clothing) {
        double total = 0.0;
        for (Clothing item: clothing) {
            total += item.getPrice();
        }
        return total;
    }

    public static boolean isAFit(Customer customer, Clothing clothing) {
        return customer.getSize().equals(clothing.getSize());
    }

    public static void printDiscountAmountOff(Discountable[] discountables, Clothing clothing) {
        for (Discountable element: discountables) {
            System.out.println(element.calculateDiscount(clothing));
        }
    }
//    public void sortAndPrintClothingItemsByPrice(ArrayList<Clothing> clothingList) {
//        boolean swapped;
//        for (int i = 0; i < clothingList.size()-1; i++) {
//            swapped = false;
//            for (int j = 0; j < clothingList.size() - 1 - i; j++) {
//                if (clothingList.get(j) == null || clothingList.get(j+1) == null) {
//                    // If any of the elements is null, don't compare; move to the next iteration
//                    continue;
//                }
//                if (clothingList.get(j).getPrice() < clothingList.get(j+1).getPrice()) { // > sorts from lowest to greatest | < sorts from greatest to lowest
//                    Clothing temp = clothingList.get(j);
//
//                    clothingList.set(j,clothingList.get(j+1));
//                    students[j] = students[j+1];
//                    students[j+1] = temp;
//                    swapped = true;
//                }
//            }
//
//            if (!swapped) {
//                break;
//            }
//        }
//        return clothingList;
//    }
    public static void main(String[] args) {

        Clothing jeans = new Clothing("Blue Jeans", 20.0, Size.M);
        Clothing tShirt = new Clothing("White T Shirt", 5.0,Size.S);
        Clothing buttonUp = new Clothing("Button Up Shirt", 30.0, Size.L);
        Clothing[] managerCart = {jeans, tShirt, buttonUp};
        Manager manager = new Manager("Greg");
        manager.setSize(Size.S);//note that manager's sizing is S
        manager.setClothingItems(managerCart);
        Clothing[] hourlyEmployeeCart = {jeans, tShirt, buttonUp};
        HourlyEmployee employee = new HourlyEmployee("Tom"); //note that hourlyEmployee's sizing is L

        employee.setSize(Size.L);
        employee.setClothingItems(hourlyEmployeeCart);
        System.out.println(calculateTotal(managerCart));
        System.out.println(isAFit(employee,jeans));
        employee.printElementPriceAfterDiscount(jeans);
        manager.printElementPriceAfterDiscount(jeans);

        Clothing[] studentCart = {jeans,tShirt,buttonUp};
        Student student = new Student("Candace");
        System.out.println(student.calculateDiscount(jeans));

        manager.printCustomerName(manager);
        employee.printCustomerName(employee);
        student.printCustomerName(student);

        ArrayList<Clothing> clothing = new ArrayList<>();
        clothing.add(jeans);
        clothing.add(tShirt);
        clothing.add(buttonUp);

        Discountable[] discountables = {manager,employee,student};
        printDiscountAmountOff(discountables,tShirt);
    }
}
