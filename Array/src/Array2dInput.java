import java.util.Arrays;
import java.util.Scanner;

public class Array2dInput {
    public static void main(String[] args) {
        int [][] arr_2d = new int[3][2];

        Scanner sc = new Scanner(System.in);

        for(int i=0;i<arr_2d.length;i++){
            for (int j=0;j<arr_2d[i].length;j++){
                arr_2d[i][j] = sc.nextInt();
            }
        }

        for(int [] i: arr_2d){
            System.out.println(Arrays.toString(i));
        }
    }
}
