public class TheMotivator { 

public void feedback(int score) { 

if (score == 100) 

System.out.println("You're great"); 

else if (score > 90) 

System.out.println("That's amazing"); 

else if (score > 65) 

System.out.println("That's nice "); 

else if (score > 50) 

system.out.println("Sorry, I don't know what to say?")

else

system.out.println(" I don't have any words for you, I will say you something")

} 

public static void main(String[] args) { 

TheMotivator tm = new TheMotivator(); 

tm.feedback(60);

}

}
