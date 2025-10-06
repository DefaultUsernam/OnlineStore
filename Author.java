// Ulises Cantor
// 10/6/2025
// Menchukov
// Computer Programming 3
// Online Store Project
// This Author class helps give authors their full names and dates of birth to help with giving all of the Book objects an Author

public class Author {
    private String dOB;
    private String fullName;

    public Author(String d, String a) {
        dOB = d;
        fullName = a;
    }

    public String getDOB() {
        return dOB;
    }

    public String getFullName() {
        return fullName;
    }

    public void setDOB(String d) {
        dOB = d;
    }

    public void setFullName(String f) {
        fullName = f;
    }
}
