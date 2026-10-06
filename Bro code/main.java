import java.util.Scanner;
import java.util.Random;

// public class main {
//     public static void main(String[] args) {

        // This is my first java program

        
        // Introduction to Java
        
        //System.out.println("Krishna Here");
        //System.out.print("I Love Cricket \n I am a Batsman \n I play Cricket \n");
        //System.out.print("I play Cricket \n");
    // }}
        
    //Variables
    // public class main {
    // public static void main(String[] args) {

        //Variable

        // 2 Steps to create a variable
        // 1) Declaration
        // 2) Assignment


        //3)  Integer
        // int x = 18;
        // int y = 17;
        // int z = 45;
        // System.out.println("x + y + z = " + (x + y + z));
        
        // Double
        
        // double price = 9.2;
        // double gps = 9.1;
        // System.out.println(price) ;
        // System.out.println(gps) ;
        
        // Char
        // char grade = 'A';
        // System.out.println(grade);
        
        // Boolean
        // boolean student = true;
        // System.out.println(student);
        
    // }}

//ifelse
// public class main {
//     public static void main(String[] args) {

//         // // If else
//         // int x = 18;
//         // int y = 17;
//         // if( x < y){
//         //     System.out.println("Virat Kohli is King");
//         // }
//         // else{
//         //     System.out.print("Virat KOhli is the only King");
//         // }
//     }}

        // String
        // String Fname = "Krishna ";
        // String Mname = "Devasnh ";
        // String Lname = "Rao ";
        // // System.out.print(Fname + Mname + Lname);

        // String car =  "RollsRoyce " ;
        // String colour = "White ";
        // String location = "Shamrock Greens" ;
        // System.out.print("Hey I am " + (Fname + Mname + Lname) + "and I have seen a " + (colour + car + "at " + location) );


        // Input from user 
// public class main {
// public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);
        // System.out.print("Enter detail: ");
        // String output_name = input.nextLine();
        // System.out.println("Hey " + output_name);
        // System.out.print("Enter your age: ");
        // int age = input.nextInt();
        // System.out.println("So you are " + age + " yrs old right?");
        // System.out.print("Yes or No: ");
        // String confirmation = input.next();
        // if (confirmation.equalsIgnoreCase("yes")) {
        //     System.out.println("Yea got it!");
        // } else {
        //     System.out.println("So what's your current age?");
        // }

        // input.close();


    // Scanner var1 = new Scanner(System.in);
    // System.out.print("Name: ");
    // String name = var1.nextLine();
    // var1.close();

// }}
    

 // //Assignment - Calc the area of rect;
// public class main {
    // public static void main(String[] args) {
    // Scanner input = new Scanner(System.in);
    // System.out.println("Enter the Details to find the area of rectangle ");
    // System.out.print("Enter the length: ");
    // int length = input.nextInt();
    // System.out.print("Enter the bredth: ");
    // int bredth = input.nextInt();
    // input.close();
    // int area = length * bredth ; 
    // System.out.println("The area of rect is : " + area + " cm");
// }}


//Pizza🍕 assignment
// public class main{
    // public static void main(String[] args){
    // Scanner input = new Scanner(System.in);
    // System.out.println("What Would you like to buy? ");
    // System.out.println("1)Pizza ");
    // System.out.println("2)Burger ");
    // System.out.println("3)Sandwich ");
    // System.out.println("The Price will be shown along");
    // int choise = input.nextInt();
    // int price = 0;
    // String decision = "";
    // if(choise == 1){
    // System.out.println(" Pizza🍕 ");
    // System.out.println(" Price: 10$ ");
    //     decision = "Pizza🍕" ;
    //     price = 10;
    // }
    // else if(choise == 2){
    // System.out.println(" burger🍔 ");
    // System.out.println(" Price: 12$ ");
    //     decision = "burger🍔" ;
    //     price = 12;
    // }
    // else if(choise == 3){
    // System.out.println(" Sandwich🥪 ");
    // System.out.println(" Price: 15$ ");
    //     decision = "Sandwich🥪" ;
    //     price = 15;
    // }
    // else{
    // System.out.println(" retry ");
    // }
    // System.out.println("You have selected " + decision );
    // System.out.println("How many would you like?" );
    // int quantity = input.nextInt();
    // System.out.println("You have bought " + quantity + " " + decision );
    // int total_price = price * quantity ;
    // System.out.println("Your Total is $" + total_price);
