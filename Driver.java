package hwassignment6csc250;

import java.util.Scanner;

public class Driver
{
	   public static void main(String[] args) 
	   {
		      Scanner scnr = new Scanner(System.in);
		      int [] jersey = new int [5];
		      int [] rating = new int [5];
		      int runner = 0;
		      
		      				// get initial jersey and rating inputs
		      System.out.println("Enter player 1's jersey number: ");
		      jersey[0] = scnr.nextInt();
		      System.out.println("Enter player 1's rating: ");
		      rating[0] = scnr.nextInt();
		      System.out.println("Enter player 2's jersey number: ");
		      jersey[1] = scnr.nextInt();
		      System.out.println("Enter player 2's rating: ");
		      rating[1] = scnr.nextInt();
		      System.out.println("Enter player 3's jersey number: ");
		      jersey[2] = scnr.nextInt();
		      System.out.println("Enter player 3's rating: ");
		      rating[2] = scnr.nextInt();
		      System.out.println("Enter player 4's jersey number: ");
		      jersey[3] = scnr.nextInt();
		      System.out.println("Enter player 4's rating: ");
		      rating[3] = scnr.nextInt();
		      System.out.println("Enter player 5's jersey number: ");
		      jersey[4] = scnr.nextInt();
		      System.out.println("Enter player 5's rating: ");
		      rating[4] = scnr.nextInt();
		      System.out.println("");
		      
		      				// print out initial jersey and rating inputs
		      System.out.println("ROSTER");
		      System.out.println("Player 1 -- Jersey number:" + jersey[0] + "Rating:" + rating[0]);
		      System.out.println("Player 2 -- Jersey number:" + jersey[1] + "Rating:" + rating[1]);
		      System.out.println("Player 3 -- Jersey number:" + jersey[2] + "Rating:" + rating[2]);
		      System.out.println("Player 4 -- Jersey number:" + jersey[3] + "Rating:" + rating[3]);
		      System.out.println("Player 5 -- Jersey number:" + jersey[4] + "Rating:" + rating[4]);
		      System.out.println("");
		      
		      				// print out menu options
		      System.out.println("MENU");
		      System.out.println("u - Update player rating");
		      System.out.println("a - Output players above a rating");
		      System.out.println("r - Replace player");
		      System.out.println("o - Output roster");
		      System.out.println("q - Quit");
		      System.out.println("Choose an option: ");
		      String s = scnr.next();

		      				// react to the menu options
		      while (runner < 1)
		      {
		      char a = s.charAt(0);
		      int b = charToInt(a);
		      if (b < 1) // 0 = u, only 0 is a legal position less than 1
		      		{
		    	  System.out.println("Enter a Jersey Number: ");
		    	  int temp = scnr.nextInt();
		    	  System.out.println("Enter a new rating for the player");
		    	  if (temp == jersey[0])
		    	  {rating[0] = scnr.nextInt();}
		    	  if (temp == jersey[1])
		    	  {rating[1] = scnr.nextInt();}
		    	  if (temp == jersey[2])
		    	  {rating[2] = scnr.nextInt();}
		    	  if (temp == jersey[3])
		    	  {rating[3] = scnr.nextInt();}
		    	  if (temp == jersey[4])
		    	  {rating[4] = scnr.nextInt();}
		    	  s = scnr.next();
		      		}
		      else if (b < 2) // 1 = a, only 1 is a legal position less than 2 but not 0
		      		{
		    	  System.out.println("Enter a rating: ");
		    	  int aboveRating = scnr.nextInt();
		    	  System.out.println("ABOVE " + aboveRating);
		    	  if (rating[0] > aboveRating)
		    	  {System.out.println("Player 1 -- Jersey number: " + jersey[0] + " Rating: " + rating[0]);}
		    	  if (rating[1] > aboveRating)
		    	  {System.out.println("Player 1 -- Jersey number: " + jersey[1] + " Rating: " + rating[1]);}
		    	  if (rating[2] > aboveRating)
		    	  {System.out.println("Player 1 -- Jersey number: " + jersey[2] + " Rating: " + rating[2]);}
		    	  if (rating[3] > aboveRating)
		    	  {System.out.println("Player 1 -- Jersey number: " + jersey[3] + " Rating: " + rating[3]);}
		    	  if (rating[4] > aboveRating)
		    	  {System.out.println("Player 1 -- Jersey number: " + jersey[4] + " Rating: " + rating[4]);}
		    	  s = scnr.next();
		      		}
		      else if (b < 3) // 2 = r
		      		{
		    	  System.out.println("Enter a Jersey Number: ");
		    	  int temp = scnr.nextInt();
		    	  System.out.println("Enter a new number for the player");
		    	  if (temp == jersey[0])
		    	  {jersey[0] = scnr.nextInt();}
		    	  if (temp == jersey[1])
		    	  {jersey[1] = scnr.nextInt();}
		    	  if (temp == jersey[2])
		    	  {jersey[2] = scnr.nextInt();}
		    	  if (temp == jersey[3])
		    	  {jersey[3] = scnr.nextInt();}
		    	  if (temp == jersey[4])
		    	  {jersey[4] = scnr.nextInt();}
		    	  System.out.println("Enter a new rating for the player");
		    	  if (temp == jersey[0])
		    	  {rating[0] = scnr.nextInt();}
		    	  if (temp == jersey[1])
		    	  {rating[1] = scnr.nextInt();}
		    	  if (temp == jersey[2])
		    	  {rating[2] = scnr.nextInt();}
		    	  if (temp == jersey[3])
		    	  {rating[3] = scnr.nextInt();}
		    	  if (temp == jersey[4])
		    	  {rating[4] = scnr.nextInt();}
		    	  
		    	  s = scnr.next();
		      		}
		      else if (b < 4) // 3 = o
		      		{
		    	  System.out.println("ROSTER");
			      System.out.println("Player 1 -- Jersey number: " + jersey[0] + " Rating: " + rating[0]);
			      System.out.println("Player 2 -- Jersey number: " + jersey[1] + " Rating: " + rating[1]);
			      System.out.println("Player 3 -- Jersey number: " + jersey[2] + " Rating: " + rating[2]);
			      System.out.println("Player 4 -- Jersey number: " + jersey[3] + " Rating: " + rating[3]);
			      System.out.println("Player 5 -- Jersey number: " + jersey[4] + " Rating: " + rating[4]);
			      System.out.println("");
			      
			      s = scnr.next();
		      		}
		      else if (b < 5) // 4 = q
		      		{
		    	  runner = 3;
		      		}
		      }
		      //System.out.println("Congratulations! You have left the loop");

	   }
	   static int charToInt(char c)
		{
			return "uaroq".indexOf(c);
		}
}
