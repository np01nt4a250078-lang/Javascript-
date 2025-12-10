
/**
 * Write a description of class week4ws1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class week4ws1
{
   public static void main(String[]args) 
   {
     Scanner obj=new Scanner(System.in);
     System.out.println("Please enter your marks");
     double marks=obj.nextFloat();
     if (marks>=40)
     {
       System.out.println("pass"); 
        }
      else if(marks<=40)
        {
         System.out.println("fails");
        }
     
  
    }
}