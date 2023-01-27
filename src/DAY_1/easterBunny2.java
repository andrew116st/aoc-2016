package DAY_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;


public class easterBunny2 {
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
		
		HashSet<String> coords = new HashSet<String>();
		
		for (int i = 0; i < instructions.length; i++ ) {
		
			String instruction = instructions[i];
			
			int step = Integer.parseInt(instruction.substring(1));		// шаг
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
				
			for (int k =0; k < step; k++) {
				switch (route) {
		
					case 0:
						y++;
						break;
			
					case 90:
						x++;
						break;
			
					case 180:
						y--;
						break;
			
					case 270:
						x--;
						break;
			
					default:
						System.out.println("error route");
			
						return;
						
				}
				
				String coord = x + "  " + y;
				if (coords.contains(coord)) {
	
					int fullpath = Math.abs(x) + Math.abs(y);
	
					System.out.println(coord);
					System.out.println();
					System.out.println("Fullpath - " + fullpath);
					
					return;
				}
				
				coords.add(coord);
			}
		}
		
		
	}

}



