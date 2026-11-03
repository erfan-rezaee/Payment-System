package payment.model;

public class WalletPayment extends Payment{

    private final String walletId;

    public WalletPayment(String paymentId, double amount, String walletId){

        super(paymentId, amount );

        if (walletId == null || walletId.isBlank()){
            throw new IllegalArgumentException("Invalid walletId!");
        }
        this.walletId = walletId;
    }

    @Override
    public void processPayment(){
        System.out.println("Processing wallet payment...");
    }

    @Override
    public double calculateFee(){

        double fee = getAmount() * 0.01;

        if (!Double.isFinite(fee)){
            throw new IllegalArgumentException("Invalid fee!");
        }
        return fee;
    }

}
