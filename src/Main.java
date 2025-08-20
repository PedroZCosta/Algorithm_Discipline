import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        SuperHero superHero = null;
        System.out.println("--------- WELCOME TO THE PROGRAM ---------");
        boolean running = true;
        while (running) {
            System.out.println("\nChoose an option:");
            System.out.println("1 - Register a persona");
            System.out.println("2 - Show persona data");
            System.out.println("3 - Add habilitie");
            System.out.println("4 - Remove habilitie");
            System.out.println("5 - Show habilitie(s)");
            System.out.println("6 - Use habilitie(s)");
            System.out.println("0 - Exit");
            System.out.print(">> ");
            int option = input.nextInt();
            input.nextLine(); // isso aqui ele desbuga as linhas de entrada

            switch (option) {
                case 1:
                    System.out.println("Enter the name of this persona: ");
                    String name = input.nextLine();
                    System.out.println("Enter the age of this persona: ");
                    int age = input.nextInt();
                    System.out.println("Enter the height of this persona: ");
                    float height = input.nextFloat();
                    input.nextLine(); // isso aqui ele desbuga as linhas de entrada
                    superHero = new SuperHero(name, age, height);
                    System.out.println("Persona created with success!");
                    break;

                case 2:
                    if (superHero != null) {
                        superHero.showPersona();
                    } else {
                        System.out.println("No persona registered yet.");
                    }
                    break;

                case 3:
                    if (superHero != null) {
                        System.out.println("Enter a habilitie to add: ");
                        String habAdd = input.nextLine();
                        superHero.addHabilities(habAdd);
                    } else {
                        System.out.println("You need to register a persona first!");
                    }
                    break;

                case 4:
                    if (superHero != null) {
                        System.out.println("Enter a habilitie to remove: ");
                        String habRemove = input.nextLine();
                        superHero.removeHabilities(habRemove);
                    } else {
                        System.out.println("You need to register a persona first!");
                    }
                    break;

                case 5:
                    if (superHero != null) {
                        superHero.showHabilities();
                    } else {
                        System.out.println("You need to register a persona first!");
                    }
                    break;

                case 6:
                    if (superHero != null) {
                        superHero.useHabilities();
                    } else {
                        System.out.println("You need to register a persona first!");
                    }
                    break;


                case 0:
                    running = false;
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid option, try again.");
            }
        }

        input.close();
    }
}