package DAY_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class easterBunny {
	public static void main(String[] args) throws FileNotFoundException {

		File file = new File("bunny_road");

		Scanner sc = new Scanner(file);

		String line = sc.nextLine();

		String[] instructions = line.split(", ");

		sc.close();

		System.out.println(Arrays.toString(instructions));
		
		
		int x = 0; 			// right
		int y = 0; 			// left
		int route = 0;		// route
		
		
		
		for (int i = 0; i < instructions.length; i++ ) {
		
			String instruction = instructions[i];
			
			int step = Integer.parseInt(instruction.substring(1));		
			char turn = instruction.charAt(0);
	
			switch (turn) {
				case 'R':
		
					route = route + 90;
					break;
		
				case 'L':
		
					route = route - 90;
					break;
		
				default:
					System.out.println("error turn");
					return;
			}
			
			if (route >= 360) {
				route = route - 360;
				
			} else if (route < 0) {
				route = route + 360;
				
			}
				
			
			switch (route) {
	
				case 0:
					y = y + step;
					break;
		
				case 90:
					x = x + step;
					break;
		
				case 180:
					y = y - step;
					break;
		
				case 270:
					x = x - step;
					break;
		
				default:
					System.out.println("error route");
		
					return;
		
			}

		}
		
		int fullpath = Math.abs(x) + Math.abs(y);
				
		System.out.println(x + "  "  +  y);
		System.out.println();
		System.out.println("Fullpath - " + fullpath);
	}

}



