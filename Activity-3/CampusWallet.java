
public class CampusWallet {

    // Private attributes
    private String owner;
    private int balance;

    // Two-argument constructor
    public CampusWallet(String owner, int balance) {
        this.owner = owner;

        if (balance < 0) {
            this.balance = 0;
        } else {
            this.balance = balance;
        }
    }

    // One-argument constructor using constructor chaining
    public CampusWallet(String owner) {
        this(owner, 0);
    }

    // Deposit credits
    public boolean deposit(int amount) {

        if (amount <= 0) {
            return false;
        }

        this.balance += amount;
        return true;
    }

    // Transfer credits to another wallet
    public boolean transferTo(CampusWallet recipient, int amount) {

        // Check if recipient exists
        if (recipient == null) {
            return false;
        }

        // Prevent transferring to the same wallet
        if (recipient == this) {
            return false;
        }

        // Check if amount is positive
        if (amount <= 0) {
            return false;
        }

        // Check if sender has enough credits
        if (amount > this.balance) {
            return false;
        }

        // Perform transfer
        this.balance -= amount;
        recipient.balance += amount;

        return true;
    }

    // Getter for balance
    public int getBalance() {
        return this.balance;
    }

    // Getter for owner
    public String getOwner() {
        return this.owner;
    }
}
