import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double cucumber = 3.14;
        double apple = 4.11;
        double pumpkin = 2.22;
        double tomatoes = 0.95;
        double eggplant = 7.00;

        System.out.println("Welcome to the grocery store");

        System.out.println("How Much Weight of Cucumber?: ");
        double cucumberWeight = scanner.nextDouble();

        System.out.println("How Much Weight of Apple?: ");
        double appleWeight = scanner.nextDouble();

        System.out.println("How Much Weight of Pumpkin?: ");
        double pumpkinWeight = scanner.nextDouble();

        System.out.println("How Much Weight of Tomatoes?: ");
        double tomatoesWeight=scanner.nextDouble();

        System.out.println("How Much Weight of Eggplant?: ");
        double eggplantWeight=scanner.nextDouble();

        double total = cucumber*cucumberWeight + apple*appleWeight + pumpkin*pumpkinWeight + tomatoes*tomatoesWeight + eggplant*eggplantWeight;

        System.out.println("Total: " + total);
    }
}