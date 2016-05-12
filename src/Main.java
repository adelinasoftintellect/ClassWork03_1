import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Въведете число: ");
		int a = in.nextInt();

		if (a < 0 && a % 2 == 0) {
			System.out.println("Отрицателно четно.");

		} else if (a < 0 && a % 2 == 1) {
			System.out.println("Отрицателно нечетно.");

		} else if (a > 0 && a % 2 == 0) {
			System.out.println("Положително четно.");

		} else if (a > 0 && a % 2 == 1) {
			System.out.println("Положително нечетно.");

		}else{
			System.out.println("Нула.");
		}

	}

}
