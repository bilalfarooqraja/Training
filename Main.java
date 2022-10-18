import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // creates an object of Scanner
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number ");

        // takes input from the keyboard
        int num = Integer.parseInt(input.nextLine());

        System.out.print("Now enter array value ");


        int array[]= new int[num];
        for(int i=0;i<num;i++){
            input = new Scanner(System.in);
            array[i] = Integer.parseInt(input.nextLine());


        }
        System.out.println(Arrays.toString(array));
        input.close();
    }}