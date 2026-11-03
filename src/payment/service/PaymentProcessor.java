package payment.service;
import payment.model.Payment;

public class PaymentProcessor {

    public void process(Payment payment){

        payment.processPayment();
        double fee = payment.calculateFee();
        double total = fee + payment.getAmount();

        if (!Double.isFinite(total)){
            throw new IllegalArgumentException("Invalid Total!");
        }

        System.out.println("Payment ID: " + payment.getPaymentId());
        System.out.println("Amount: " + payment.getAmount());
        System.out.println("Fee: " + payment.calculateFee());
        System.out.println("Total: " + total);
    }


}
