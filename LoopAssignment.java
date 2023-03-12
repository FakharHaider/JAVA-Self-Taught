import java.util.Scanner;
public class LoopAssignment {
  public static void main(String[] args) {
    
    Scanner Input = new Scanner(System.in);

    //initial variables to calculate number of subjects, sum, total and %
    int numberofSubjects = 0;
    int marks;
    int sum=0;
    int total=0;


    //introduction
    System.out.println("\n\n\n\n\n\nPlease Enter marks out of 100 ");

  //Ask for marks in a loop
    while(true){
      System.out.println("\n\n\n\nEnter you marks: press 0 or a negative number to stop input and calculate your percentage ");
      
      
      //enter value of marks
       marks = Input.nextInt();

      
      //check if the entered value is 0 or less
      if(marks<=0)
      
        
        //if it is then break the loop at that point
      {break;}

      
       //if not then keep going increase the number of subjects after each input, because the user is typing marks more than 0, then it means they have another subject ofcourse 
      else if(marks>0)
        {numberofSubjects++;


      //and also increase total marks by 100 because the percentage is obtained marks divided by total marks, so as the number of subject increase, increase total marks by 100
      total+=100;

      //keep adding the value of marks into the sum variable each time the loop runs
      sum+=marks;}
      
    }
    
    //create a percent variable
    double percent = (sum*100)/total;
    //print the results
  System.out.println("\n\nYou entered marks of total "+numberofSubjects+" subjects, Your total marks are : "+sum+" out of "+total);

    System.out.println("\n\nYou got "+percent+"%\n\n\n");
    Input.close();
  }
}