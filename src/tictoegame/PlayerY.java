package tictoegame;

public class PlayerY extends PlayerSymbol{

	String playerName;
	GameSymbol gameSymbol;
	
	
	PlayerY(){
		super(GameSymbol.O);
	}


	public String getPlayerName() {
		return playerName;
	}


	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}


	public GameSymbol getGameSymbol() {
		return gameSymbol;
	}


	public void setGameSymbol(GameSymbol gameSymbol) {
		this.gameSymbol = gameSymbol;
	}
	
	
}
