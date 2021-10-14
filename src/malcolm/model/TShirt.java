package malcolm.model;

import java.util.Random;

public class TShirt {

    private String name;
    private double price;
    private Color color;
    private Size size;
    private Fabric fabric;
    private static String[] names;

   

    //static block will run ONCE during the programm
    static { // will initialize array even before first object is made. for our project, we could easily put it in cconstuctor.
        names = new String[]{"Aloha", "Baseball", "Camp",
            "Epaulette", "Lumberjack", "Granddad", "Golf",
            "Henley", "Polo", "Tuxedo", "Tunic", "Sweatshirt"};
        System.out.println("Static block");
    }

    public TShirt() {
        name = randomName();
        color = randomColor();
        size = randomSize();
        fabric = randomFabric();
        price = getColorPrice() + getSizePrice();
    }

    public static String[] getNames() {
        return names;
    }

    public TShirt(String name, double price, Color color, Size size, Fabric fabric) {
        this.name = name;
        this.price = price;
        this.color = color;
        this.size = size;
        this.fabric = fabric;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
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

    public Fabric getFabric() {
        return fabric;
    }

    public void setFabric(Fabric fabric) {
        this.fabric = fabric;
    }

    //method to get a random name
    private String randomName() {
        Random random = new Random();
        int arrayLength = names.length;
        int index = random.nextInt(arrayLength);
        String randomName = names[index];
        return randomName;
    }

    //method to get a random Fabric
    private Fabric randomFabric() {
        Random random = new Random();
        Fabric[] fabrics = Fabric.values();
        int index = random.nextInt(fabrics.length);
        Fabric randomFabric = fabrics[index];
        return randomFabric;
    }

    //method to get a random Fabric
    private Color randomColor() {
        Random random = new Random();
        Color[] colors = Color.values();
        int index = random.nextInt(colors.length);
        Color randomColor = colors[index];
        return randomColor;
    }

    //method to get a random Size
    private Size randomSize() {
        Random random = new Random();
        Size[] sizes = Size.values();
        int index = random.nextInt(sizes.length);
        Size randomSize = sizes[index];
        return randomSize;
    }

    public double getColorPrice() {
        double colorPrice = 5;
        if (color.ordinal() < 3) {
            colorPrice += 3;
        } else if (color.ordinal() < 7) {
            colorPrice += 4;
        }
        return colorPrice;
    }

    public double getSizePrice() {
        double sizePrice = 0;
        if (size.ordinal() < 3) {
            sizePrice = 2;
        } else if (size.ordinal() < 6) {
            sizePrice = 3;
        }
        return sizePrice;
    }

    @Override
    public String toString() {
        return "TShirt{" + "name=" + name + ", price=" + price + ", color=" + color + ", size=" + size + ", fabric=" + fabric + '}';
    }

}
