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

        System.out.println("=== CORPORATE MERGER SIMULATOR ===");
        System.out.println("Starting companies: " + market.size());

        // Continue merging while companies remain
        while (market.size() >= 2) {

            // Remove the two smallest companies
            Company companyA = market.poll();
            Company companyB = market.poll();

            // Calculate the new size with 10% synergy
            int newSize = (int) ((companyA.getSize()
                    + companyB.getSize()) * 1.1);

            // Combine the company names
            String newName = companyA.getName()
                    + "-" + companyB.getName();

            // Create the new merged company
            Company mergedCompany = new Company(newName, newSize);

            // Display merger information
            System.out.println("\nMERGER: " + companyA.getName()
                    + " and " + companyB.getName()
                    + " have merged into " + newName
                    + " with size " + newSize + "!");

            // Add the new company back into the market
            market.add(mergedCompany);
        }

        System.out.println("\n=== MERGER SIMULATION COMPLETE ===");
    }
}
