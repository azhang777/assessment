public abstract class Person {
    private String name;
    private Size size;
    private Clothing[] clothingItems;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Clothing[] getClothingItems() {
        return clothingItems;
    }

    public void setClothingItems(Clothing[] clothingItems) {
        this.clothingItems = clothingItems;
    }
}
