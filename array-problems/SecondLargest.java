public class Main {
    public static void main(String[] args) {
        int[] arr={10,12,35,46,54};
        System.out.println("The second largest element in the given array is: "+ getSecondLargest(arr));
    }
    static int getSecondLargest(int[] arr){
        int l=arr.length;
        int largest=-1,secondLargest=-1;
        
        for(int i=0;i<l;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        
        for(int i=0;i<l;i++){
            if(arr[i]>secondLargest && arr[i]!=largest){
                secondLargest=arr[i];
            }
        }
        
        return secondLargest;
    } 
}
