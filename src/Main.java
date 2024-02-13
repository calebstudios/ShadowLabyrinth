import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Text Rogue-like Game!");

        Player player = new Player("Player", 13, 6);
        Enemy enemy = new Enemy("Enemy", 15, 4);

        System.out.println("Player Stats: " + player);
        System.out.println("Enemy Stats:" + enemy);

        while (player.isAlive() && enemy.isAlive()) {
            System.out.println("\nWhat would you like to do?");
            System.out.println("1. Attack");
            System.out.println("2. Run");
            System.out.println("Enter your choice: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    player.attack(enemy);
                    if (enemy.isAlive()) {
                        enemy.attack(player);
                    }
                    break;
                case 2:
                    System.out.println("You ran away!");
                    return;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }

            System.out.println("Player Stats: " + player);
            System.out.println("Enemy Stats: " + enemy);
        }

        if (player.isAlive()) {
            System.out.println("You defeated the enemy!");
        } else {
            System.out.println("Game over! You were defeated.");
        }
    }
}