// Carlon Brown
//Homework 2
// Web Systems Arch/Programming
//imported the scanner and math
import java.util.Scanner;
import java.lang.Math;

//Calculator class
public class Calculator2 {
// Main
    public static void main(String[] args) {
// Scanner for user to input 1, 2 , 3 so they can determine what they want to use.
        Scanner input = new Scanner(System.in);
        
        System.out.println("1) Would you like to use simple calculator? (+,-,*,/)");
        System.out.println("2) Or Determine angle of Triangle? (Obtuse, Acute, Right");
        System.out.println("3) Or Calculate the quadratic formula? ");

        int choice = input.nextInt();
// Switch Method to call other objects and ask them the number of sides to calculate a Triangle

        switch(choice){
            //Calls from the operation()
            case 1:
                operation();
                break;

// Asks for number of sides
            case 2:
                String Q1 = "What is the first side of the Triangle?";
                String Q2 = "What is the second side of the Triangle?";
                String Q3 = "What is the third side of the Triangle?";
        
                int[] sides = new int[3];
        
                System.out.println(Q1);
                sides[0] = input.nextInt();
        
                System.out.println(Q2);
                sides[1] = input.nextInt();
        
                System.out.println(Q3);
                sides[2] = input.nextInt();
        
                Triangle triangle = new Triangle(sides);

                triangle.getAngle();
                break;
// Calls from the quadratic()
            case 3:
            quadratic();
            break;


            default:
            try {
                System.out.println("Incorrect response");
              } catch (Exception e) {
                System.out.println("Something went wrong.");
              }
                
                break;
        }

        input.close();
      
    } 
// for calculating the quadratic formula
    public static void quadratic(){
        Scanner quad = new Scanner(System.in);
        double quad1= 0;
        double quad2= 0;
        double quad3= 0;
        double answer1= 0;
        double answer2 = 0;
        
//Ask for numbers and puts them in the equation
        System.out.println(" Enter first number ");
        quad1 = quad.nextDouble();
        System.out.println(" Enter second number ");
        quad2 = quad.nextDouble();
        System.out.println(" Enter third number ");
        quad3 = quad.nextDouble();
        System.out.println("Enter an sign for quadratic ($): ");
        char sign = quad.next().charAt(0);
        quad.close();

        double d =  quad2*quad2 -4 * quad1 * quad3;

         
// Switch method for them to put in "$" so that it will put the numbers into the formula
        switch(sign)
        {
            case '$':
                answer1 = (-quad2  -Math.sqrt(d))/(2*quad1);
                answer2 =  (-quad2 +Math.sqrt(d))/(2*quad1);
                break;

            default:
                System.out.println(" You have entered wrong sign for quadratic ");
                return;

        }
        // NaN is the output I was getting because of calculation is invalid.
        // By dividing by 0 or taking square root of -1
        if (Double.isNaN(answer1) || Double.isNaN(answer2))
        {
            System.out.println(" the calculation is invalid. ");
        } else System.out.println("The values are: " + answer1 + ", " + answer2);
        
        

    }
// to calulate the simple calculator
    public static void operation(){
        Scanner scanner = new Scanner(System.in);
        double output = 0;
        int a = 0;;
        int b = 0;
        for(int i=0; i<1;i++) {
        System.out.println("Enter first number:");
        // asks for numbers and what operator you wish to use and then calculates what you want it to.
        
        a = scanner.nextInt();
        System.out.println("Enter second number:");
        b = scanner.nextInt();

        System.out.println("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
// switch method for which operator they input
        switch(operator)
        {
            case '+':
             output = a + b;
                break;

            case '-':
             output = a - b;
                break;

            case '*':
             output = a * b;
                break;

            case '/':
             output = a / b;
                break;

           
            default:
                System.out.println("You have entered wrong operator");
                return;

                
        }
        System.out.println("First number: "+a+" "+operator+" "+"Second number: "+b+": "+ " = " +output);
        scanner.close();
    }
             

    }
    // I put the number of sides into a array
            public static class Triangle{
                private int[] sides;
                public Triangle(int[] newSides){
                    sides = new int[3];
                    for(int i = 0; i < sides.length; i++)
                        sides[i] = newSides[i];
                }
// I used my boolean type to calculate based on the numbers entered if its True.
                public boolean isTrue(){
                    if(sides[0] + sides[1] > sides[2]) {
                        System.out.println("The triangle is true!");
                        return true;
            
                    } else {
                        System.out.println("The Triangle is False!");
                        return false;
            
                    }
                    
                }
                // I created in which based on the input of sides it will display if its right,acute, or obtuse triangle.
                public String getAngle(){
                    if(isTrue() == true) {
            
                        if(sides[0] + sides[1] == sides[2]) {
                            
            
                            System.out.println("The Triangle is Right");
                            return "Right";
            
            
                        } else if (sides[0] + sides[1] > sides[2]) {
                            
            
                            System.out.println("The Triangle is Acute");
                            return "Acute";
            
                        } else if(sides[0] + sides[1] < sides[2]) {
                    
            
                            System.out.println("The Triangle is Obtuse");
                            return "Obtuse";
            
                        } else {
                            
            
                            System.out.println("The Triangle is incorrect");
                            return "";
            
                        }
            
                    }
                    return null;
                }

            }
}

