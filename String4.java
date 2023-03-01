package StringsTopic;

import java.util.Scanner;

public class String4 {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String string=sc.next();
        String whattocheck=sc.next();

        if(string.indexOf(whattocheck) != -1)
            System.out.print("Exists");
        else
            System.out.print("Doesn't Exist");

    }

}
