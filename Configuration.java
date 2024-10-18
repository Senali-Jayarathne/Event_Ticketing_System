public class Configuration {
    private int totalTickets;
    private double ticketReleaseRate;
    private double customerRetrievalRate;
    private int maxTicketCapacity;

    // Getters
    public int getTotalTickets() {
        return totalTickets;
    }

    public double getTicketReleaseRate() {
        return ticketReleaseRate;
    }

    public double getCustomerRetrievalRate() {
        return customerRetrievalRate;
    }

    public int getMaxTicketCapacity() {
        return maxTicketCapacity;
    }

    // Setters with validation
    public void setTotalTickets(int totalTickets) {
        if (totalTickets <= 0) {
            throw new IllegalArgumentException("Total Tickets must be a positive integer.");
        }
        this.totalTickets = totalTickets;
    }

    public void setTicketReleaseRate(double ticketReleaseRate) {
        if (ticketReleaseRate <= 0) {
            throw new IllegalArgumentException("Ticket Release Rate must be a positive number.");
        }
        this.ticketReleaseRate = ticketReleaseRate;
    }

    public void setCustomerRetrievalRate(double customerRetrievalRate) {
        if (customerRetrievalRate <= 0) {
            throw new IllegalArgumentException("Customer Retrieval Rate must be a positive number.");
        }
        this.customerRetrievalRate = customerRetrievalRate;
    }

    public void setMaxTicketCapacity(int maxTicketCapacity) {
        if (maxTicketCapacity <= 0) {
            throw new IllegalArgumentException("Max Ticket Capacity must be a positive integer.");
        }
        this.maxTicketCapacity = maxTicketCapacity;
    }
}
