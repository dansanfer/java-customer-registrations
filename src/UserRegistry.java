import  java.util.ArrayList;
import  java.util.List;

public class UserRegistry {
    private List<Person> users;

    public UserRegistry() {
        users = new ArrayList<>();
    }

    public void registerUser(Person person) {
        if (person != null) {
            users.add(person);
            System.out.println(person.getName() + " successfully registered!");
        }
    }

    public void displayAllUsers() {
        if (users.isEmpty()) {
            System.out.println("No users registered.");
        }else {
            System.out.println("List of Registered Users:");
            for (Person person : users){
                System.out.println(person);
            }
        }
    }

    public void removeUserByName(String name) {
         Person removedPerson = null;
         for (Person person : users) {
             if (person.getName().trim().equalsIgnoreCase(name.trim())) {
                 removedPerson = person;
                 break;
             }
         }
         if (removedPerson != null) {
             users.remove(removedPerson);
             System.out.println(removedPerson.getName() + " successfully removed!");
         } else {
             System.out.println("User not found.");
         }
    }
}