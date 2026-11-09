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

        // Set the Industry Titan threshold
        final int TITAN_THRESHOLD = 500000;

        // Track the number of mergers
        int mergerCount = 0;

        // Store the Industry Titan
        Company titan = null;

        System.out.println("=== CORPORATE MERGER SIMULATOR ===");
        System.out.println("Starting companies: " + market.size());

        // Check if any starting company is already a Titan
        for (Company company : market) {
            if (company.getSize() >= TITAN_THRESHOLD) {
                titan = company;
                break;
            }
        }

        // Start merging while at least two companies remain
        // and no Titan has emerged
        while (market.size() >= 2 && titan == null) {

            // Remove the two smallest companies
            Company companyA = market.poll();
            Company companyB = market.poll();

            // Calculate the new size with 10% synergy
            int newSize = (int) ((companyA.getSize()
                    + companyB.getSize()) * 1.1);

            // Combine the company names
            String newName = companyA.getName()
                    + "-" + companyB.getName();

            // Create the merged company
            Company mergedCompany = new Company(newName, newSize);

            // Increase the merger counter
            mergerCount++;

            // Print merger report
            System.out.println("\nMERGER: " + companyA.getName()
                    + " and " + companyB.getName()
                    + " have merged into " + newName
                    + " with size " + newSize + "!");

            // Check if the new company becomes a Titan
            if (newSize >= TITAN_THRESHOLD) {
                titan = mergedCompany;

                System.out.println("\n*** INDUSTRY TITAN HAS EMERGED! ***");
            } else {
                // Add the merged company back into the market
                market.add(mergedCompany);
            }
        }

        // Display final report
        System.out.println("\n=== FINAL MARKET REPORT ===");

        if (titan != null) {
            System.out.println("Industry Titan: " + titan);
        } else {
            System.out.println("No titan has emerged.");
        }

        System.out.println("Total mergers: " + mergerCount);

        // Display the last remaining company if applicable
        if (titan == null && market.size() == 1) {
            System.out.println("Last remaining company: " + market.peek());
        }
    }
}
