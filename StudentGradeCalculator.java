import java.util.*;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input total subjects
        System.out.println("Enter the number of subjects:");
        int n = sc.nextInt();
        int totalmarks = 0;

        // Input marks of each subject and calculate total marks
        for (int i = 1; i <= n; i++) {
            System.out.println("Enter marks of subject" + i + ":");
            int subjectmarks = sc.nextInt();
            subjectmarks = subjectmarks + i;
            totalmarks = +subjectmarks;
        }

        // Calculate avg percentage
        double avgPercentage = (double) totalmarks / n;

        // Calculate Grade
        char grade = calculateGrade(avgPercentage);

        System.out.println("Results:");
        System.out.println("Totalmarks:" + totalmarks);
        System.out.println("Average Percentage:" + avgPercentage);
        System.out.println("Grade is:" + grade);

        sc.close();
    }

    public static char calculateGrade(double avgPercentage) {
        if (avgPercentage >= 90)
            System.out.println("Grade A");
        else if (avgPercentage >= 80 && avgPercentage < 90)
            System.out.println("Grade B");
        else if (avgPercentage >= 70 && avgPercentage < 80)
            System.out.println("Grade C");
        else if (avgPercentage >= 60 || avgPercentage < 70)
            System.out.println("Grade D");
        else
            System.out.println("FAIL");
        return 0;
    }
}
