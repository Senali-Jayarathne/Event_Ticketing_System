import java.util.Scanner;

public class ConfigurationManager {
    private Configuration config;
    private Scanner scanner;

    public ConfigurationManager() {
        this.config = new Configuration();
        this.scanner = new Scanner(System.in);
    }

    public void configure() {
        config.setTotalTickets(100);
        config.setTicketReleaseRate(8);
        config.setCustomerRetrievalRate(9);
        config.setMaxTicketCapacity(10);

        System.out.println("Configuration successful:");
        System.out.println("Total Tickets: " + config.getTotalTickets());
        System.out.println("Ticket Release Rate: " + config.getTicketReleaseRate());
        System.out.println("Customer Retrieval Rate: " + config.getCustomerRetrievalRate());
        System.out.println("Max Ticket Capacity: " + config.getMaxTicketCapacity());
    }

}
