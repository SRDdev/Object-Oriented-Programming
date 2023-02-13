import java.util.Scanner;
public class Assignment2 {
    public static void main(String[] args) {
        System.out.println("-------------------Welcome to Calculator Program !-------------------");
        System.out.println("1. Press 1 for Addition");
        System.out.println("2. Press 2 for Subtraction");
        System.out.println("3. Press 3 for Multiplication");
        System.out.println("4. Press 4 for Division");
        System.out.println("5. Exit");
        try (Scanner scan = new Scanner(System.in)) {
            int var = scan.nextInt(); 
            System.out.println("Enter the numbers you want to operate on a,b :");
            int a = scan.nextInt();
            int b = scan.nextInt();
            switch(var)
            {
                case 1:
                    System.out.println("Addition is : "+(a+b));
                    break;
                // ------------------End of Case 1------------------//
                case 2:
                    System.out.println("Subtraction is : "+(a-b));
                    break;
                // ------------------End of Case 2------------------//
                case 3:
                    System.out.println("Multiplication is : "+(a*b));
                    break;
                // ------------------End of Case 3------------------//
                case 4:
                    System.out.println("Division is : "+(a/b));
                    break;
                // ------------------End of Case 4------------------//
                case 5:
                    System.out.println("Exit");
                // ------------------End of Case 5------------------//
                default:
                    System.out.println("Wrong choice number. Please Rerun");
            }
            } 
        }
    }