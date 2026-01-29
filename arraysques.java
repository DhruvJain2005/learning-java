public class arraysques {
    public static void main(String[] args) {
        int[]arr={2,4,6,8,10};
        Subarrays(arr);
    }
    public static void subarrays(int[]arr){
        int totalSubaarays=0;
        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;j++){
                int end=j;                                                   //   printing subarrys 
                for(int k=start;k<=end;k++){
                    System.out.print(arr[k]);
                }
                totalSubaarays++;
                System.out.println();
            }
        }System.out.println();
        System.out.println("total subarryas is : "+totalSubaarays);
    }


    public static void Subarrays(int[]arr){
        int currsum=0;                                                   // printing sum of sub arrays 
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;j++){
                int end=j;
                 currsum=0;
                for(int k=start;k<=end;k++){
                    currsum += arr[k];
                }
                if(maxsum < currsum){
                    maxsum = currsum;
                }
                
                System.out.println(currsum);
            }
        }System.out.println("maxsum is :"+maxsum);
        
}
}
