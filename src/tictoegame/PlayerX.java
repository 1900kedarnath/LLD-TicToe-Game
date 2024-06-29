package tictoegame;

public class PlayerX extends PlayerSymbol{

	
	GameSymbol gameSymbol;
	
	
	
	
	PlayerX(){
		
		super(GameSymbol.X);
	}







	public GameSymbol getGameSymbol() {
		return gameSymbol;
	}




	public void setGameSymbol(GameSymbol gameSymbol) {
		this.gameSymbol = gameSymbol;
	}
	
	
	
}
