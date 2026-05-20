import java.util.Scanner;

public class Sum{
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size:");
        int size = sc.nextInt();
        int[] arr = new int[size];

        for(int i =0;i<arr.length;i++){
            System.out.println("insert the element at position" + i);
            arr[i] = sc.nextInt();

        }
        int sum = 0;

        for(int i = 0;i<arr.length;i++){
            sum = sum + arr[i];
        }
        System.out.println("Sum of array is :"+sum);
    }
}
