import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.*;
public class Main {
    //40005573 janghyuk boo comp 352 assignment 2
//as insturcted in the assignment i made it work with the char ≥ but not <=.
    public static void main(String[] args) {
        Calculate a = new Calculate();
        Evaluate b = new Evaluate();
        System.out.println(b.evaluate("((-2 - 3) + (3 - 12)) / 1"));
        System.out.println(b.evaluate("(2^5 - 6^2) + 4 / 4"));
        System.out.println(b.evaluate("((((((((34))))))))"));
        System.out.println(b.evaluate("4 + 6 - 2^4 + 5 / 3 * 4"));
        System.out.println(b.evaluate("( -3 * 26 ) / ( -4 ^ 2 )"));

        try {
            Scanner scanner = new Scanner(new File("inputs.txt"));
            String input = "";
            while (scanner.hasNextLine()) {
                input = scanner.nextLine();
                System.out.println(input);
                a.evaluate(input);

            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (RuntimeException e) {
            //e.printStackTrace();
        }
    }

}

