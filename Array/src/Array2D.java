public class Array2D {
    public static void main(String[] args) {
        int [][] arr2D = {
                {1,2,3},
                {4,5},
                {6,7,8,9}
        };

        for (int[] ints : arr2D) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}
