// Payment.java
// The ABSTRACTION. This class holds everything that is true of EVERY payment.

// It must never be created directly - nobody should be able to write
// new Payment(...) because "a payment" with no method is not a real thing.

public abstract class Payment {

    private final int id;
    private String payerName;
    private double amount;

    public Payment(int id, String payerName, double amount) {
        this.id = id;
        this.payerName = payerName;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public String getPayerName() {
        return payerName;
    }

    public double getAmount() {
        return amount;
    }

    // TODO 4
    public abstract void pay();

    public abstract String provider();

    // Version 1: standard 2% fee
    public double serviceFee() {
        return amount * 0.02;
    }

    // TODO 5: overloaded version
    public double serviceFee(double rate) {
        return amount * rate;
    }

    // TODO 6
    public void printReceipt() {
        System.out.printf("[%d] %-6s %-10s PHP %10.2f%n",
                id, provider(), payerName, amount);
        pay();
    }

    // Already provided
    public void printThankYou() {
        System.out.println(" Thank you for your payment.");
    }
}
