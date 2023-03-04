import java.util.Scanner;

public class CandySellingSoftware {
    public static void main(String[] args) {
        System.out.print("\n\n\n\n\n3. ");
        Scanner CandySelling = new Scanner(System.in);
       //name 
        System.out.println("Hi What is your Full Name?\n ");
        String name = CandySelling.nextLine();
        System.out.println("\nHello "+name);
        
        //menu 
        
        System.out.println("\nWe sell:\n   Twix Bars for $1.25  each.\n   Bazooka Bubble Gum for $0.88 each.\n   Twizzlers Licorice for $1.50 per package");
        
        //Prices
        double TwixBarPrice = 1.25;
        double BazookaBubbleGumPrice = 0.88; 
        double TwizzlersLicoricePrice = 1.50; 
    
        //default quantity of items set to 0
        int NumberofTwixBars=0;
        int NumberofBazookaBubbleGum=0;
        int NumberofTwizzlersLicorice=0;
      
        //Twix Bars 
        System.out.println("\nDo You want Any Twix Bars? yes or no ");
        String DoYouWantTwixBars = CandySelling.nextLine();
        switch (DoYouWantTwixBars) {
          case "yes" : System.out.println("\nGreat How may do  want those?");
             NumberofTwixBars = CandySelling.nextInt();
    
          case "no" : System.out.println("Alright");
          
            break;
        }
    
        //Bazooka Bubble Gum 
        System.out.println("\nDo you want any Bazooka Bubble Gum? yes or no");
         CandySelling.nextLine();
        String DoYouWantBazookaBubbleGum = CandySelling.nextLine();
        switch (DoYouWantBazookaBubbleGum) {
          case "yes" :  System.out.println("\nGreat! How many DO You Want Those? ");
           NumberofBazookaBubbleGum = CandySelling.nextInt();
          CandySelling.nextLine();
          case "no" : System.out.println("Alright we have one more option ");
          
            break;
            }
    
    
        //Twizzlers 
        System.out.println("\nDo you want any Twizzlers Licorice? yes or no");
        String DoYouWantTwizzlersLicorice = CandySelling.nextLine();
        switch (DoYouWantTwizzlersLicorice) {
          case "yes" :  System.out.println("Great! How many DO You Want Those? ");
           NumberofTwizzlersLicorice = CandySelling.nextInt();
          CandySelling.nextLine();
          
          case "no" : System.out.println("Alright");
          
            break;
          
        }
    
    
        //Shipping adress
        System.out.println("\nPlease Enter Your Shipping Address ");
        String ShippingAddress = CandySelling.nextLine();
        System.out.println("\nPlease Enter Your Email Address ");
        String Email = CandySelling.nextLine();
    
        //discount reveal 
        System.out.println("\n We are currently having a 10 % discount on our orders! :)  ");
    
        //fancy
        for( int i =0; i<=30; i++)
      System.out.print("...........");
      System.out.print("   GENERATING INVOICE  ");
      for ( int i= 0; i<=30; i++)
      System.out.print("...........");
    
        //Calculating Totals
        double TwixBarPrice2 = NumberofTwixBars*TwixBarPrice;
        double BazookaBubbleGumPrice2 = NumberofBazookaBubbleGum*BazookaBubbleGumPrice;
        double TwizzlersLicoricePrice2 = NumberofTwizzlersLicorice*TwizzlersLicoricePrice;
        double Total= TwixBarPrice2+BazookaBubbleGumPrice2+TwizzlersLicoricePrice2;
    
        //Applying Discount
        double Total2 = Total-Total*0.1;
        
        //Applying HST
        double Total3 = Total2*0.13+Total2;
        
        //printing INVOICE
        System.out.println("-----------------------------------------------");
        System.out.println("|CUSTOMER INFORMATION");
        System.out.println("|\n|Name : "+name);
        System.out.println("|Email : "+Email);
        System.out.println("|Shipping Address : "+ShippingAddress);
        System.out.println("|\n|\n|Seller Information");
        System.out.println("|Name : Ms. Twist");
        System.out.println("|Store Information : Candy.com");
        System.out.println("|\n|\n|ORDER INFORMATION");
        System.out.println("|Number and Price of Twix Bars : "+NumberofTwixBars+"*"+TwixBarPrice+" = $"+ TwixBarPrice2);
        System.out.println("|Number and Price of Bazooka Bubble Gum :  "+NumberofBazookaBubbleGum+"*"+BazookaBubbleGumPrice+" = $"+BazookaBubbleGumPrice2);
        System.out.println("|Number and price of Twizzlers Licorice :  "+NumberofTwizzlersLicorice+"*"+TwizzlersLicoricePrice+"  = "+"$"+TwizzlersLicoricePrice2);
    
    
        
        System.out.println("|\n|Total before Discount : "+Total);
        System.out.println("|Discount : 10% ");
        System.out.println("|Total after Discount $"+Total2);
        System.out.println("|\n|HST = 13%");
        System.out.println("|Total after HST : "+Total3);
        System.out.println("-----------------------------------------------");
        for ( int i= 0; i<=30; i++)
      System.out.print("...........");
    
    
    
        
        
        
        
    
    }
}