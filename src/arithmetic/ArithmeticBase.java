/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic;

import static com.sun.tools.javac.main.Option.X;
import java.util.Scanner;

/** This class takes String input plus,minus,divide and times
 * from user and execute the arithmetic operation
 * change the code to use enum instead String and mention the advantage of enum.
 * @author sivagamasrinivasan
 * 
 */
public class ArithmeticBase 
{
 private double  x, y ;
 public enum operation {PLUS, MINUS, MULT, DIV};

        
    double calculate(double x, double y) 
        {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter arithmetic operation (PLUS, MINUS, MULT, DIV) to Perform: ");
        String s= sc.next();
        switch (s.equals(operation())) 
        {
            case "PLUS":
                return x + y;
                
            case "MINUS":
                return x - y;
                
            case "MULT":
                return x * y;
            case "DIV":
                return x / y;
               
            default:
                throw new AssertionError("Unknown operations " + this);
        }
    }
   
}
