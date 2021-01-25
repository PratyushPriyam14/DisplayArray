import java.io.*;
import java.util.*;
public class DisplayArray {
    public static void main(String []args)throws Exception{
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int[] arr = new int[n];
    for(int i = 0; i<arr.length; i++)
    {
        arr[i] = s.nextInt();
    }
    displayArr(arr,0);
}
public static void displayArr(int []arr,int index){
        if(index== arr.length){
            return;
        }
    System.out.println(arr[index]);
    displayArr(arr,index+1);
}
}