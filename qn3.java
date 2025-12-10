
/**
 * Write a description of class qn3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class qn3
{
   //divisible by number 3 or 5 or not
   public static void main(String[]args)
   {
    Scanner obj=new Scanner(System.in);
    System.out.println("enter the number");
    int number=obj.nextInt();
     if ( number% 3==0)
     { if(number % 5==0) 
         {
            System.out.println("both 3 & 5");
            }
            else
            {
               System.out.println("divisible by 3 but not 5");
            
            }
        }
        else 
        {
          System.out.println("the number is not divisible by both numbers");
        }
    
    
    
    
    
    
    
    
    
    
    
    }
}