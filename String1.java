package StringsTopic;

import java.util.Scanner;

public class String1 {

    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String string=sc.next();
        int i;
        System.out.print("Enter the index you want to see");
        i=sc.nextInt();
        System.out.print(string.charAt(i));
    }
}