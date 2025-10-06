// Ulises Cantor
// 10/6/2025
// Menchukov
// Computer Programming 3
// Online Store Project
// This Movie class creates a Movie object with a duration and its director and is the child class for the ItemForSale class

public class Movie extends ItemForSale {
    private int length;
    private String creator;

    public Movie(String t, int p, String d, int l, String c) {
        super(t, p, d);
        length = l;
        creator = c;
    }

    public int getDuration() {
        return length;
    }

    public String getCreator() {
        return creator;
    }

    public void setDuration(int l) {
        length = l;
    }

    public void setCreator(String c) {
        creator = c;
    }
}
