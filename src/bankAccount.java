public class bankAccount {
        private final String accountHolder;
        private final String accountNumber;
        private double balance;

        public bankAccount(String accountHolder, String accountNumber, double initialBalance) {
            this.accountHolder = accountHolder;
            this.accountNumber = accountNumber;
            this.balance = Math.max(0, initialBalance);
        }

        public void deposit(double amount) {
            if (amount <= 0) {
                throw new IllegalArgumentException("Deposit amount must be positive");
            }
            balance += amount;
        }

        public void withdraw(double amount) {
            if (amount <= 0) {
                throw new IllegalArgumentException("Withdrawal amount must be positive");
            }
            if (amount > balance) {
                throw new IllegalStateException("Insufficient funds");
            }
            balance -= amount;
        }


        public double getBalance() {
            return balance;
        }

        public String getAccountHolder() {
            return accountHolder;
        }

        public String getAccountNumber() {
            return accountNumber;
        }
    }




}
