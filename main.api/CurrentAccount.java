public class CurrentAccount extends BankAccount {
    private String tradeLicenseId;

    public CurrentAccount(String name, String tradeLicenseId) {
        super(name, 5000);
        this.tradeLicenseId = tradeLicenseId;
    }

    public void validateLicenseId() {
        StringBuilder validLicenseId = new StringBuilder();
        for (int i = 0; i < tradeLicenseId.length(); i++) {
            char currentChar = tradeLicenseId.charAt(i);
            char nextChar = (i < tradeLicenseId.length() - 1) ? tradeLicenseId.charAt(i + 1) : ' ';
            if (currentChar == nextChar) {
                for (int j = 0; j < 26; j++) {
                    char potentialChar = (char) ('A' + j);
                    if (potentialChar != currentChar && potentialChar != nextChar) {
                        validLicenseId.append(potentialChar);
                        break;
                    }
                }
            } else {
                validLicenseId.append(currentChar);
            }
        }
        tradeLicenseId = validLicenseId.toString();
    }
}
