import java.util.Scanner;

public class InputHelper {
    private static final Scanner scanner = new Scanner(System.in);

    public static <T> T getInput(String prompt, Class<T> type) {
        System.out.print(prompt);
        String input = scanner.nextLine();

        try {
            if (type == String.class) {
                return type.cast(input);
            }else if (type == Integer.class) {
                return type.cast(Integer.parseInt(input));
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input");
        }
            return null;
        }
    }
