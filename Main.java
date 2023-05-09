import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Q1

//        for(int i=1 ;i<=100;i++) {
//
//            if (i%3 == 0) {
//                System.out.println("Fizz");
//            }
//            if (i % 5 == 0) {
//                System.out.println("Buzz");
//            }
//            if (i % 3 == 0 && i % 5 == 0) {
//                System.out.println("FizzBuzz");
//            }
//        }

//        Q2

//      String Text = " The quick brown fox" ;
//         String reverse ="";
//       int length = Text.length();
//       for (int i=length-1;i>=0;i--) {
//           reverse = reverse + Text.charAt(i);
//       }
//           System.out.println(reverse);

//
//        Q3
////
//        Scanner A=new Scanner(System.in);
//        System.out.println("input a positive integer ");
//        int num= A.nextInt();
//        for (int i=1 ;i<=10 ; i++){
//            System.out.println(num + " * " + i + " = "+ (num * i));
//        }
//
//
//         Q4.Write a program to find the factorial value of any number entered through the keyboard.
//
//        Scanner A =new Scanner(System.in);
//         System.out.println("Enter number : ");
//         int num =A.nextInt();

//         int fact=1;
//         for (int i=1 ;i<=num;i++) {
//             fact=fact * i;
//         }
//         System.out.println(fact);
//
//
//        Q5 Two numbers are entered through the keyboard. Write a program to find the value of one number raised to the power of another.

//
//        Scanner A=new Scanner(System.in);
//        System.out.println("Enter the number : ");
//        int num= A.nextInt();
//
//        System.out.println("Enter the power number : ");
//        int power= A.nextInt();
//
//        int result=1;
//        for (int i=1 ;i<=power;i++){
//
//          result=result*num;
//        }
//        System.out.println(result);



//    Q6.Write a program that reads a set of integers, and then prints the sum of the even and odd integers.

//        Scanner A= new Scanner(System.in);
//        System.out.println("Enter number : ");
//        int number=A.nextInt();
//
//        int even =0 ;
//        int odd=0;
//          for(int i=1; i<=number;i++) {
//              if (i % 2 == 0) {
//                  even = even + i;
//              } else {
//                  odd = odd + i;
//              }
//          }
//              System.out.println(" Even " + even);
//              System.out.println(" Odd  " + odd);

//
//        Q7.Write a program that prompts the user to input a positive integer. It should then output a message indicating whether the number is a prime number.
//
//
//        Scanner A= new Scanner(System.in);
//        System.out.println("Enter a Number: ");
//        int num=A.nextInt();
//
//        if (num % 2 == 0) {
//            System.out.println("not prime");
//        } else {
//            System.out.println("Prime");
//        }
//
//
//        Q8.Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered.
//
//        Scanner A=new Scanner(System.in);
//
//        int positive=0;
//        int negative=0;
//        int zeros=0;
//        for (int i=1; i<=3 ; i++){
//        System.out.println(" Enter a number: ");
//            int num=A.nextInt();
//        if (num > 0){
//            positive++;
//        }
//        if (num < 0 ) {
//            negative++;
//        }
//        if (num == 0) {
//                zeros++;
//            }
//            System.out.println(" number of positive: " +  positive);
//            System.out.println(" number of negative: " +  negative);
//            System.out.println(" number of zeros: " +  zeros);
//        }
//
//        Q9.Use a for loop to print headings for four weeks (Weeks 1 - 4). Then use another for loop to print the days (Days 1 -7) for each week.
//
//        int week=4;
//        int day=7;
//        int i=1;
//        while (i<=week){
//            System.out.println(" Week : "+ i);
//            for (int j=1; j<=day;++j){
//                System.out.println(" Day : "+ j);
//            }
//            ++i;
//        }
//
//        Q10.Write a program thats check if the word is a palindrome or not. hint: A string is said to be a palindrome if it is the same if we start reading it from left to right or right to left.

//        Scanner A = new Scanner((System.in));
//        String S = A.next();
//        String x = "";
//
//        for (int i = S.length()- 1; i >= 0; i--) {
//            x += S.charAt(i);
//        }
//            System.out.println("the reverse is :" + x);
//            if (S == (x))
//                System.out.println("it is palindrome");
//            else
//                System.out.println("it is not palindrome");




          }
    }