// }

//if else
// public class Main {
    //     public static void main(String[] args) {
    //     Scanner input = new Scanner(System.in);
    //     System.out.print("Enter a number: ");
    //     int number = input.nextInt();
    //     if (number >= 0) {
    //         System.out.println("Positive number");
    //     } else {
    //         System.out.println("Negative number");
    //     }
    //     input.close();
// // }}


//random number
// public class main {
    //     public static void main(String[] args) {
    //         Random rand = new Random();
    //         int num,num1,num2 ; 
    //         num = rand.nextInt(1,19);
    //         num1 = rand.nextInt(1,19);
    //         num2 = rand.nextInt(1,19);
    //         System.out.println(num);
    //         System.out.println(num1);
    //         System.out.println(num2);
//     }}



//CompoundInterestCalculator
// public class CompoundInterestCalculator {
    //     public static void main(String[] args) {    
    //         Scanner sc = new Scanner(System.in);    
    //         System.out.print("Enter Principal Amount: ");
    //         double principal = sc.nextDouble(); 
    //         System.out.print("Enter Annual Interest Rate (%): ");
    //         double rate = sc.nextDouble();  
    //         System.out.print("Enter Time (in years): ");
    //         double time = sc.nextDouble();  
    //         double amount = principal * Math.pow((1 + rate / 100), time);
    //         double compoundInterest = amount - principal;   
    //         System.out.println("\n----- Result -----");
    //         System.out.println("Principal Amount: ₹" + principal);
    //         System.out.println("Interest Rate: " + rate + "%");
    //         System.out.println("Time: " + time + " years");
    //         System.out.println("Compound Interest: ₹" + compoundInterest);
    //         System.out.println("Final Amount: ₹" + amount); 
    //         sc.close();
    //     }
// }

//Nestedif
// public class NestedIf {
    //     public static void main(String[] args) {
    //         java.util.Scanner sc = new java.util.Scanner(System.in);
    //         System.out.print("Enter your age: ");
    //         int age = sc.nextInt();
    //         if (age >= 18) {
    //             System.out.print("Do you have a driving license? (1 for Yes, 0 for No): ");
    //             int license = sc.nextInt();
    //             if (license == 1) {
    //                 System.out.println("You can drive.");
    //             } else {
    //                 System.out.println("You are 18+ but don't have a license.");
    //             }
    //         } else {
    //             System.out.println("You are not eligible to drive.");
    //         }
    //         sc.close();
    //     }
// }

// //WeightConverter
// public class WeightConverter {
    //     public static void main(String[] args) {
    //         java.util.Scanner sc = new java.util.Scanner(System.in);
    //         System.out.print("Enter weight in kg: ");
    //         double kg = sc.nextDouble();
    //         double grams = kg * 1000;
    //         double pounds = kg * 2.20462;
    //         System.out.println("Weight in grams: " + grams + " g");
    //         System.out.println("Weight in pounds: " + pounds + " lbs");
    //         sc.close();
    //     }
// }

//TernaryOperator
// public class TernaryOperator {
    //     public static void main(String[] args) {
    //         java.util.Scanner sc = new java.util.Scanner(System.in);
    //         System.out.print("Enter your age: ");
    //         int age = sc.nextInt();
    //         String result = (age >= 18) ? "Eligible to vote" : "Not eligible to vote";
    //         System.out.println(result);
    //         sc.close();
    //     }
// }


//TemperatureConverter
// public class TemperatureConverter {
    //     public static void main(String[] args) {
    //         java.util.Scanner sc = new java.util.Scanner(System.in);
    //         System.out.print("Enter temperature in Celsius: ");
    //         double celsius = sc.nextDouble();
    //         double fahrenheit = (celsius * 9 / 5) + 32;
    //         System.out.println("Temperature in Fahrenheit: " + fahrenheit + "°F");
    //         sc.close();
    //     }
// }

