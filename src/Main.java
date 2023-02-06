import java.util.ArrayList;
import java.util.Scanner;
// Adam A. Garantche
// February, 2 2023
// CSCI 73797
public class Main {
    static Scanner input = new Scanner (System.in);
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();
        System.out.println("Please choose an option:");
        System.out.println("(1) Add a task." );
        System.out.println("(2) Remove a task.");
        System.out.println("(3) Update a task.");
        System.out.println("(4) List all tasks." );
        System.out.println("(0) Exit.");
        int selection = input.nextInt();
        input.nextLine();


        while (selection > 0) {
            if (selection == 1) {
                addTask(myList);
            } else if (selection == 2) {
                removeTask(myList);
            } else if (selection == 3){
                updateTask(myList);
            } else if (selection == 4) {
                System.out.println(myList);
            } else if (selection == 0) {
                System.exit(0);
            }
            System.out.println("Please make a selection.....");
            selection = input.nextInt();
            input.nextLine();
        }
    }

    static void addTask(ArrayList<String> a){
        System.out.println("Please enter the task you'd like to add");
        String task = input.nextLine();
        a.add(task);
    }
// This function add Tasks List


    static ArrayList<String> removeTask(ArrayList<String> a) {
        System.out.println("What task would you like to remove?");
        String selection = input.nextLine();
        a.remove(selection);
        System.out.println(a);
        return a;
    }

    static ArrayList<String> updateTask(ArrayList<String> a) {
        System.out.println("What task would you like to update?");
        int update = input.nextInt();
        input.nextLine();
        System.out.println("What is the new description for the task?");
        String newDescription = input.nextLine();
        a.set(update, newDescription);
        return a;
    }

}