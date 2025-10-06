// Ulises Cantor
// 10/6/2025
// Menchukov
// Computer Programming 3
// Online Store Project
// This ItemForSale class is a parent class for the Book and Movie classes and creates a generic template for Store items which contain, at the bare minimum, a name, price, and the date that they were put on sale

public class ItemForSale {
    private String name;
    private int price;
    private String dateOnSale;

    public ItemForSale(String n, int p, String d) {
        name = n;
        price = p;
        dateOnSale = d;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getDate() {
        return dateOnSale;
    }

    public String getCreator() {
        return "";
    }

    public void setCreator(String n) {
        name = n;
    }

    public void setPrice(int p) {
        price = p;
    }

    public void setDate(String d) {
        dateOnSale = d;
    }
}
