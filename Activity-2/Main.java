
public class Main {

    public static void main(String[] args) {

        // Create two independent student records
        LabGrade ana = new LabGrade("Ana", 80, 90);
        LabGrade ben = new LabGrade("Ben", 101, 85);

        // Test 1: Display initial records
        System.out.println("INITIAL RECORDS");

        System.out.println(ana.getStudentName() + ": "
                + ana.getFinalGrade() + " - "
                + (ana.isPassing() ? "Passing" : "Not Passing"));

        System.out.println(ben.getStudentName() + ": "
                + ben.getFinalGrade() + " - "
                + (ben.isPassing() ? "Passing" : "Not Passing"));

        // Test 2: Invalid update for Ana
        System.out.println("\nANA UPDATES SCORES TO 95 AND 101");

        System.out.println("Update successful: "
                + ana.updateScores(95, 101));

        System.out.println("Ana's grade: " + ana.getFinalGrade());

        // Test 3: Valid update for Ana
        System.out.println("\nANA UPDATES SCORES TO 74 AND 75");

        System.out.println("Update successful: "
                + ana.updateScores(74, 75));

        System.out.println("Ana's grade: " + ana.getFinalGrade());
        System.out.println("Status: "
                + (ana.isPassing() ? "Passing" : "Not Passing"));

        // Test 4: Another valid update
        System.out.println("\nANA UPDATES SCORES TO 75 AND 75");

        System.out.println("Update successful: "
                + ana.updateScores(75, 75));

        System.out.println("Ana's grade: " + ana.getFinalGrade());
        System.out.println("Status: "
                + (ana.isPassing() ? "Passing" : "Not Passing"));

        // Test 5: Check Ben's record again
        System.out.println("\nBEN'S RECORD AGAIN");

        System.out.println("Ben's grade: " + ben.getFinalGrade());
        System.out.println("Status: "
                + (ben.isPassing() ? "Passing" : "Not Passing"));
    }
}


// Activity 2, Q1:
// Both scores must be validated before assigning either one
// to prevent partial updates. If one score is invalid, both
// original scores must remain unchanged.
