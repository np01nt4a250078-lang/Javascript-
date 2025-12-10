
/**
 * Write a description of class qn4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class qn4
{
    public static void main(String[]args) 
    {
     Scanner obj=new Scanner(System.in);;
     System.out.println(" Enter the mp");
     Float mp =obj.nextFloat();
     System.out.println(" Enter the category");
     String abc=obj.next();
     //convert into char data type
     char category =abc.charAt(0);
      if (category== 'A')
       {
        double sp=mp - (mp* 0.6);
        System.out.println("The selling ptice of category A is" +sp);
        }
        else  if (category =='B')
        { 
    
         double sp=mp - (mp* 0.4);
        System.out.println("The selling ptice of category b is" +sp);
        }
         else  if (category =='c')
        { 
    
         double sp=mp - (mp* 0.2);
        System.out.println("The selling ptice of category b is" +sp);
        }
         else  if (category =='d')
        { 
    
         double sp=mp - (mp* 0.1);
        System.out.println("The selling ptice of category b is" +sp);
        }
        else 
        { 
         System.out.println("not avaiable");
        }
        
              
     
     
     
    
    
    
    
    
    
    }

       
    
    
    
    
    
    
}