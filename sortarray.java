// {129,-22,57,85,39,-186,-20, 34, 21, -87, 92,100}find largest and smallest number from integer array
import java.util.*;
public class Test{
    public static void sort(int arr[]){
        int n=arr.length;

    }
    public static void main(String[] args) {
        int min=Integer.MIN_VALUE;
        int max=Integer.MAX_VALUE;
       int arr[]={1,1,1,1,1};
    //    sort(arr);
       for(int i=0;i<arr.length;i++){
        if(max>arr[i]){         //1,2,3,4,5 max=1>
            max=arr[i];
        }
        //max value
        if(arr[i]>min){//1>-9999-> min=1   2>1 min=2 3>2main=3
            min=arr[i];
        }
       }
       if(min==max){
        System.out.println("Max value is "+min);
        System.out.println("min value is not their");
       }
       else{
        System.out.println("min value "+max);
        System.out.println("max value "+min);
       }
      //min
    //    for(int i=0;i<arr.length;i++){   //1,2,3,4,5 max=-9999
    //     if(arr[i]>min){//1>-9999-> min=1   2>1 min=2 3>2main=3
    //         min=arr[i];
    //     }
    //    }
       
    }
}
