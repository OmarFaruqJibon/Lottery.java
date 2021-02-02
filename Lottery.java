import java.util.Scanner;
import java.util.Random;
public class Lottery {
    public static void main(String[] args) {
        Random rm = new Random();
        Scanner input = new Scanner(System.in);
        
        int lottery = rm.nextInt(900)+100;
        int lottery_no;
        
        System.out.print("Enter the 3 digit no : ");
        lottery_no  =input.nextInt();
        System.out.println("The Lottery No Is = " + lottery);
        if(lottery == lottery_no)
        {
            System.out.println("Congratulations, You Have Matched All of The Digits And Won $10,000");
        }
        else{
            int tmp1 = lottery;
            int cnt=0;
            while(tmp1 > 0)
            {
                int d = tmp1 % 10 ; 
                
                int tmp2=lottery_no;
                while(tmp2>0) 
                {
                    int d1 = tmp2 % 10;  
                    if(d1 == d)
                    {
                        cnt++;
                        break;
                    }
                    tmp2 = tmp2/10;
                }
                tmp1 = tmp1 / 10;
            }
            if(cnt == 3)
            {
                System.out.println("Congratulations, You Have Matched Two of The Digits And Won $3,000");
            }
            else if(cnt==1)
            {
                System.out.println("Congratulations, You Have Matched One of The Digits And Won $1,000");
            }else{
                System.out.println("Sorry!!! Do Not Match.");
            }
        }
    }
}
