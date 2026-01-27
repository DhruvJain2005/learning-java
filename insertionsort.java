public class insertionsort {

    public static void InsertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i - 1;

            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }

            arr[prev + 1] = curr;
        }
    }

    public static void main(String[] args) {
        int arr[] = {20, 14, 36, 25, 45, 25};

        InsertionSort(arr);
        pairs(arr);


        System.out.println("Sorted array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void pairs(int arr[]){
        for(int i=0;i<arr.length;i++){
            int curr=arr[i];
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+ curr +"," + arr[j]+")");
            }
            System.out.println();
        }
    }

    public static void subarrays(int arr[]){
        for(int i=0;i<arr.length;i++){
            int start=arr[i];
            for(int j=1;j<arr.length;j++){
                int end=arr[j];
            }
        }
    }

    
}
