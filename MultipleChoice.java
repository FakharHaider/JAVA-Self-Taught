import java.util.Scanner;
public class MultipleChoice {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int CorrectAnswers = 0;
        int TotalQuestion = 5;
        
        
        //Question1
        System.out.println("\n\n\n\n1:When Was the Canadian Charter of Rights and Freedoms Created?");{
        
        
        //GIven Options    
        int OptionD = 1982;
        int OptionB = 1945;
        int OptionC = 1929;
        int OptionA = 1956;

        

        //Print the Options 
        System.out.println("a: "+OptionA+"\t\t b: "+OptionB);
        System.out.println("c: "+OptionC+"\t\t d: "+OptionD+"\n");

        //Ask for Answer
        int Answer = Input.nextInt();
        
        //Check Answer
        if(Answer==OptionD){
            System.out.println("\nCORRECT ANSWER");
            CorrectAnswers++;
        }
        else if (Answer==OptionB){
            System.out.println("\nWrong Answer, it was actually in 1982");
        }
        else if(Answer==OptionC){
            System.out.println("\nWrong Answer, it was actually in 1982");
        }
        else if (Answer==OptionA){
            System.out.println("\nWrong Answer, it was Actually in 1982");
        }
        else{System.out.println("\nWrong Answer, it was actually in 1982");}
  
       }
    
    
    
      //Question2
       System.out.println("\n\n\n2:When was the Statute of Westminster Created? ");{
        
        //Given Options
        int Option2A = 1931 ;
        int Option2B = 1958;
        int Option2C = 1943;
        int Option2D = 1987;

        //Print the Options
        System.out.println("a: "+Option2A+"\t\t b: "+Option2B);
        System.out.println("c: "+Option2C+"\t\t d: "+Option2D+"\n");
        
        //Ask For Answer
        int Answer2 = Input.nextInt();

        //Check Answer
        if(Answer2==Option2A){
            System.out.println("\nCORRECT ANSWER");
            CorrectAnswers++;
        }
        else if(Answer2==Option2B){
            System.out.println("\nIncorrect Answer, it was actually in 1931");
        }
        else if(Answer2==Option2C){
            System.out.println("\nIncorrect Answer, it was actually in 1931");
        }
        else if(Answer2==Option2D){
            System.out.println("\nIncorrect Answer, it was actually in 1931");
            
        }
        else{System.out.println("\nIncorrect Answer, it was actually in 1931");}

       }


       //Question 3 
       System.out.println("\n\n\n3:When was the Quebec Referendum to seperate from Canada Held in? ");{
        
        //Given Options
        int Option3A = 1983;
        int Option3B = 1995;
        int Option3C = 1999;
        int Option3D = 1984;

        //Print the Options
        System.out.println("a: "+Option3A+"\t\t b: "+Option3B);
        System.out.println("c: "+Option3C+"\t\t d: "+Option3D+"\n");
        
        //Ask For Answer
        int Answer3 = Input.nextInt();

        
        //Check Answer
        if(Answer3==Option3A){
            System.out.println("\nIncorrect Answer, it was actually in 1995");
        }
        else if(Answer3==Option3B){
            System.out.println("\nCORRECT ANSWER");
            CorrectAnswers++;
        }
        else if (Answer3==Option3C){
            System.out.println("\nIncorrect Answer, it was actually in 1995");
        }
        else if(Answer3==Option3C){
            System.out.println("\nIncorrect Answer, it was actually in 1995");
        }
        else if(Answer3==Option3D){
            System.out.println("\nIncorrect Answer, it was actually in 1995");
        }
        else{System.out.println("\nIncorrect Answer, it was actually in 1995");}

       }

       
      //question 4
       System.out.println("\n\n\n4:When was the 'British North America Act' passed in the British Parliament");{
     
     //Given Options
      int Option4A = 1861;
      int Option4B = 1893;
      int Option4C = 1867;
      int Option4D = 1876;

      //Print the Options 
      System.out.println("a: "+Option4A+"\t\t b: "+Option4B);
        System.out.println("c: "+Option4C+"\t\t d: "+Option4D+"\n");

      
      //Ask for Answer
        int Answer4 = Input.nextInt();

      
      //Check Answer
        if(Answer4==Option4A){
        System.out.println("\nIncorrect Answer, it was actually in 1867");
      }
      else if(Answer4==Option4B){
        System.out.println("\nIncorrect Answer, it was actually in 1867");
      }
      else if(Answer4==Option4C){
        System.out.println("\nCORRECT ANSWER");
        CorrectAnswers++;
      }
      else if(Answer4==Option4D){
        System.out.println("\nIncorrect Answer, it was actually in 1867");
      }
      else{System.out.println("\nIncorrect Answer, it was actually in 1867");}


    }
    
    

    //Question5
       System.out.println("\n\n\n5:When was the Magna Carta Signed? ");{

        //Given Options
        int Option5A = 1159;
        int Option5B = 1215;
        int Option5C = 1298;
        int Option5D = 1314;

        //Print the Options
        System.out.println("a: "+Option5A+"\t\t b: "+Option5B);
        System.out.println("c: "+Option5C+"\t\t d: "+Option5D+"\n");

        //Ask for answer
        int Answer5 = Input.nextInt();

        //Check Answer
        if(Answer5==Option5A){
            System.out.println("\nIncorrect Answer , it was actually in 1215");
        }
        else if(Answer5==Option5B){
            System.out.println("\nCORRECT ANSWER");
            CorrectAnswers++;
        }
        else if(Answer5==Option5C){
            System.out.println("\nIncorrect Answer , it was actually in 1215");
        }
        else if(Answer5==Option5D){
            System.out.println("\nIncorrect Answer , it was actually in 1215");
        }
        else{System.out.println("\nIncorrect Answer , it was actually in 1215");}

       }
    
    
    
    //DISPLAY RESULT
    
       System.out.println("\n\nYou got "+CorrectAnswers+" correct out of "+TotalQuestion);
    Input.close();
    
    }

}














