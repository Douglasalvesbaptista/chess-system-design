package aplication;

import boardgame.Board;
import chess.ChessException;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;
import static java.time.Clock.system;
import java.util.InputMismatchException;
import java.util.Scanner;


public class program {
    public static void main(String[]agrs){
       
        Scanner sc = new Scanner(System.in);
        ChessMatch chessMatch = new ChessMatch();
       
        while (true) {
            try {
                UI.clearScreen();
                UI.printMatch(chessMatch);
                System.out.println();
                System.out.print("source: ");
                ChessPosition source = UI.readChessPosition(sc);
                
                boolean[][] possibleMoves = chessMatch.possibleMoves(source);
                UI.clearScreen();
                UI.printBoard(chessMatch.getPieces(), possibleMoves);
                System.out.println();
                System.out.println("target: ");
                ChessPosition target = UI.readChessPosition(sc);

                ChessPiece captureChessPiece = chessMatch.performChessMove(source, target);
            }
            catch (ChessException e){
                System.out.println(e.getMessage());
                sc.nextLine();
                
            }
            catch (InputMismatchException e){
                System.out.println(e.getMessage());
                sc.nextLine();
                
            }

        }

    }

}
