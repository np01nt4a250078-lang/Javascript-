
/**
 * Write a description of class qn5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class qn5
{
   public static void main (String[]args) 
   { 
       Scanner obj=new Scanner(System.in);
       System.out.println(" Enter the mp");
     Float mp =obj.nextFloat();
     System.out.println(" Enter the category");
     String abc=obj.next();
     //convert into char data type
     char category =abc.charAt(0);
     switch(category)
     {
        case 'A':
             double sp=mp - (mp* 0.6);
        System.out.println("The selling ptice of category A is" +sp);
        break;
        
        case 'B':
         double sp1=mp - (mp* 0.6);
        System.out.println("The selling ptice of categoryB is" +sp);
        break;
        case 'c':
         double sp2=mp - (mp* 0.6);
        System.out.println("The selling ptice of categoryc is" +sp);
        break;
        case 'd':
         double sp3=mp - (mp* 0.6);
        System.out.println("The selling ptice of categorydis" +sp);
        break;
        }
        }
        
     }
        
        
        
        
        
        
    
    
    
    
    
    
    }
}