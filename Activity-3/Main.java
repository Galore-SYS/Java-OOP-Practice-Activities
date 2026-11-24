
public class Main {

    public static void main(String[] args) {

        // Create two independent wallets
        CampusWallet aly = new CampusWallet("Aly", 100);
        CampusWallet ben = new CampusWallet("Ben");

        // Test 1: Display starting balances
        System.out.println("INITIAL BALANCES");
        System.out.println(aly.getOwner() + ": " + aly.getBalance());
        System.out.println(ben.getOwner() + ": " + ben.getBalance());

        // Test 2: Aly transfers 35 credits to Ben
        System.out.println("\nALY TRANSFERS 35 CREDITS");
        System.out.println("Transfer successful: "
                + aly.transferTo(ben, 35));

        System.out.println("Aly: " + aly.getBalance());
        System.out.println("Ben: " + ben.getBalance());

        // Test 3: Aly tries to transfer 70 credits
        System.out.println("\nALY TRANSFERS 70 CREDITS");
        System.out.println("Transfer successful: "
                + aly.transferTo(ben, 70));

        System.out.println("Aly: " + aly.getBalance());
        System.out.println("Ben: " + ben.getBalance());

        // Test 4: Aly tries to transfer to herself
        System.out.println("\nALY TRANSFERS TO HERSELF");
        System.out.println("Transfer successful: "
                + aly.transferTo(aly, 10));

        System.out.println("Aly: " + aly.getBalance());
        System.out.println("Ben: " + ben.getBalance());

        // Test 5: Ben deposits 15 credits
        System.out.println("\nBEN DEPOSITS 15 CREDITS");
        System.out.println("Deposit successful: "
                + ben.deposit(15));

        System.out.println("Aly: " + aly.getBalance());
        System.out.println("Ben: " + ben.getBalance());

        // Test 6: Aly transfers remaining 65 credits
        System.out.println("\nALY TRANSFERS REMAINING 65 CREDITS");
        System.out.println("Transfer successful: "
                + aly.transferTo(ben, 65));

        System.out.println("Aly: " + aly.getBalance());
        System.out.println("Ben: " + ben.getBalance());

        // Additional Test 7: Zero-credit transfer
        System.out.println("\nZERO-CREDIT TRANSFER");
        System.out.println("Transfer successful: "
                + ben.transferTo(aly, 0));

        System.out.println("Aly: " + aly.getBalance());
        System.out.println("Ben: " + ben.getBalance());

        // Additional Test 8: Transfer to null
        System.out.println("\nTRANSFER TO NULL");
        System.out.println("Transfer successful: "
                + ben.transferTo(null, 10));

        System.out.println("Aly: " + aly.getBalance());
        System.out.println("Ben: " + ben.getBalance());
    }
}
