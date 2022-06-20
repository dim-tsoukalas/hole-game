// Exercise 2 
// AM: 3212018232 Name: Τσουκαλάς Δημήτριος

import javax.swing.*;
import java.util.Scanner;

public class Runner {
    private Controller c = new Controller();
    
    /*
    Class to run the program
    */
    public Runner(){
        c.createMap();
        c.putPlayers();
        c.displayMap();
//  Loop for every game (20 rounds)
        for(int i = 0; i < 20; i++) {
            System.out.println("\n--Murderer Move--\n");
            c.murdererMoves();
            murdererCheck();
            c.displayMap();
            System.out.println("\n");
            Scanner myObj = new Scanner(System.in);
            System.out.println("--Your turn--\n");
            System.out.println("Enter your move: ");
            String move = myObj.next();
            c.holeMoves(move);
            holeCheck();
            c.displayMap();
        }
    }
   /*
    Check if Hole catch the Murderer or Not 
    */
    //Check Hole's Possition
    private void holeCheck(){
        if(c.checkBlock()==1) {
            JOptionPane.showMessageDialog(null,"win");
            System.exit(0);
        } else JOptionPane.showMessageDialog(null,"lose");
    }
    //Check Murderer Possition
    private void murdererCheck(){
        if(c.checkBlock()==1) {
            JOptionPane.showMessageDialog(null,"win");
            System.exit(0);
        } else System.out.println("Murderer left!!");
    }


}