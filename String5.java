package StringsTopic;

import java.util.Scanner;

public class String5 {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String string=sc.nextLine();
        System.out.println(string);
        String[] arr=string.split(" ");
        System.out.print(arr.length);
    }

}