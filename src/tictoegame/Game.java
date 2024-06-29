package tictoegame;



import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Game{


 Queue<Player> players=new LinkedList<>();
public Board board;

Game(){
	initilizeGame() ;
}


public void initilizeGame() {

	
	
	PlayerX playerx=new PlayerX();
	Player player1=new Player("PlayerX",playerx);
	
	PlayerY playero=new PlayerY();
	Player player2=new Player("PlayerY",playero);
	
	players.offer(player1);
	players.offer(player2) ;
	
	board=new Board(4);
	
}
	

 public String startGame(){
	 
	 boolean noWinner=true;
	 
	 while(noWinner) {
		 
		Player playerTurn=players.poll() ;
		board.printBoard();
		List<Pair> freeCell= board.getFreeCell() ;
		 
		 if(freeCell.isEmpty()) {
			 noWinner=false;
			continue; 
		 }
		 
		 System.out.println("Player Turn"+" "+playerTurn.playerName+ " ");
		 
		 Scanner sc=new Scanner(System.in);
		 
		 String input1=sc.nextLine();
		String []input=input1.split(",");
		 int row=Integer.valueOf(input[0]);
		 int col=Integer.valueOf(input[1]);
		 
		boolean symbolAddedSuccessfully= board.addSymbol(row, col, playerTurn.playerSymbol);
		 
		if(!symbolAddedSuccessfully) {
			System.out.println("Incorrect Position choosen"+" Try Again");
			players.offer(playerTurn);
			Player p=players.poll();
			players.offer(p);
			continue;
			
		}
		
		players.offer(playerTurn);
		
		boolean winner=isThereWinner( row, col,playerTurn.playerSymbol.symbolType);
		if(winner)
			return playerTurn.playerName;
		 
	 }
	 
	 return "Game Tied" ;
 }
	
public boolean isThereWinner(int row,int col,GameSymbol playerSymbol) {
	
	
	  boolean rowResult=true;
	  boolean colResult=true;
	  boolean digResult=true;
	  boolean nextdigResult=true;
	  
	
	
	  for(int i=0;i<board.boardSize;i++) {
		  
		  if(board.boardMatrix[row][i]==null || board.boardMatrix[row][i]!=playerSymbol)
			  rowResult=false;
		  
		  
	  }
	  
        for(int i=0;i<board.boardSize;i++) {
		  
		  if(board.boardMatrix[i][col]==null || board.boardMatrix[i][col]!=playerSymbol)
			  colResult= false;
		  
		  
	  }
        
        for(int i=0,j=0;i<board.boardSize;i++,j++) {
  		  
  		  if(board.boardMatrix[j][i]==null || board.boardMatrix[j][i]!=playerSymbol)
  			digResult= false;
  		  
  		  
  	  }  
	
        for(int i=board.boardSize-1,j=0;i>=0 && j<board.boardSize;i--,j++) {
    		  
    		  if(board.boardMatrix[i][j]==null || board.boardMatrix[i][j]!=playerSymbol)
    			  nextdigResult= false;
    		  
    		  
    	  }
	
	
	return  rowResult||colResult||digResult||nextdigResult;
}
 
 
 
}
