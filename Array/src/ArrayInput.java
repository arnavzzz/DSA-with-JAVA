import java.util.Arrays;
import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] arr = new int[5];
        int [] new_arr = new int[5];


        arr[0] = 12;
        arr[1] = 14;
        arr[2] = 16;
        arr[3] = 18;
        arr[4] = 20;

        System.out.println(arr[3]);

        for(int i=0;i<new_arr.length;i++){
            new_arr[i] = sc.nextInt();
        }

        for(int i=0;i<new_arr.length;i++){
            System.out.println(new_arr[i]);
        }

        for(int num:new_arr){
            System.out.print(num+" ");
        }
        System.out.println(Arrays.toString(arr));
    }
}
