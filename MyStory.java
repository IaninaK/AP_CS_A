import java.util.Scanner;

public class MyStory
{
   public static void main(String[] arg)
   {
      /*
       *The Scanner class is used for reading in data to your program. */

      Scanner keyboard = new Scanner(System.in);
      
      //Copy and paste this code when you want the user to make a decision
      //By selecting a number
      System.out.println("You wake up on a cold, rough asphalt of an empty parking lot. It looks to be about six thirty in the evening. You would be able to see the sunset if it weren't for the thick smog: lightly highlighted by a reddish hue. The lights are on, surprisingly, although very dim. Unrecognizable to your eyes, the place seems to have a vague smell of danger about it.");
      System.out.println("Deciding on what to do next, you notice a concrete building on the far edge of the small lot, as well as a path going into the gray field ahead. Or, you could just stay and wait in the parking lot.");
      System.out.print("Which of the three options will you choose?: ");
      int choice = keyboard.nextInt();
   
      //Write your code below:
      if(choice == 1) //abandoned building
      {
         System.out.println("Mindlessly, you wander close to the building. The door is almost invitingly light, and you are welcomed by a high frequency sound that is surprisingly soft to your ears. It even makes you kind of sleepy");
         System.out.println("Give in to the noise or struggle?(1 or 2): ");
         choice = keyboard.nextInt();
         if(choice==1)
         {
			System.out.println("Your body drifts down to the dusty concrete, right in front of the door. The whisps of light lull you to sleep, whispering promises of peace and tranquility.");
			// System.out.println("The world fades around you.") this line will be placed at the end of the code
		 }
         else
         {
			System.out.println("Feeling rebellious, you try to shake off the calming feeling and try to push the door to leave. You are unsuccessful, as it about as hard to push the door open as it would be a nearby wall. Exausted, you lean onto the warm surface of the door, and start to drift off despite your struggles.");

		 }

      }
      else if(choice == 2) //field
      {
         System.out.println("Not trusting anything manmade, you make your way to the path into the field. After walking through the pompas grass for what seems like eternity, you hear a noise below you.");
         System.out.println("It turns out to be a hare, with dimly white cotton-y fur and cloudy ash green eyes.");
         System.out.println("Pet the hare? (1 - yes, 2 - no)");
         choice = keyboard.nextInt();
		 if(choice == 1)
		 {
			System.out.println("The fur is soft and smells like fresh lint. Thoughtful, the hare looks into your eyes with it's green ones and you start to feel sleepy. You feel yourself drop on the ground, shaking off the dew from nearby grass leaves with a clear trinkling sound.");
		 }
		 if(choice == 2)
		 {
			System.out.println("Unamused, the hare turns away from you. Taking a step back, you fall into what seems like an excessively deep rabbit hole...");
		 }

      }
      else //parking lot
      {
		System.out.println("Unsure of your surroundings, you decided to just wait in the parking lot. With a strange tranquility, you imagine the sun going down below the thick fog, and watch your environment get darker. A singular fish flies by, and you wonder why. You thought fish could only appear on this place around summer, and it was somewhat clear that it was fall.");
	  	System.out.println("As it gets darker, you feel yourself getting sleepy. Before you have the chance to ask yourself how if you got to a parking lot if you didn't have a car...");
	  }
	  System.out.println("the world  fades   around     you    .      .      .");
   }
}
