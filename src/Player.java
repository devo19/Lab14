public abstract class Player {

	private String name;

	public abstract Roshambo generateRoshambo();

	public Player() {
       
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	
	}

	public Player(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Player [name=" + name + "]";
	}

	public Roshambo generateRoshambo(String input) {
		// TODO Auto-generated method stub
		return null;
	}

}
