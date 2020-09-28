package aplication;

import boardgame.Board;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;
import java.util.Scanner;


public class program {
    public static void main(String[]agrs){
       
        Scanner sc = new Scanner(system.in);
        ChessMatch chessMatch = new ChessMatch();
       
       while(true){
        UI.printBoard(chessMatch.getPices());
           System.out.println();
           System.out.print("source: ");
           ChessPosition source = UI.readChessPosition(sc);
           
           
           System.out.println();
           System.out.println("target: ");
           ChessPosition target = UI.readChessPosition(sc);
           
           ChessPiece captureChessPiece = chessMatch.performChessMove(source, target);
       }
   }
    
}
