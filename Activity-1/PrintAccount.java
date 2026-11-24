public class PrintAccount {

    // Private attributes
    private String studentName;
    private int credits;

    // Constructor
    public PrintAccount(String studentName, int credits) {
        this.studentName = studentName;

        if (credits < 0) {
            this.credits = 0;
        } else {
            this.credits = credits;
        }
    }

    // Add credits if the amount is positive
    public boolean addCredits(int amount) {
        if (amount <= 0) {
            return false;
        }

        this.credits += amount;
        return true;
    }

    // Print pages if enough credits are available
    public boolean printPages(int pages) {
        if (pages <= 0 || pages > this.credits) {
            return false;
        }

        this.credits -= pages;
        return true;
    }

    // Getter for credits
    public int getCredits() {
        return this.credits;
    }

    // Getter for student name
    public String getStudentName() {
        return this.studentName;
    }
}
