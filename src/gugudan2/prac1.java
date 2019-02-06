package gugudan2;

import java.util.Scanner;

public class prac1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int inputValue = scanner.nextInt();
		for (int i = 0; i < inputValue; i++) {
			for (int j = 0; j < inputValue; j++) {
				System.out.println((i + 1) * (j + 1));
			}
		}
	}
}
