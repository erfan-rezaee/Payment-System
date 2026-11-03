package payment.model;

public class CashPayment extends Payment {

    public CashPayment(String paymentId, double amount){

        super(paymentId, amount);
    }

    @Override
    public void processPayment() {
        System.out.println("Processing cash payment...");
    }

    @Override
    public double calculateFee() {
        return super.calculateFee();
    }
}
