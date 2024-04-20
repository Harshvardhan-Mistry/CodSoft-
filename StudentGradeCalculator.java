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
            System.out.println("Enter marks obtained in each subject" + i + ":");
            int subjectmarks = sc.nextInt();
            totalmarks += subjectmarks;
        }

        // Calculate avg percentage
        double averagePercentage = (double) totalmarks / (n * 100.0) * 100.0;

        // Calculate Grade
        String grade;
        if (averagePercentage >= 90)
            grade = "Grade A";
        else if (averagePercentage >= 80 && averagePercentage < 90)
            grade = "Grade B";
        else if (averagePercentage >= 70 && averagePercentage < 80)
            grade = "Grade C";
        else if (averagePercentage >= 60 || averagePercentage < 70)
            grade = "Grade D";
        else
            grade = "FAIL";

        System.out.println("Your Results is:");
        System.out.println("Totalmarks:" + totalmarks);
        System.out.println("Average Percentage:" + averagePercentage);
        System.out.println("Grade is:" + grade);
        sc.close();
    }
}
