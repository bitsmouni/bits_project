import java.util.Scanner;

public class Natural {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n value: ");
        int n = sc.nextInt();

        System.out.println("First " + n + " Natural Numbers are:");

        for (int i = 1; i <= n; i++) {
            System.out.println(i + " ");
        }
    }
}
