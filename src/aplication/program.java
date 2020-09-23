package aplication;

import boardgame.Board;
import chess.ChessMatch;


public class program {
    public static void main(String[]agrs){
       ChessMatch chessMatch = new ChessMatch();
       UI.printBoard(chessMatch.getPices());
    }
    
}
