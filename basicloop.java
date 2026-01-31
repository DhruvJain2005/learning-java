import java.util.*;
public class basicloop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number ");
        int n=sc.nextInt();
        for(int i=1;i<=10;i++){
            int result=n*i;
            System.out.println(n + " x " + i + " = " + result);
        }
    }
}

