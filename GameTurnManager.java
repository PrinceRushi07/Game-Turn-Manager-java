
import java.util.*;



public class GameTurnManager{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque<String> player=new ArrayDeque<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number Of Player: ");
		int count=Integer.parseInt(sc.nextLine());
		for(int i=0;i<count;i++) {
			System.out.println("Enter Player No.: "+i+" Name: ");
			String name=sc.nextLine();
			player.add(name);
		}
		while(true) {
			System.out.println("Welcome to game turn manager!");
			System.out.println("1. Show current Player");
			System.out.println("2. Next Turn");
			System.out.println("3. Skip current Player");
			System.out.println("4. Add player at end");
			System.out.println("5. Remove Player");
			System.out.println("6. Show All Players");
			System.out.println("7. Exit");
			
			System.out.println("Enter Your choice: ");
			int ch=sc.nextInt();
			sc.nextLine();
			
			switch(ch) {
			case 1: 
				if(player.isEmpty()) {
					System.out.println("No Player Is Found!");
				}else {
					System.out.println("Current Player: "+player.peekFirst());
					
				}
				break;
				
			case 2:
				if(!player.isEmpty()) {
					String curr=player.pollFirst();
					player.addLast(curr);
					System.out.println(curr+" has played! next player...");
				}else {
					System.out.println("No Player to Play");
				}
				break;
				
			case 3:
				if(!player.isEmpty()) {
					String skip=player.pollFirst();
					player.addLast(skip);
					System.out.println(skip+" is skipped!");
				}else {
					System.out.println("No Player to skip!");
				}
				break;
				
			case 4:
				
				System.out.println("Enter New player name: ");
				String newp=sc.nextLine();
				player.addLast(newp);
				System.out.println(newp+" is added successfully!");
				break;
				
			case 5:
				System.out.println("Enter Player name to remove: ");
				String rem=sc.nextLine();
				if(player.remove(rem)) {
					System.out.println(rem+" has been removed!");
				}else {
					System.out.println("Invalid Player Name ");
				}
				break;
				
			case 6:
				if(!player.isEmpty()) {
					System.out.println("All players: "+player);
				}else {
					System.out.println("No Player available to display!");
				}
				break;	
			case 7:
				System.out.println("Exiting the program!");
				break;
				
			default:
				System.out.println("invalid choice!");
			}
		
		}
	}

}