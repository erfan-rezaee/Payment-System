package app;

import payment.model.CardPayment;
import payment.model.CashPayment;
import payment.model.Payment;
import payment.model.WalletPayment;
import payment.service.PaymentProcessor;

public class Main {
    public static void main(String[] args){

        Payment payment1 =
                new CardPayment(
                        "PAY-1001",
                        1_000_000,
                        "6037991234567890"
                );

        Payment payment2 =
                new WalletPayment(
                        "PAY-1002",
                        2_000_000,
                        "WALLET-1001"
                );

        Payment payment3 =
                new CashPayment(
                        "PAY-1003",
                        500_000
                );

        Payment[] payments = {

                payment1,
                payment2,
                payment3
        };

        PaymentProcessor processor = new PaymentProcessor();
        int count = 0;
        for (Payment payment: payments){
            count++;
            System.out.println("========== Payment " + count +" ==========");
            processor.process(payment);
            System.out.println();
        }
    }
}
