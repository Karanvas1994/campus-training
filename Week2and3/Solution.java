import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
            
        int[][] arr = new int[n][n];
           //System.out.println("yo");
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                arr[i][j]=sc.nextInt();
            }
        }
           //System.out.println("yo");
        for(int i=n-2;i>=0;i--){
            for(int j=n-2;j>=0;j--){
                if(arr[i+1][j+1]>arr[i+1][j]){
                    arr[i][j]+=arr[i+1][j+1];
                }
                else
                    arr[i][j]+=arr[i+1][j];
            }
        }
        System.out.println(arr[0][0]);
            //System.out.println("yo");
        
        //System.out.println("yo");
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
