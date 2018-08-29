import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner userInput = new Scanner(System.in);
	int choice;

	do{
	    System.out.println("Enter the number you wish to select:");
	    System.out.println("------------------------------------");
	    System.out.println("1: Beer");
	    System.out.println("2: Wine");
	    System.out.println("3: Soda");
	    System.out.println("4: Water");
	    System.out.println("5: Coffee");
	    choice = userInput.nextInt();
    }
    while (choice != 1 && choice != 2 && choice != 3 && choice != 4 && choice != 5);
    switch (choice) {
        case 1: System.out.println("You have selected a beer. That'll be $5");
        break;
        case 2: System.out.println("You have selected a wine. That'll be $6");
            break;
        case 3: System.out.println("You have selected a soda. That'll be $2.50");
            break;
        case 4: System.out.println("You have selected a water. That'll be $2");
            break;
        case 5: System.out.println("You have selected a coffee. That'll be $1.50");
            break;
        default: System.out.println("Thanks");
        }
    }
}
