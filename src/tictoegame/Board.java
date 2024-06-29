package tictoegame;

import java.util.ArrayList;
import java.util.List;

public class Board {

	int boardSize ;
	 GameSymbol [][] boardMatrix;
	
	Board(int size){
		this.boardSize=size;
		this.boardMatrix=new GameSymbol[boardSize][boardSize] ;
	}
	
	
	
	public boolean addSymbol(int row,int colum, PlayerSymbol playerSymbol) {
		
		if(boardMatrix[row][colum]!=null)
			return false;
				boardMatrix[row][colum]=playerSymbol.symbolType;
				
		return true;
		
		
	}
	
	
	public List<Pair> getFreeCell(){
		
		List<Pair> freeCell=new ArrayList<>();
		
		
		for(int i=0;i<boardSize;i++) {
			for(int j=0;j<boardSize;j++) {
				
				if(boardMatrix[i][j]==null) {
					
					freeCell.add(new Pair(i,j));
				}
			}
		}
		
		return freeCell ;
	}
	
	public void printBoard() {
		
		
		for(int i=0;i<boardSize;i++) {
			
			for(int j=0;j<boardSize;j++) {
				
				System.out.print(boardMatrix[i][j]+" | ");
				
				
			}
			System.out.println();
			
			
		}
		
		
		
		
		
	}
	
}
