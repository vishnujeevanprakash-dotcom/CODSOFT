import java.util.Random;
import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$";
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter password length: ");
        int length = sc.nextInt();

        String password = "";

        for (int i = 0; i < length; i++) {
            int index = rand.nextInt(chars.length());
            password += chars.charAt(index);
        }

        System.out.println("Generated Password: " + password);
    }
}