import java.util.Arrays;
import java.util.Scanner;

public class linearsearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER THE NUMBER OF ELEMENTS : ");
        int n=sc.nextInt();
        int[]arr=new int[n];
        System.out.println("enter the elements of an array");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        
        System.out.print("enter target element");
        int target=sc.nextInt();



        int result=Linearsearch(arr, target);
        if(result==-1){
            System.out.println("index not found");
        }
        else{
            System.out.println("index is "+ result);
        }
        sc.close();
    }
    public static int Linearsearch(int[]arr,int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        
        return -1;
    }
    
}
