
public class Randrago extends Player {
	
	public Randrago(String name) {
		super(name);
	}
	
	public Randrago() {
		super();
	}

	@Override
	public Roshambo generateRoshambo() {

		int random = (int)(Math.random() * 3 + 1);		

		if (random == 1) {
			return Roshambo.ROCK;
		} else if (random == 2) {
			return Roshambo.SCISSORS;
		} else {
			return Roshambo.PAPER;
		}

	}

}
