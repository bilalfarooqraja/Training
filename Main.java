import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Array" + Arrays.toString(array));
        arraySort(array);
        System.out.println("Array" + Arrays.toString(array));
    }

    public static void arraySort(int[] array) {
        int max = array.length - 1;
        // System.out.println("max"+max);
        int halflength = array.length / 2;
        //System.out.println("half"+halflength);

        for (int i = 0; i < halflength; i++) {
            int temp = array[i];

            array[i] = array[max];
            array[max] = temp;
            max--;
        }

    }
}