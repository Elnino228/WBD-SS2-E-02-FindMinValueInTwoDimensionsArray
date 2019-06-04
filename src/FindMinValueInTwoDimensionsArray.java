import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class FindMinValueInTwoDimensionsArray {
    public static void main(String[] args) {
//        int[][] arr={
//                {1,2,3},
//                {4,5,6},
//                {7,8,9},
//        };
        Scanner scanner=new Scanner(System.in);
        int rows,cols;
        System.out.println("Enter rows of array: ");
        rows=scanner.nextInt();
        System.out.println("Enter cols of array: ");
        cols=scanner.nextInt();
        int[][] arr=new int[rows][cols];
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.println("Element at row "+i+" ,column "+j+": ");
                arr[i][j]=scanner.nextInt();
            }
        }
        System.out.println("Your Array: ");
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.println(arr[i][j]+"\t");
            }
        }
        int minValue=arr[0][0];
        int index_i=0,index_j=0;
        for (int i=1;i<arr.length;i++){
            for (int j=1;j<arr.length;j++){
                if (arr[i][j]<minValue){
                    minValue=arr[i][j];
                    index_i=i;
                    index_j=j;
                }
            }
        }
        System.out.println("The smallest value in array is "+minValue+" ,position at row "+index_i+", column "+index_j);


    }
}
