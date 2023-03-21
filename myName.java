import java.util.*;
public class myName {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        // int m=sc.nextInt();
        for(int i=0;i<n;i++){
             // V   
            for(int j=0;j<n;j++){
                if(i==j&&i<=(n-1)/2||i+j==n-1&&i<=(n-1)/2){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print(" ");
            // I
            for(int j=0;j<n;j++){
                if(i==0||i==n-1||j==(n-1)/2){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print(" ");
            // V
            for(int j=0;j<n;j++){
                if(i==j&&i<=(n-1)/2||i+j==n-1&&i<=(n-1)/2){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print(" ");
            // E
            for(int j=0;j<n;j++){
                if(i==0||i==(n-1)/2||i==n-1||j==0){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
           
            
            System.out.print(" ");
            // K
            for(int j=0;j<n;j++){
                if(j==0||i+j==(n-1)/2||i-j==(n-1)/2){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print("  ");
            // S
            for(int j=0;j<n;j++){
                if(i==0&&j<=(n-1)/2||j==0&&i<=(n-1)/2||i==(n-1)/2&&j<=(n-1)/2||j==(n-1)/2&&i>(n-1)/2||i==n-1&&j<=(n-1)/2){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print(" ");
            // I
            for(int j=0;j<n;j++){
                if(i==0||i==n-1||j==(n-1)/2){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print(" ");
            // N
            for(int j=0;j<n;j++){
                if(j==0||i==j||j==n-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print(" ");
            // G
            for(int j=0;j<n;j++){
                if(i==0&&j<=(n-1)/2||j==0||i==n-1&&j<=(n-1)/2||j==(n-1)/2&&i>=(n-1)/2){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

            }
            System.out.print(" ");
            // H
            for(int j=0;j<n;j++){
                if(j==0||j==n-1||i==(n-1)/2){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print("   ");
            // P
            for(int j=0;j<n;j++){
                if(i==0&&j<=(n-1)/2||j==0||j==(n-1)/2&&i<=(n-1)/2||i==(n-1)/2&&j<=(n-1)/2){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print(" ");
            // U
            for(int j=0;j<n;j++){
                if(j==0&&i<n-1||j==n-1&&i<n-1||i==n-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print(" ");
            // N
            for(int j=0;j<n;j++){
                if(j==0||i==j||j==n-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
             System.out.print(" ");
             // D
             for(int j=0;j<n;j++){
                if(i==0&&j<(n-1)/2||j==0||i==n-1&&j<(n-1)/2||j==(n-1)/2&&i>0&&i<n-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }

            System.out.print(" ");
            // I
            for(int j=0;j<n;j++){
                if(i==0||i==n-1||j==(n-1)/2){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print(" ");
            // R
            for(int j=0;j<n;j++){
                if(i==0&&j<=(n-1)/3||j==0||j==(n-1)/2&&i<(n-1)/2||i==(n-1)/2&&j<=(n-1)/2||i>(n-1)/2&&i-j==(n-1)/3){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
