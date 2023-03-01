package SecondDay;

import java.util.Scanner;

public class ques4 {


    Boolean checkNumber(int n)
    {
        int num=n;
        while(num!=1)
        {
            if(num%2==0)
                num=num/2;
            else
                return false;
        }
        return true;
    }

    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        ques4 q=new ques4();
        Boolean ans=q.checkNumber(i);
        if(ans)System.out.print("Power of 2");
        else System.out.print("Not power of 2");
    }

}