import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class TaskTracker {
    public String timeD()
    {
        LocalDateTime datetime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yy HH:mm:ss");
        String formatteddatetime = datetime.format(formatter);
        return formatteddatetime;
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String[] tasks = new String[25];
        String name;
        int tasks_count = 0;
        System.out.println("\t\t*****Task Tracker*****\n");
        System.out.println("Input your name --> ");
        name = scanner.nextLine();
        System.out.println("\nWelcome " + name + ", what would you like to do today ?\n Select below:\n");

        while(true)
        {
            TaskTracker timeobj = new TaskTracker();
            String users_name, choice1;

            int choice0;

            System.out.println("1. Create new task\t\t\n2. View Pending tasks\t\t\n3. View Current Time \t\t\n4. Exit");
            choice0 = scanner.nextInt();

            scanner.nextLine();

            if(choice0 == 1)
            {
                String task_created, task_created0, choice2;
                System.out.println("\nWhat task would you like to add to tasks ? ");
                task_created = scanner.nextLine();
                tasks[tasks_count] = task_created;
                tasks_count++;
                System.out.println("Task successfully added at " + timeobj.timeD() + "\n");

                System.out.println("Would you like to add another task ? (yes / no)");
                choice2 = scanner.nextLine();
                if(choice2.equalsIgnoreCase("yes") && !choice2.isEmpty())
                {
                    System.out.println("Enter below task you would like to add: ");
                    task_created0 = scanner.nextLine();
                    tasks[tasks_count] = task_created0;
                    tasks_count++;
                    System.out.println("Task successfully added at " + timeobj.timeD() + "\n");
                }
                else if(choice2.equalsIgnoreCase("no") && !choice2.isEmpty())
                {
                    continue;
                }
            }
            else if (choice0 == 2)
            {
                if (tasks[0] == null)
                {
                    System.out.println("Pending tasks are empty");
                    continue;
                }
                else {
                    for (int i = 0; tasks[i] != null; i++)
                    {
                        System.out.println("--> " + tasks[i] + ".\n");
                    }
                }
            }
            else if (choice0 == 3 )
            {
                System.out.println("The current time is " + timeobj.timeD());
            }
            else if (choice0 == 4)
            {
                String choice3;
                System.out.println("Are you sure you want to exit ? (yes / no)");
                choice3 = scanner.nextLine();
                if(choice3.equalsIgnoreCase("yes") && !choice3.isEmpty())
                {
                    System.out.println("\nExiting..........Bye :(");
                    System.exit(0);
                }
                else
                    continue;
            }
            else
                System.out.println("Enter Valid Input");
        }
    }
}
