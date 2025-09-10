import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        int[] arr={10,50,67,86,30,40};
        System.out.println("The product of the max three numbers is: "+productTriplet(arr));
    }
    public static int productTriplet(int[] arr){
        Arrays.sort(arr);
        int n=arr.length;
        int option1=arr[n-1]*arr[n-2]*arr[n-3];
        int option2=arr[0]*arr[1]*arr[n-1];
        
        return Math.max(option1,option2);
    }
}
