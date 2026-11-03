package payment.model;

public class CardPayment extends Payment{

    private final String cardNumber;

    public CardPayment(String paymentId, double amount, String cardNumber){
        super(paymentId, amount);

        if (cardNumber == null || cardNumber.isBlank()){
            throw new IllegalArgumentException("Invalid cardNumber!");
        }

        if(cardNumber.length() < 4){
            throw new IllegalArgumentException("Invalid cardNumber!");
        }
        this.cardNumber = cardNumber;
    }

    @Override
    public void processPayment(){
        System.out.println("Processing card Payment...");
    }

    @Override
    public double calculateFee(){

        double fee = getAmount() * 0.02;

        if (!Double.isFinite(fee)){
            throw new IllegalArgumentException("Invalid fee!");
        }
        return fee;
    }


}
