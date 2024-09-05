import java.util.*;

public class Grader {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int grade = 0;
        int numStudent = 0;
        int n = 0;
        int difference = 0;
        int nextMultipleOfFive = 0;

        System.out.println("");
        numStudent = Integer.parseInt(scan.nextLine());

        while (n < numStudent){
           System.out.println("What is the grade of this student:");
           grade = Integer.parseInt(scan.nextLine());
           nextMultipleOfFive = (grade/5)*5 + 5;
           difference = nextMultipleOfFive - grade;
            
           if (difference < 3 && grade > 37){
              System.out.println(nextMultipleOfFive);
           } else {
              System.out.println(grade);
           }
           n += 1;
        }
    }
}
