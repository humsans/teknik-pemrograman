import java.util.Scanner;

public class Teori2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Hello New Adventurer!");
        System.out.println("Let's Start Your Journey Now!");

        System.out.print("Username : ");
        String username = keyboard.nextLine();

        System.out.print("Password : ");
        String password = keyboard.nextLine();

        System.out.println("Welcome Back, " + username + " " +password);
        // bagian password belum bisa saya hilangkan, sementara ditempelkan disana saja terlebih dahulu.
        Adventure adventure = new Adventure(username);
        adventure.combat();

        keyboard.close();
    }
}

class Adventure {
    private String username;
    private int level;

    public Adventure(String username) {
        this.username = username;
        this.level = 1;
    }

    public void nextLevel() {
        System.out.println("Congratulations, " + username + "!");
        System.out.println("You reached level " + level + ".");
    }

    public void combat() {
        System.out.println(username + " looking for mobs.");

        System.out.println(username + " found a slime!");
        System.out.println("Choose an action :");
        System.out.println("1. Attack");
        System.out.println("2. Escape");

        Scanner number = new Scanner(System.in);
        System.out.print("Your Action : ");
        int option = number.nextInt();

        if (option == 1) {
            System.out.println("You're attacking slime.\nYou get 11 exp from attacking slime.");
            nextLevel();
        } else if (option == 2) {
            System.out.println("You're fleeing from slime.");
            kebodohan();
        } else {
            System.out.println("Invalid Option.");
        }

        number.close();
    }

    private void kebodohan() {
        System.out.println("nguwawor, slime doang kabur.");
    }
}
