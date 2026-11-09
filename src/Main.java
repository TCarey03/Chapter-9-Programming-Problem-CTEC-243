import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) {

        // Create the market
        PriorityQueue<Company> market = new PriorityQueue<>();

        // Add companies to the market
        market.add(new Company("Disney", 15000));
        market.add(new Company("GE", 25000));
        market.add(new Company("Wayland-Yutani", 40000));
        market.add(new Company("ACME Corp", 12000));
        market.add(new Company("Stark Industries", 35000));
        market.add(new Company("Cyberdyne Systems", 8000));
        market.add(new Company("Umbrella Corporation", 30000));
        market.add(new Company("Weyland Enterprises", 18000));
        market.add(new Company("Oscorp", 22000));
        market.add(new Company("Aperture Science", 5000));

        // Display all companies
        System.out.println("=== CORPORATE MERGER SIMULATOR ===");
        System.out.println("Companies in the market: " + market.size());

        // Remove and display the smallest company
        Company smallest = market.poll();

        System.out.println("\nSmallest company in the market:");
        System.out.println(smallest);

        // Add the company back
        market.add(smallest);

        System.out.println("\nCompany returned to the market.");
        System.out.println("Companies remaining: " + market.size());
    }
}
