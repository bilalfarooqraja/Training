import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number ");

        // takes input from the keyboard
        int num = Integer.parseInt(input.nextLine());

        System.out.print("Enter array "+num+ " Times");

        int array[]= new int[num];
        int ar[]=arrayInput(num,array);
        int arr[]=posNeg(ar);
        takingAverage(arr,ar);

    }

    public static int[] arrayInput(int num,int arr[]){

        for(int i=0;i<num;i++){
            Scanner input = new Scanner(System.in);

            arr[i] = Integer.parseInt(input.nextLine());
        }
        return arr;
    }
    public static int[] posNeg(int arr[]){

        int P=0,N = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                N++;
            } else if (arr[i]>=0) {
                P++;
            }

        }
        System.out.println("Postive numbers are "+P+"\nNegative numbers are "+N);
        int ar[]= new int[2];
        ar[0]=N;
        ar[1]=P;

       return ar;
    }
    public static void takingAverage(int ar[],int array[]){

        int N=ar[0];
        int P=ar[1];
        double Ne=((double) N/array.length);
        double Po=((double) P/array.length);
        System.out.println(Ne+"\n"+Po);
//        long a = 3004230L; // Use the L notation to declare this literal a long.
//        long b = 6793368L;
//        double c = ((double) a/b)*100;

    }
}