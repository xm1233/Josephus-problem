import java.awt.*;
import java.util.Arrays;
import java.util.Scanner;

public class ab {
    public static void main(String[] args) {
        int i=0;
        int k=0;
        int count=0;
     Scanner sc=new Scanner(System.in);
     int d=sc.nextInt();
     int[] arr=new int[d];
     for(i=0;i<d;i++)
         arr[i]=i+1;
     i=0;
     while(k<d-1){
         count=1;
         while(count<3){
             count++;
             i=(i+1)%d;
             while(arr[i]==0)
             {i=(i+1)%d;}
         }
         arr[i]=0;
         while(arr[i]==0)
             i=(i+1)%d;
         ++k;
     }
     for(i=0;i<d;i++){
         if(arr[i]!=0)
             System.out.println(arr[i]);
     }
    }
}
