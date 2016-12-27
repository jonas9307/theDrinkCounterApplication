
public class Player {

    static int numberOfPlayers = 0;
	int id = 0;
	int numberOfDrinks;
	String name;
	
	
	Player(){
		numberOfPlayers++;
		id = numberOfPlayers;
	}
	
	public static int getNumberOfPlayers() {
		return numberOfPlayers;
	}

	public static void setNumberOfPlayers(int numberOfPlayers) {
		Player.numberOfPlayers = numberOfPlayers;
	}

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getNumberOfDrinks() {
		return numberOfDrinks;
	}


	public void setNumberOfDrinks(int numberOfDrinks) {
		this.numberOfDrinks = numberOfDrinks;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	

}


