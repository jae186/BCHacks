import java.util.Scanner;
public class mainFile {

	 
	public static void main(String[] args) {
	System.out.println("Hello and welcome to Choose Your Own Halloween Adventure, a real-time interactive story where you decide your path.\nThroughout this story "
			+ "you will be asked trivia questions about Halloween, answer incorrectly and you will suffer the consequences.\n"
			+ "(Press 0 to leave the game at anytime)\n");
	
	Scanner input = new Scanner(System.in);
	int choice = 1;
	int right = 0;
	
	while (choice != 0) {
		
    System.out.print("Enter your peasantly name: \n");
    String name = input.nextLine();

    
    System.out.printf("\nYou, %s, have chosen to have some fun this Halloween and explore the vacant house at the edge of town with your friends.\n", name);
    System.out.println("How do you want to go there?");
    System.out.println("1 By bike \n2 Using your friend's mom's car");
    System.out.println("Enter your choice (1 or 2): ");
    int choice1 = input.nextInt();
    
   
    choice1 = invalidanswer(choice1);
    
    if (choice1 == 0)
		 break;
    
    else if (choice1 == 1)  {
    	System.out.println("You have arrived at the derelict house. You leave your bikes leaning against the crooked "
    			+ "fence surrounding the house\n The sun is starting to set and long shadows give the place an eerie atmosphere. \n"
    			+ "You and your five friends are standing at the rusty gate that separates the house’s overgrown lawn \n"
    			+ "from the rest of the world.");
    }
    
    else
    	System.out.println("You have arrived at the derelict house. You park the car near the front gate.\n"
    			+"The sun is starting to set and long shadows give the place an eerie atmosphere. You and your five friends are\n"
    			+ " standing at the rusty gate that separates the house’s overgrown lawn from the rest of the world.");
    
    System.out.println("What do you do next?");
    System.out.println("1 Go home \n2 Step through the gate");
    
    System.out.println("Enter your choice (1 or 2): ");
    choice = input.nextInt();
    
    choice = invalidanswer(choice);
    
    if (choice == 0)
		 break;
    
    else if (choice == 1)  {
    	choice = 0;
    }
    
    else
    	System.out.println("\nYou start down the muddy path leading to the houses’ front door. The long grass lining the path tugs\n"
    			+ "at your clothes, like a shy child requesting your attention. The six of you move forward, ignoring the feeble\n"
    			+ "resistance nature seems to be putting up against you. You get to the house’s front door" + 
    			"");
    
    if (choice == 0)
		 break;
    
    System.out.println("What do you do?");
    System.out.println("1 Turn the doorknob \n2 Kick it in");
    
    System.out.println("Enter your choice (1 or 2): ");
    choice = input.nextInt();
    
    choice = invalidanswer(choice);
    
    if (choice == 0)
		 break;
    
    else if (choice == 1)  
    	System.out.println("You grab the brass doorknob, and turn it. The door opens with a creaking noise that brings a chill to your spine.");
    
    else
    	System.out.println("Tom, the jock of your group, looks at the others and declares: “We should kick the door in.“\n "
    			+ "Before anyone else can even get a word in, the old wooden door flies from its hinges and crashes onto the\n"
    			+ " dusty tiles that line the entrance");
    
    
    
    
    System.out.println("Cool, musty air greets you as you step inside. The hallway is dim, but you can make out some shapes even before \n"
    		+ "you turn your flashlights on. There are some broken-down chairs and other pieces of furniture, carelessly strewn around. \n"
    		+ "The only doors you can see are blocked by furniture, and only the stairway at the end of the hallway seems passable.");
    System.out.println("Where do you want to go?");
    System.out.println("1 Upstairs \n2 Downstairs");
    
    System.out.println("Enter your choice (1 or 2): ");
    choice = input.nextInt();
    
	if (choice == 0)
		 break;
    
    System.out.println("Your friend Jerry turns to you: “Hey, we should ask each other trivia questions!” \n"
    		+ "The others groan, but nobody wants to endure the dreary silence inside the house, so they reluctantly agree.\n"
    		+ "“I’ll start,” Jerry beams.");
    System.out.println("“What is the most commercially successful horror movie of all time?” \n"
    		+ "He asks, while you are making your way over the creaking stairway.");
    System.out.println("1 IT \n2 Friday the 13th");
    
    System.out.println("Enter your choice (1 or 2): ");
    choice = input.nextInt();
    
    choice = invalidanswer(choice);
    
    if (choice == 0)
		 break;
    
    else if (choice == 1)  {
    	right++;
    	System.out.println("“It’s IT! You were right!”");
    }
    
    else
    	System.out.println("“It’s IT! You were wrong!”");
    
    
    
    
    System.out.println("It has gotten considerably darker since you entered the house, and even though there are some windows \n"
    		+ "around there’s barely any light coming through them anymore, and the light of your flashlights is barely enough to \n"
    		+ "illuminate the long corridor you find yourself in now.");
    
    
    
    
    System.out.println("Tom pipes up, and announces: “I’ll ask another question! What is a fear of halloween called?“");
    System.out.println("1 Samhainophobia \n2 Phasmophobia");
    
    System.out.println("Enter your choice (1 or 2): ");
    choice = input.nextInt();
    
    choice = invalidanswer(choice);
    
    if (choice == 0)
		 break;
    
    else if (choice == 1) {
    	right++;
    
    	System.out.println("“It’s Phasmophobia! Oh wait, I got that mixed up… it’s Samhainophobia. \n"
    			+ "The other one is fear of...” Before he can finish, Jackson, who has been quiet so far, screams: “Ghost!” \n"
    			+ "Tom looks at him, surprised. “Yeah, fear of ghosts, how did you know that?” Jackson, quivering and barely able to get \n"
    			+ "out a word stutters: “N-n-no ghost, over there” You turn to see what he’s pointing at, and see something white, almost \n"
    			+ "translucent, move in front of one of the dirty windows.");

    }
    
    else
    	System.out.println("“It’s Phasmophobia! Oh wait, I got that mixed up… it’s Samhainophobia. \n"
    			+ "The other one is fear of...” Before he can finish, Jackson, who has been quiet so far, screams: “Ghost!” \n"
    			+ "Tom looks at him, surprised. “Yeah, fear of ghosts, how did you know that?” Jackson, quivering and barely able to get \n"
    			+ "out a word stutters: “N-n-no ghost, over there” You turn to see what he’s pointing at, and see something white, almost \n"
    			+ "translucent, move in front of one of the dirty windows.");
    
    
    
    
    
    System.out.println("What do you do?");
    System.out.println("1 Investigate \n2 Stumble back down the stairs");
    
    System.out.println("Enter your choice (1 or 2): ");
    choice = input.nextInt();
    
    choice = invalidanswer(choice);
    
    if (choice == 0)
		 break;
    
    else if (choice == 1)  
    	System.out.println("You move closer, Jerry asks: “H-hey guys, What famous magician died on Halloween?” You look at him in disbelief.\n"
    			+ "“What?” he mumbles. “Trivia helps me forget my fear, and that I’d rather be anywhere else right now. \n" + 
    			"");
    
    else {
    	System.out.println("All six of you stumble backwards at once, you trip over Jackson, and you all fall down the stairs and die.");
    	choice = 0;
    }
    
    if (choice == 0)
		 break;
    
    
    


    System.out.println("So what is your answer?");
    System.out.println("1 Harry Houdini  \n2 Lance Burton ");
    System.out.println("Enter your choice (1 or 2): ");
    
	choice = input.nextInt();
	choice = invalidanswer(choice);
	
	 if (choice == 0)
		 break;
	
	 else if(choice == 1)
	{
		right++;
		System.out.println("Jackson, you’re an idiot! Look guys it’s just a curtain!");
		
	}
	else {
	
	 System.out.println("You move closer to the white translucent thing gliding around near the window, and it suddenly turns around. \n"
				+ "The ghost is wearing chains and looking at you with piercing eyes. “It was meeeee! THE MIGHTY HARRY HOUDINI” it screeches."
				+ "\n"
				+ "“I died on halloween, and now you will too.“");
	 choice = 0;
	 
	}
	 
	if (choice == 0)
		 break;
    
    System.out.println("This is not as scary as I thought it was going to be… Maybe we should just go home.");
    System.out.println(	"Your friends nod and murmur in agreement");
    
    
	System.out.println("One last Question: Where is the world’s longest haunted house?");
	System.out.println("1 Melbourne  \n2 Ohio ");
	System.out.println("Enter your choice (1 or 2): ");
	choice = input.nextInt();
	choice = invalidanswer(choice);

	 if (choice == 0)
		 break;
	else if(choice == 1) {
	
	System.out.println("Yeah it’s Ohio, maybe we should go there sometime, this was lame. You make you way back downstairs, climb, and \n"
			+ "drive back home.");
	choice=0;
	}
	else {
		
	System.out.println("Nope. But that doesn't matter, it would probably still be better than this one, you say. \n"
			+ "Before you can even finish your thought, the ground begins spinning and you are transported through space and \n"
			+ "time to the Kew Lunatic Asylum in Melbourne");
	right++;
	choice=0;
    
		}
	}
	System.out.println("Boo-hoo you lose. Scaredy-cat.");
}
	
	
	
	public static int invalidanswer(int answer) {
		 Scanner input = new Scanner(System.in);
		
		 while(answer != 1 && answer != 2 && answer != 0) {
		    	System.out.println("THAT'S NOT A VALID ANSWER. Don't play smart, answer the question.");
		    	answer = input.nextInt();
		    }
		 return answer;
	}
	

}