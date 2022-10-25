import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Welcome to the Array handling program\nIf you want to crete your array put 1 and if you want random one put 2");
        int decide = in.nextInt();

        if (decide == 2){
            System.out.println("Now decide the length of an array");
            printArray(createRandomArray(in.nextInt()));

            System.out.println("Type any length of array to see it's largest number");
            System.out.println("Largest number of array :" + largestInArr(printArray(createRandomArray(in.nextInt()))));
        }else if(decide == 1) {
            System.out.println("Sorry i was unable to do this part((( so rerun the program and choose another option");
        }else {
            System.out.println("This program has only 2 options");
        }
    }

    public  static int[] createRandomArray(int lengthOfRandomArray){
        Random random = new Random();
        int[] ranArray = new int[lengthOfRandomArray];
        for (int i = 0; i < lengthOfRandomArray; i++) {
            ranArray[i] = random.nextInt(10);

        }
        return ranArray;


    }

    public static void println(String s) {
        System.out.println(s);
    }

    public static void print(String s) {
        System.out.print(s);
    }

    public static int[] printArray(int[] array) {
        for (int i : array) {
            print(i + " ");
        }
        System.out.println();
        return array;
    }

    public static int largestInArr(int[] arr){


        int i;
        int max = arr[0];

        for (i = 1; i < arr.length; i++)
            if (arr[i] > max)
                max = arr[i];

        return max;
    }


}