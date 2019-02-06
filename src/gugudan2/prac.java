package gugudan2;

import java.util.Scanner;

public class prac {
	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		String inputValue = scanner.nextLine();
		String[] splitedValue = inputValue.split(",");
		int first = Integer.parseInt(splitedValue[0]);
		int second = Integer.parseInt(splitedValue[1]);
	
		for (int i = 0; i < first; i++) {
			for (int j = 0; j < second; j++) {
				System.out.println((i + 1)*(j + 1));
			}
		}
	}
}
