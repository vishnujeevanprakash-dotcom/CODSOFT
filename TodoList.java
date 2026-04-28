import java.util.ArrayList;
import java.util.Scanner;

public class TodoList {
    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1.Add Task 2.View Tasks 3.Remove Task 4.Exit");
            choice = sc.nextInt();
            sc.nextLine();

            switch(choice) {
                case 1:
                    System.out.print("Enter task: ");
                    tasks.add(sc.nextLine());
                    break;
                case 2:
                    for (int i = 0; i < tasks.size(); i++)
                        System.out.println((i+1) + ". " + tasks.get(i));
                    break;
                case 3:
                    System.out.print("Enter task number: ");
                    int n = sc.nextInt();
                    tasks.remove(n-1);
                    break;
            }
        } while(choice != 4);
    }
}