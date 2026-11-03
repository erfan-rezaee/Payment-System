package payment.model;

public class Payment {

    private final String paymentId;
    private final double amount;

    public Payment(String paymentId, double amount){

        if (paymentId == null || paymentId.isBlank()){
            throw new IllegalArgumentException("Invalid paymentId");
        }

        if (!Double.isFinite(amount) || amount <= 0){
            throw new IllegalArgumentException("Invalid ");
        }

        this.paymentId = paymentId;
        this.amount = amount;
    }

    public String getPaymentId(){
        return paymentId;
    }

    public double getAmount(){
        return amount;
    }

    public void processPayment(){
        System.out.println("Processing generic payment...");
    }

    public double calculateFee(){
        return 0;
    }
}
