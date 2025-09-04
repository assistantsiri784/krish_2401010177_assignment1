// import java.util.Scanner;
// public class Assignment1 {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.err.print("Enter value of p : ");
//         int p = sc.nextInt();
//         System.err.print("Enter value of r : ");
//         int r = sc.nextInt();
//         System.err.print("Enter value of t : ");
//         int t = sc.nextInt();
//         while(true){
//             if(p>0 && r>0 && t>0){
//                 System.out.println("Simple Interest is : " + p*r*t/100);
//             }
//             else{
//                 System.out.println("inavlid input");
//             }
//             break;
//         }
//         sc.close();
//     }
// }


// import java.util.Scanner;
// public class Assignment1 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("1.Addition\n2.Substration\n3.Multiplication\n4.Divisiion\n5.Remainder");
//         System.out.print("Enter choice :");
//         int choice = sc.nextInt();
//         if (choice >= 1 && choice <= 5) {
//             System.out.print("Enter first number : ");
//             int num1 = sc.nextInt();
//             System.out.print("Enter second number : ");
//             int num2 = sc.nextInt();
//             switch (choice) {
//                 case 1:
//                 System.out.println("Addition is : " + (num1 + num2));
//                 break;
//                 case 2:
//                 System.out.println("Subtraction is : " + (num1 - num2));
//                 break;
//                 case 3:
//                 System.out.println("Multiplition is : " + (num1 * num2));
//                 break;
//                 case 4:
//                 System.out.println("Division is : " + (num1 / num2));
//                 break;
//                 case 5:
//                 System.out.println("Division is : " + (num1 % num2));
//                     break;
//                 default:
//                     break;
//             }
//         }
//         else{
//             System.out.println("invlaid choice.");
//         }
//     }
 


// import java.util.Scanner;
// public class Assignment1 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int total = 0;
//         for (int i = 1; i <= 5; i++) {
//             System.out.print("Enter marks for subject " + ": ");
//             total += sc.nextInt();
//         }
//         double percentage = total / 5.0;
//         if (percentage >= 90){
//             System.out.println("Grade is : A+");
//         }
//         else if (percentage >= 75){
//             System.out.println("Grade is : A");
//         }
//         else if (percentage >= 60){
//             System.out.println("Grade is : B");
//         }
//         else {
//             System.out.println("Grade is : C");
//         }
//         sc.close();
//     }
// }


// import java.util.Scanner;
// public class Assignment{
//     public static void main(String[] args){
//     Scanner sc = new Scanner(System.in);
//     String password = "Krish";
//     System.out.print("Guess password :");
//     String guess = sc.nextLine();
//     int n = 0; 
//     while (n <= 3) {
//         n++;
//         if(guess.equals(password)){
//             System.out.println("Correct guess");
//         }
//         else{
//             System.out.println("Try again");
//         }
//            break;
//     }
//      s.close;
//     }
// }


// import java.util.Scanner;
// public class Assignment1 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter num :");
//         int num = scanner.nextInt();
//         for(int i = 1 ; i <= 10 ; i++){
//             System.out.println( num + " x " + i + " = " + (num * i));
//         }
//     }
// }


// import java.util.Scanner;
// public class Assignment1{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         while (true){
//             System.out.print("Enter the amount : ");
//             int balance = 10000 , amount = sc.nextInt() ;
//             if(balance<amount){
//                 System.out.println("Balance insufficent");
//             }
//             else{
//                 balance=balance-amount;
//                 System.out.println("Balance Sufficient " + balance);
//             }
//         }
//     }
// }


// import java.util.Scanner;
//  public class Assignment1{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         while(true){
//             System.out.print("Enter Units : ");
//             int Unit = sc.nextInt();
//             if(Unit<=100){
//                 System.out.println("Bill : " + (Unit*5));
//             }
//             else if(Unit>= 100 && Unit<= 200){
//                 System.out.println("Bill : " + (100*5 + (Unit - 100)*7));
//             }
//             else{
//                 System.out.println("bill  :" + (Unit*10));
//             }
//         }
//     }
//  }


// import java.util.Scanner;
// public class Assignment1{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number :");
//         int n = sc.nextInt();
//         int evencount = 0 , oddcount = 0;
//         for(int i=0 ; i<n ; i++){
//             System.out.print("enter " + (i+1) + " number :" );
//             int num = sc.nextInt();
//             if(num%2 ==0){
//                 evencount++;
//             }
//             else{
//                 oddcount++;
//             }
//         }
//         System.out.println("Number of evennumber are :" + evencount);
//         System.out.println("Number of oddnumber are :" + oddcount);
//     }
// }


// import java.util.Scanner;
// public class Assignment1{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
        
//     }
// }