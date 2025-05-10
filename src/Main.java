public class Main {
    public static void main(String[] args) {
        UserRegistry registry = new UserRegistry();

        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Register User");
            System.out.println("2. Display All Users");
            System.out.println("3. Remove User");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            choice = InputHelper.getInput("", Integer.class);

            switch (choice) {
                case 1:

                    String name = InputHelper.getInput("Enter name: ", String.class);
                    String email = InputHelper.getInput("Enter email: ", String.class);
                    int age = InputHelper.getInput("Enter age: ", Integer.class);
                    registry.registerUser(new Person(name, email, age));
                    break;
                case 2:

                    registry.displayAllUsers();
                    break;
                case 3:

                    String nameToRemove = InputHelper.getInput("Enter the name of the user to remove: ", String.class);
                    registry.removeUserByName(nameToRemove);
                    break;
                case 4:

                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        }while (choice !=4);
    }
}