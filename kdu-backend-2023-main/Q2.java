package org.kdutest;

import java.util.Scanner;
import java.util.*;
public class Q2 {
    public static void main(String[] args) {
        Q2.questions();
    }
    static void questions(){
        //I considered the quiz to be numeric so that code can generate the questions by itself
        Random rd=new Random();
        Scanner sc=new Scanner(System.in);
        System.out.println("How many question do you want to have");
        int n= sc.nextInt(),upper_bound=500;
        int score=0;
        while(n--!=0){
            int x=rd.nextInt(upper_bound),y=rd.nextInt(upper_bound),ans=x*y,yourAns=0,f=0;
            System.out.println(x+"*"+y+"=?");
            //loop until the user type a valid answer
            do {
                try {
                    yourAns = sc.nextInt();
                    f = 0;
                } catch (InputMismatchException ex) {
                    //System.out.println(ex);
                    sc.nextLine();
                    System.out.println("Make sure that your input is a number\nEnter your answer again");
                    f = 1;
                }
            }while(f==1);
            if(ans==yourAns){
                System.out.println("Correct");
                score++;
            }
            else{
                System.out.println("Wrong");
            }
        }
        System.out.println("Your score = "+score);
        float f=(float)score/(float)n;
        if(f==1){
            System.out.println("Amazing, you got all questions right");
        }
        else if(f==0){
            System.out.println("None of your answers were right");
        }

        else if(f<0.33){
            System.out.println("you need to improve your basic mathematics");
        }
        else if(f<0.66){
            System.out.println("Not bad, improve yourself to get close to 90%");
        }
        else if(f<0.9){
            System.out.println("Great, try to get a all questions right the next time");
        }
        else{
            System.out.println("Great, you were so close to get a all questions right");
        }

    }
}