// //Switchcase
// public class Week {
    //     public static void main(String[] args) {
    //         java.util.Scanner sc = new java.util.Scanner(System.in);
    //         System.out.print("Enter day number (1-7): ");
    //         int day = sc.nextInt();
    //         switch (day) {
    //             case 1:
    //                 System.out.println("Monday");
    //                 break;
    //             case 2:
    //                 System.out.println("Tuesday");
    //                 break;
    //             case 3:
    //                 System.out.println("Wednesday");
    //                 break;
    //             case 4:
    //                 System.out.println("Thursday");
    //                 break;
    //             case 5:
    //                 System.out.println("Friday");
    //                 break;
    //             case 6:
    //                 System.out.println("Saturday");
    //                 break;
    //             case 7:
    //                 System.out.println("Sunday");
    //                 break;
    //             default:
    //                 System.out.println("Invalid day");
    //         }
    //         sc.close();
    //     }
// }

// //Calculator
// public class Calculator {
    //     public static void main(String[] args) {
    //         java.util.Scanner sc = new java.util.Scanner(System.in);
    //         System.out.print("Enter first number: ");
    //         double num1 = sc.nextDouble();
    //         System.out.print("Enter operator (+, -, *, /): ");
    //         char operator = sc.next().charAt(0);
    //         System.out.print("Enter second number: ");
    //         double num2 = sc.nextDouble();
    //         switch (operator) {
    //             case '+':
    //                 System.out.println("Result = " + (num1 + num2));
    //                 break;
    //             case '-':
    //                 System.out.println("Result = " + (num1 - num2));
    //                 break;
    //             case '*':
    //                 System.out.println("Result = " + (num1 * num2));
    //                 break;
    //             case '/':
    //                 if (num2 != 0) {
    //                     System.out.println("Result = " + (num1 / num2));
    //                 } else {
    //                     System.out.println("Cannot divide by zero");
    //                 }
    //                 break;
    //             default:
    //                 System.out.println("Invalid operator");
    //         }
    //         sc.close();
    //     }
// }


//LogicalOperator
// public class LogicalOperator {
    //     public static void main(String[] args) {
    //         int age = 20;
    //         boolean hasID = true;
    //         if (age >= 18 && hasID) {
    //             System.out.println("Entry allowed");
    //         }
    //         if (age < 18 || !hasID) {
    //             System.out.println("Entry not allowed");
    //         }
    //     }
// }


//WhileLoop
// public class WhileLoop {
    //     public static void main(String[] args) {
    //         int i = 1;
    //         while (i <= 10) {
    //             System.out.println(i);
    //             i++;
    //         }
    //     }
// }


// NumberGuessingGame
    // public class NumberGuessingGame {
    //     public static void main(String[] args) {
    //         java.util.Scanner sc = new java.util.Scanner(System.in);
    //         int number = 7;
    //         int guess = 0;
    //         while (guess != number) {
    //             System.out.print("Guess the number: ");
    //             guess = sc.nextInt();
    //             if (guess < number) {
    //                 System.out.println("Too low!");
    //             } else if (guess > number) {
    //                 System.out.println("Too high!");
    //             } else {
    //                 System.out.println("Correct! You guessed it.");
    //             }
    //         }
    //         sc.close();
    //     }
// }


//ForLoop
// public class ForLoop {
    //     public static void main(String[] args) {
    //         for (int i = 1; i <= 10; i++) {
    //             System.out.println(i);
    //         }
    //     }
// }

// //BreakExample
// public class BreakExample {
    //     public static void main(String[] args) {
    //         for (int i = 1; i <= 10; i++) {
    //             if (i == 6) {
    //                 break;
    //             }
    //             System.out.println(i);
    //         }
    //     }
// }

// NestedLoops
// public class NestedLoops {
    //     public static void main(String[] args) {
    //         for (int i = 1; i <= 5; i++) {
    //             for (int j = 1; j <= 5; j++) {
    //                 System.out.print("* ");
    //             }
    //             System.out.println();
    //         }
    //     }
// }

// // Methods
// public class Methods {
    //     static void hello() {
    //         System.out.println("Hello, Welcome to Java!");
    //     }
    //     static int add(int a, int b) {
    //         return a + b;
    //     }
    //     public static void main(String[] args) {
    //         hello();
    //         int result = add(10, 20);
    //         System.out.println("Sum = " + result);
    //     }
// }







