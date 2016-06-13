import java.util.Scanner;

public class Adventure {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean flag = true;
		
		System.out.println("Welcome to The Tree! Keebler the Elf is missing his cookies. Your job is to help him"
				+ " explore the forest to find them. Do you accept this mission ? (y/n)");
		String mission = scan.nextLine();
		
		System.out.println("Tell us your name: ");
		String name = scan.nextLine();
		
		if(mission.equalsIgnoreCase("y")){
			
			System.out.print("Great," + name + "! First we have to cross the moat. But oh no! There's the gang "
					+ " of fairies! Do you want to fight them with a sword or fire? ");
			String weapon = scan.nextLine();
			
			if(weapon.equalsIgnoreCase("Sword")){
				System.out.print("You pull the sword out of your holster and slay the fairies! Now that"
						+ " we've made it across the moat. Where would you like to look," + name "? Under a mushroom"
						+ " or behind the rocks? (type muchroom/rocks) ");
				String location = scan.nextLine();
				
				if(location.equalsIgnoreCase("mushroom")){
					System.out.print("The cookies are not under the mushroom. The mushroom poisoned you."
							+ " You lose. ");
					flag = false;
				}
				else if(location.equalsIgnoreCase("rocks")){
					System.out.print("There's no cookies behind these rocks, but there's dog footprints. Should we follow"
							+ " the dog tracks? (y/n) ");
					
					String tracks = scan.nextLine();
					
					if(tracks.equalsIgnoreCase("y")){
						System.out.print("We follow the path and see a spotted dog. It's Scooby Doo eating"
								+ " the cookies! You win! "); 
						flag = false;
					}
					else if(tracks.equalsIgnoreCase("n")){
						
						System.out.print("That's a silly choice. You were almost there! See ya. ");
						flag = false;
						
					}
					
				}
				
			}
			else if(weapon.equalsIgnoreCase("Fire")){
				System.out.print("You take out your lighter and can of hairspray...the fairies fight back."
						+ " You lose.");
				System.out.println("Try again!");
				flag = false;
			}
			
		}
		else{
			
			System.out.print("You are lame.");
			flag = false;
		}
		
		
		
		
		
		

	}

}
