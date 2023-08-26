public class StudentAccount extends BankAccount {
    private String institutionName;

    public StudentAccount(String name, String institutionName) {
        super(name, 0);
        this.institutionName = institutionName;
    }
}
