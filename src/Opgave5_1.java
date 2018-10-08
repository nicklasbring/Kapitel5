import java.util.Scanner;

public class Opgave5_1 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

        System.out.println("Opgave 5.1");

       //Start values
       int pos = 0;
       int neg = 0;
       int count = 0;
       double sum = 0;

       //Prompt user to enter an integer. It stops when 0 is pressed
        System.out.println("Enter an integer, the input ends if it is 0: ");
        int number = input.nextInt();


        //Executes the program if 0 is entered
        if (number == 0) {
            System.out.println("The only number you entered is 0");
            System.exit(1);
        }


        while (number != 0) {
            if (number > 0) {
                pos++;   //Increasing positives
            }

            else {
                neg++;   //Increasing negatives
            }

            sum += number;   //Collects total
            count++;   //Increasing count

            number = input.nextInt();
        }


        //Calculates the average of the entered numbers
        double avg = sum / count;

        //Display all collected results
        System.out.println("There has been entered " + pos + " positive numbers");
        System.out.println("There has been entered " + neg + " negative numbers");
        System.out.println("The total of the entered numbers is: " + sum);
        System.out.println("The average of the entered numbers is: " + avg);

        }

    }

