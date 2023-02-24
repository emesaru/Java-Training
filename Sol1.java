package Assignement1_Solutions;

import java.util.Scanner;

//at the time of project creation select 1.8 version
public class Sol1 {

    public static void main(String args[]) {

        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a<0) {
            System.out.print("Negative");
        }else if(a>0){
            System.out.print("Positive");
        }else {
            System.out.print("Zero");
        }
    }

}