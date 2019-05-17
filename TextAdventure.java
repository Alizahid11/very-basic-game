package assessment;

import java.util.Scanner;



public class TextAdventure {

	


	public static void main(String[]abc) {

		Scanner c = new Scanner(System.in);
		boolean learntolook;
		
		System.out.println("you are in the middle of .....");
		learntolook = true;


	do {
		System.out.println("Write 'start': ");
		String test = c.nextLine();
		if (test.equals("start")) {
			learntolook = true;
		}else {
			System.out.println("try again!");
		}
	} while (learntolook==false);
	System.out.println(" you are in trouble ");
	System.out.println(" you hava a device with coordinates in your wrist, your goal is at 0.0. you can find your current position by typing pos, and you move around by typing 'n,s,e,w");
	System.out.println(" get your current position");
		
	
	int EastWestCoordinate = 5;
	int NorthSouthCoordinate=-5;


do {
	System.out.println("Do something:");
	String input = c.nextLine();
	if (input.equals("pos")) {
		System.out.println("East/West:" + EastWestCoordinate + ", " + "North/South: " + NorthSouthCoordinate +" ");
	}
	else if (input.equals("w")) {
		System.out.println("you walked west for 1 meter");
		EastWestCoordinate--;
	}
	else if (input.equals("e")) {
		System.out.println("you walked east for 1 meter");
		EastWestCoordinate--;
	}
	else if (input.equals("n")) {
		System.out.println("you walked north for 1 meter");
		NorthSouthCoordinate++;
	}
	else if(input.equals("s")) {
		System.out.println("you walked south for 1 meter");
		NorthSouthCoordinate++;
	}
} while(!(EastWestCoordinate == 0 && NorthSouthCoordinate== 0));

System.out.println("you found a box");
System.out.println("...............");
boolean action = false;
}

}
