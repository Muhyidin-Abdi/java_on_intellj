import java.util.Scanner;

public class inputs {
    public static void main(String[] args) {
//    //creating a scanner
//        Scanner input = new Scanner(System.in);
//    // prompting the user
//        System.out.println("Enter an input: ");
//    //storing user input to "line" by waiting for input
//        String line= input.nextLine();
//        //printing out the data
//        System.out.println("u have enterd a "+ line);

        //same thing but an number instead of a String

        Scanner input = new Scanner(System.in);
        int n = 0;
        boolean flag = false;

        while (!flag) {
            System.out.print("Enter an integer: ");
            if (input.hasNextInt()) {
                n = input.nextInt();
                flag = true;
            }
            else {
                System.out.println("you have enter a invalid (maybe a string)  try again  ");
                input.next();
            }

        }
        System.out.print("You have entered : "+ n);



    }
}
