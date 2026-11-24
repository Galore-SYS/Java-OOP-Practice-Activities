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
"What should I check before deducting printing credits?"

Accepted:
I used the suggestion to check if the page count is positive
and if the account has enough credits.

Rejected:
I avoided adding features that were not required.

Verification:
I ran the program and checked if the output matched
the expected results in the handout.
*/
