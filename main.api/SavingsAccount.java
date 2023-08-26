public class SavingsAccount extends BankAccount {
    private double rate;
    private double maxWithdrawalLimit;

    public SavingsAccount(String name, double rate, double maxWithdrawalLimit) {
        super(name, 0);
        this.rate = rate;
        this.maxWithdrawalLimit = maxWithdrawalLimit;
    }

    @Override
    public void withdraw(double amount) throws Exception {
        if (amount > maxWithdrawalLimit) {
            throw new Exception("Maximum Withdraw Limit Exceeded");
        }
        super.withdraw(amount);
    }

    public double getSimpleInterest(int years) {
        return balance * (1 + rate * years);
    }

    public double getCompoundInterest(int times, int years) {
        return balance * Math.pow(1 + rate / times, times * years);
    }
}
