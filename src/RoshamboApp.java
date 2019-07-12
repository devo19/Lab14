import java.util.Scanner;

public class RoshamboApp {
	static Scanner scnr = new Scanner(System.in);

	public static void main(String[] args) {

		Player rockPlayer = new Rocky("Dwayne Johnson");
		Player randomPlayer = new Randrago();
		Player humanPlayer = new Consolo();
		boolean boo = true;
		String input;

		Roshambo r1;
		Roshambo r2 = rockPlayer.generateRoshambo();

		// System.out.println(r1+ " " + r2);
		System.out.println("Welcome to R/P/S Mayhem!\n");

		System.out.println("What is your name?");
		String name = scnr.nextLine();
		humanPlayer.setName(name);
		do {

			do {
				input = Validator.getString(scnr, "Enter rock,paper, or scissors\n");
				if (input.toLowerCase().startsWith("r") || input.toLowerCase().startsWith("p")
						|| input.toLowerCase().startsWith("s")) {
					boo = false;
				}
			} while (boo);
			r1 = humanPlayer.generateRoshambo(input);
			do {

				// System.out.println("Enter rock, paper or scissors");
				input = Validator.getString(scnr, "Would you like to play agaisnt, Rocky or Rando?");
				if (input.equalsIgnoreCase("rocky")) {
					r2 = rockPlayer.generateRoshambo();
					boo = false;
				} else if (input.equalsIgnoreCase("rando")) {
					r2 = randomPlayer.generateRoshambo();
					boo = false;
				} else {
					System.out.println("Sorry! Try Rocky or Rambo");
					boo = true;

				}
			} while (boo);
			System.out.println(getWinner(r1, r2));

			System.out.println("Continue? (y/n)");
			input = scnr.nextLine();
		} while (input.equalsIgnoreCase("y"));

		System.out.println("Goodbye!");
		scnr.close();
	}

	public static String getWinner(Roshambo r1, Roshambo r2) {

		if (r1.equals(Roshambo.ROCK) && r2.equals(Roshambo.SCISSORS)
				|| r1.equals(Roshambo.SCISSORS) && r2.equals(Roshambo.PAPER)
				|| r1.equals(Roshambo.PAPER) && r2.equals(Roshambo.ROCK)) {
			return "You Win!";

		} else if (r1.equals(r2)) {
			return ("It's a tie!");
		} else {
			return "You Lose.";
		}

	}
}
