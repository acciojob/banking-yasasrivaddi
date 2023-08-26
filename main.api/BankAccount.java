public class BankAccount {
    protected String name;
    protected double balance;
    protected double minimumBalance;

    public BankAccount(String name, double minimumBalance) {
        this.name = name;
        this.balance = 0;
        this.minimumBalance = minimumBalance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) throws Exception {
        if (balance - amount < minimumBalance) {
            throw new Exception("Insufficient Balance");
        }
        balance -= amount;
    }

    public String generateAccountNumber(int digits, int sum) throws Exception {
        if (digits <= 0 || sum < 0) {
            throw new Exception("Account Number can not be generated");
        }
        StringBuilder accountNumber = new StringBuilder();
        for (int i = 0; i < digits - 1; i++) {
            int digit = Math.min(9, sum);
            accountNumber.append(digit);
            sum -= digit;
        }
        accountNumber.append(sum);
        return accountNumber.toString();
    }
}
