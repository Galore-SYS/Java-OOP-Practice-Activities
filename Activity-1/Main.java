public class Main {

    public static void main(String[] args) {

        // Create two independent accounts
        PrintAccount mia = new PrintAccount("Mia", 10);
        PrintAccount luis = new PrintAccount("Luis", -4);

        // Display starting credits
        System.out.println("Starting Accounts:");
        System.out.println(mia.getStudentName() + ": " + mia.getCredits());
        System.out.println(luis.getStudentName() + ": " + luis.getCredits());

        // Test 1: Mia prints 4 pages
        System.out.println("\nMia prints 4 pages: "
                + mia.printPages(4));
        System.out.println("Mia's credits: " + mia.getCredits());

        // Test 2: Mia tries to print 7 pages
        System.out.println("\nMia tries to print 7 pages: "
                + mia.printPages(7));
        System.out.println("Mia's credits: " + mia.getCredits());

        // Test 3: Mia tries to add negative credits
        System.out.println("\nMia tries to add -3 credits: "
                + mia.addCredits(-3));
        System.out.println("Mia's credits: " + mia.getCredits());

        // Test 4: Mia adds 4 credits
        System.out.println("\nMia adds 4 credits: "
                + mia.addCredits(4));

        // Display final account balances
        System.out.println("\nFinal Accounts:");
        System.out.println(mia.getStudentName() + ": " + mia.getCredits());
        System.out.println(luis.getStudentName() + ": " + luis.getCredits());
    }
}



/*
Activity 1 - AI Use Note

Prompt used:
"Explain what conditions should be checked before deducting
printing credits from a student's account."

Accepted:
The validation checks for positive page counts and sufficient
credits before deducting the balance.

Rejected:
No unnecessary changes to the required class structure or
additional features.

Verification:
Compared the program's output with the expected results
provided in the practice handout.
*/
