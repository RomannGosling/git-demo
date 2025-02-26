import java.util.Scanner;


public class Laba1Main1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a username: ");
        String username = in.nextLine();
        System.out.printf("Hello %s!) \n", username);
        in.close();
    }
}





