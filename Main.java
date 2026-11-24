
public class LabGrade {

    // Private attributes
    private String studentName;
    private int quizScore;
    private int labScore;

    // Constructor
    public LabGrade(String studentName, int quizScore, int labScore) {
        this.studentName = studentName;

        // Validate quiz score independently
        if (quizScore >= 0 && quizScore <= 100) {
            this.quizScore = quizScore;
        } else {
            this.quizScore = 0;
        }

        // Validate lab score independently
        if (labScore >= 0 && labScore <= 100) {
            this.labScore = labScore;
        } else {
            this.labScore = 0;
        }
    }

    // Update both scores only if both are valid
    public boolean updateScores(int quizScore, int labScore) {

        if (quizScore < 0 || quizScore > 100 ||
            labScore < 0 || labScore > 100) {
            return false;
        }

        this.quizScore = quizScore;
        this.labScore = labScore;

        return true;
    }

    // Calculate weighted final grade
    public double getFinalGrade() {
        return (this.quizScore * 0.40) + (this.labScore * 0.60);
    }

    // Check if student passes
    public boolean isPassing() {
        return this.getFinalGrade() >= 75.0;
    }

    // Getter for student name
    public String getStudentName() {
        return this.studentName;
    }
}



// Activity 2, Q1:
// Both scores must be validated before assigning either one
// to prevent partial updates. If one score is invalid, both
// original scores must remain unchanged.
