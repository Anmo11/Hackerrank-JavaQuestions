import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N= scanner.nextInt();
    scanner.close();
         if(N%2==0 && N>=2 && N<=5){
            System.out.println("Not Weird"); 
         } else if(N%2==0 && N>=6 && N<=20){
             System.out.println("Weird");
         }else if(N%2==0 && N>20){
            System.out.println("Not Weird");
         }else{
             System.out.println("Weird");
         }
    }
}
