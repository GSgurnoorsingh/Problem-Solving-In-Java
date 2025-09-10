public class Main {
    public static void main(String[] args){
        int[] arr = {1,1,0,1,0,1,1,1};
        System.out.println("Max consecutive 0s or 1s = " + maxConsec(arr));
    }

    public static int maxConsec(int[] arr){
        int maxZeros = 0, maxOnes = 0;
        int countZeros = 0, countOnes = 0;  

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                countZeros++;
                maxZeros = Math.max(maxZeros, countZeros);
                countOnes = 0;
            } else {
                countOnes++;
                maxOnes = Math.max(maxOnes, countOnes);
                countZeros = 0;
            }
        }
        return Math.max(maxZeros, maxOnes);
    }
}
