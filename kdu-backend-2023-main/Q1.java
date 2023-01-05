package org.kdutest;
import java.util.*;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Q1.CheckNumberOfEvenOrOdd();
    }
    static void CheckNumberOfEvenOrOdd(){
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        String input=sc.next();
        long even=0,odd=0,len;
        len=input.length();
        //there may be a negetive number and - sign will only be at the begining
        int j=0,countDot=0;
        if(input.charAt(0)=='-'){
            j=1;
        }
        for(int i=j;i<len;i++){
            char c=input.charAt(i);
            if(c=='.'){
                countDot++;
                //there can be a dot only once
                if(countDot>1){
                    System.out.println("Invalid input");
                    System.exit(0);
                }
                continue;
            }
            //if c is not a between 0 to 9 the it is an invalid entry
            else if(!(c-'0'<10 && c-'0'>-1)) {
                System.out.println("Invalid input");
                System.exit(0);
            }
            else if((c-'0')%2==0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println("Number of even numbers: "+even);
        System.out.println("Number of odd numbers: "+odd);
    }
}