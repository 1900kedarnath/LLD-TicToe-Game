package tictoegame;

public class Player {

	String playerName;
	PlayerSymbol playerSymbol;
	
	Player(String name,PlayerSymbol playerSymbol){
		this.playerName=name;
		this. playerSymbol= playerSymbol;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public PlayerSymbol getPlayerSymbol() {
		return playerSymbol;
	}

	public void setPlayerSymbol(PlayerSymbol playerSymbol) {
		this.playerSymbol = playerSymbol;
	}
	
	
	
	
}
