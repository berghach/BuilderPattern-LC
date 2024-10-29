import bank.BankAccount;

public class App {
    public static void main(String[] args){
        BankAccount bankAccount1 = new BankAccount
                .BankAccountBuilder("Jon", "22738022275")
                .setEmail("jon@example.com")
                .setIsNewsletter(true)
                .build();
        BankAccount bankAccount2 = new BankAccount
                .BankAccountBuilder("Doe", "98785259455")
                .build();

        System.out.println(bankAccount1.toString());
        System.out.println(bankAccount2.toString());
    }
}
