import java.util.*;
public class binarysearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER THE NUMBER OF ELEMENTS : ");
        int n=sc.nextInt();
        int[]arr=new int[n];
        System.out.println("enter the elements of an array");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.print("enter target element");
        int target=sc.nextInt();



        int result=Binarysearch(arr, target);
        if(result==-1){
            System.out.println("index not found");
        }
        else{
            System.out.println("index is "+ result);
        }
        sc.close();
           
        
    }
    public static int Binarysearch(int[]arr,int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start + (end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(target > arr[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;

    }
    
}
