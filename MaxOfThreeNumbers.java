import java.util.Scanner;
class MaxOFThreeNumbers {
 public static void main(String[] args) {
   //Write your code in the space after this line:

  
   //Introduction 
   System.out.println("\n\n\n\n\nThis program will ask you for three numbers (integers or decimals doesnt matter) and then it will output the Largest one :) ");

   //Input numbers
   Scanner Input = new Scanner(System.in);
   
   System.out.println("\n Enter the First Number");
   double num1 = Input.nextDouble();

   System.out.println("\n Enter the Second Number");
   double num2 = Input.nextDouble();

   
   System.out.println("\n Enter The Third Number");
   double num3 = Input.nextDouble();

  
   
   //If else magic 

  
   //if num1 is greatest: 
   if (num1>num2 && num1>num3){
     System.out.println("\nThe first number : "+num1+ " is the largest number" );
   }

     
 
     //if num2 is greatest:
   else if(num2>num1 && num2>num3){
     System.out.println("\nThe second number : "+num2+" is the largest number");
   }

     
   
     
     //if num3 is the greatest:  
   else if (num3>num1 && num3>num2 ){
     System.out.println("\nThe third number : "+num3+" is the greatest number ");
   }


     
  // Advance Cases 

  //if all numbers are equal 
   else if (num1==num2 && num1==num3 && num3==num2){
     System.out.println("\n All numbers are equal");
   }

     
     // if only num 1 and num2 are equal
     else if (num1==num2){
       //then chack if num1 is greater then num3 
       if(num1>num3){
         //then print that both num1 and num 2 are greater than num3 
         System.out.println("\nThe first number  and the second number : "+num2+" are the largest numbers");}
         
       //if num3 is greater than num1 and num2 then print 
       else if (num3>num1){
         System.out.println("\nThe third number : "+num3+" is the largest");
         }
       }
   
     
       
       //if num1 and num3 are equal
     else if (num1==num3){
       // then check if num1 is greater than num2
     if(num1>num2){
       System.out.println("\nThe first number  and the third number : "+num3+" are the largest numbers");
     }
       //if num2 is greator than num1 and num3 then print 
     else if (num2>num1){
       System.out.println("\nThe second number : "+num2+" is the largest");
     }
   }
   Input.close();


     }
     
 }

