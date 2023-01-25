package DAY_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.lang.*;

public class easterBunny {
	
	public static void main(String[] args) throws FileNotFoundException {

		File file = new File("bunny_road");

		Scanner sc = new Scanner(file);

		String line = sc.nextLine();

		
		String[] numbers = line.split(", ");
		

		sc.close();

		
		System.out.println(Arrays.toString(numbers));
	}

	
}


