public class Main {
    public static void main(String[] args) {
        int[] arr={24,46,0,0,56,0,12,3,0};
        pushtoend(arr);
        for(int num:arr){
            System.out.print(num+" ");
        }
    }

    static void pushtoend(int[] arr){
          int count=0;
          int n=arr.length;
          for(int i=0;i<n;i++){
              if(arr[i]!=0){
                  int temp=arr[i];
                  arr[i]=arr[count];
                  arr[count]=temp;

                  count++;
              }
          }
    }
}
