import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int length = 5;
        int[] numbersList = new int[length];
        int count = 0;
        int choice;

        do{
            System.out.println("List of numbers program: ");
            System.out.println("1. Input list of numbers");
            System.out.println("2. View list of numbers");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:

                    while (true) {
                        System.out.print("Enter your number (enter negative number to stop): ");
                        int inputNum = input.nextInt();

                        if (inputNum < 0)
                            break;
                        if (count == numbersList.length) {
                            int[] tempNums = new int[numbersList.length * 2];
                            for (int i = 0; i < count; i++){
                                tempNums[i] = numbersList[i];
                            }
                            numbersList = tempNums;
                        }
                        numbersList[count] = inputNum;
                        count++;
                    }
                    break;

                case 2:
                    if (numbersList == null){
                        System.out.println("No numbers in list");
                    }
                    else {
                        System.out.println("Here is your list of numbers:");
                        for (int i = 0; i < count; i++) {
                            System.out.println("Number " + (i + 1) + ": " + numbersList[i]);
                        }
                    }
                    break;

                case 3:
                    System.out.println("Goodbye!");
                    input.close();
                    break;

                default:
                    System.out.println("Pick a choice between 1 and 3");
                    break;
            }
        }while(choice != 3);
    }
};

