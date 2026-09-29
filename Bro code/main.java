import java.util.Scanner;

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
public class main{
    public static void main(String[] args){

    Scanner input = new Scanner(System.in);
    System.out.println("What Would you like to buy? ");
    System.out.println("1)Pizza ");
    System.out.println("2)Burger ");
    System.out.println("3)Sandwich ");
    System.out.println("The Price will be shown along");
    int choise = input.nextInt();
    int price = 0;
    String decision = "";
    if(choise == 1){
    System.out.println(" Pizza🍕 ");
    System.out.println(" Price: 10$ ");
        decision = "Pizza🍕" ;
        price = 10;
    }
    else if(choise == 2){
    System.out.println(" burger🍔 ");
    System.out.println(" Price: 12$ ");
        decision = "burger🍔" ;
        price = 12;
    }
    else if(choise == 3){
    System.out.println(" Sandwich🥪 ");
    System.out.println(" Price: 15$ ");
        decision = "Sandwich🥪" ;
        price = 15;
    }
    else{
    System.out.println(" retry ");
    }
    System.out.println("You have selected " + decision );
    System.out.println("How many would you like?" );
    int quantity = input.nextInt();
    System.out.println("You have bought " + quantity + " " + decision );
    int total_price = price * quantity ;
    System.out.println("Your Total is $" + total_price);
    } }














