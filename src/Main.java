import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> objects = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        boolean cont = true;

        objects.addAll(Arrays.asList("c#", "html", "css", "c++", "java", "python", "swift", "rust", "f#", "c"));

        while (cont) {
            String input = InputHelper.getNonZeroLenString(scanner, "Options: A (add to list), D (delete from list), P (print the list), Q (quit the program)");

            // all of the methods were redundant so I removed them
            if (input.equalsIgnoreCase("a")) {
                objects.add(InputHelper.getNonZeroLenString(scanner, "What would you like to add?"));
            } else if (input.equalsIgnoreCase("d")) {
                objects.remove(InputHelper.getRangedInt(scanner, "What is the object's index?", 1, objects.size()));
            } else if (input.equalsIgnoreCase("p")) {
                for (String o: objects) {
                    System.out.printf("%d - %s\n", objects.indexOf(o), o);
                }
            } else if (input.equalsIgnoreCase("q")) {
                if (InputHelper.getYNConfirm(scanner, "Are you sure you want to quit? [Y/N]")) {
                    cont = false;
                }
            } else {
                System.out.println("That was not an option.");
            }
        }
    }
}