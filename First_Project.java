import java.io.*;
import java.util.*;
class First_Project
{
   public static void main(String args[])
   {
	   int enter;
	   
      System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.");
	  System.out.println("LET'S PLAY A GAME");
	  System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.");
	  
	  Scanner sc=new Scanner (System.in);
	  System.out.println("Press ONE");
	  enter=sc.nextInt();
	  if(enter!=1)
	  {
		  System.out.println("INVALID NUMBER .PLEASE ENTER ONE");
		   enter=sc.nextInt();
	  }
	  System.out.println("----------:ABOUT THE GAME:---------- \n 1] THIS GAME IS ALL ABOUT IMAGINATION . \n 2] YOU HAVE TO IMAGINE AND CALCULATE BY YOUR OWN . \n 3] AFTER ALL THE CALCULATION I WILL GUESS YOUR FINAL ANSWER.");
	  System.out.println("#############################");
	  System.out.println("#         LET'S START       #");
	  System.out.println("#############################");
	  System.out.println("ENTER TWO TO GET START");
	  enter=sc.nextInt();
	  if(enter!=2)
	  {
		  System.out.println("INVALID NUMBER .PLEASE ENTER TWO");
		   enter=sc.nextInt();
	  }
	  System.out.println("ENTER THREE AFTER EACH INSTRUCTION.");
	  enter=sc.nextInt();
	  if(enter!=3)
	  {
		  System.out.println("INVALID NUMBER .PLEASE ENTER THREE");
		   enter=sc.nextInt();
	  }
	  System.out.println("IMAGINE  ANY ONE NUMBER IN YOUR MIND.\n (TIP:-take small number so that your calculation will become easy for you)");
	  enter=sc.nextInt();
	  if(enter!=3)
	  {
		  System.out.println("INVALID NUMBER .PLEASE ENTER THREE");
		   enter=sc.nextInt();
	  }
	  System.out.println("NOW, \n ADD THE SAME NUMBER FOR YOUR FRIEND IN YOUR NUMBER ");
	  enter=sc.nextInt();
	  if(enter!=3)
	  {
		  System.out.println("INVALID NUMBER .PLEASE ENTER THREE");
		   enter=sc.nextInt();
	  }
	  int any;
	  System.out.println("NOW, \n ADD ANY NUMBER IN IT.");
	  System.out.println("ENTER THAT NUMBER WHICH YOU HAVE TAKEN FOR ADDING. \n (TIP: do not forget to enter three after entering the number.)");
	  
	  any=sc.nextInt();
	  double ans=any/2;
	  if(enter!=3)
	  {
		  System.out.println("INVALID NUMBER .PLEASE ENTER THREE");
		   enter=sc.nextInt();
	  }
	  System.out.println("NOW ,\n MAKE HALF OF THE SUM YOU HAVE CALCULATED");
	  enter=sc.nextInt();
	  if(enter!=3)
	  {
		  System.out.println("INVALID NUMBER .PLEASE ENTER THREE");
		   enter=sc.nextInt();
	  }
	  System.out.println("NOW, SUBTRACT YOUR FRIEND'S NUMBER FROM THE  QUOTIENT.");
	  enter=sc.nextInt();
	  if(enter!=3)
	  {
		  System.out.println("INVALID NUMBER .PLEASE ENTER THREE");
		   enter=sc.nextInt();
	  }
	  System.out.println("CONGRATULATIONS TO ME BECAUSE I HAVE GUESSED YOUR ANSWER");
	  System.out.println("AGAIN AND LASTLY ENTER FOUR TO KNOW YOUR ANSWER");
	  enter=sc.nextInt();
	  if(enter!=4)
	  {
		  System.out.println("INVALID NUMBER .PLEASE ENTER FOUR.");
		   enter=sc.nextInt();
	  }
	  System.out.println("OKAY,\n  SO...........YOUR ANSWER IS    "+ans);
	   System.out.println("#############################");
	  System.out.println("#         GAME END       #");
	  System.out.println("#############################");
	  
	  System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.");
	  System.out.println("THANKS FOR PLAYING THIS GAME");
	  System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.--.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.");
	  
   }
}