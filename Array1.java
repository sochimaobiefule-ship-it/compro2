import java.util.Scanner;
public class Array1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for(int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.print("Enter a number: ");
        int number =input.nextInt();
        int index = -1;
        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] == number) {
                index = i;
                break;
            }
        }
        System.out.print("Index of " + number + ": " + index);
    }
}