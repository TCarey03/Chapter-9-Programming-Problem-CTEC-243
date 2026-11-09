public class Company implements Comparable<Company> {

    private String name;
    private int size;

    // Constructor
    public Company(String name, int size) {
        this.name = name;
        this.size = size;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    // Compare companies by size
    @Override
    public int compareTo(Company other) {
        return Integer.compare(this.size, other.size);
    }

    // Display company information
    @Override
    public String toString() {
        return name + " (Size: " + size + ")";
    }
}
