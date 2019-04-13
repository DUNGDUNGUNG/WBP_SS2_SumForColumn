import java.util.Scanner;

public class SumColumn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][]matrix=new int[3][2];
        System.out.println("Enter " + matrix.length + " rows and " +
                matrix[0].length + " columns: ");
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print("Enter a element:");
                matrix[row][column] = sc.nextInt();
            }
        }
        System.out.println(" Element the matrix array: ");
        for (int[] matrix1 : matrix) {
            for (int i : matrix1) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        System.out.print("Enter a column:");
        int number =sc.nextInt();
        for (int column = 0; column < matrix[0].length; column++) {
            int sum = 0;
            if(number==column) {
                for (int[] matrix1 : matrix) sum += matrix1[column];
                System.out.println("Sum for column " + column + " is "
                        + sum);
            }else {
                System.out.println("No column");
            }
        }
    }

}
