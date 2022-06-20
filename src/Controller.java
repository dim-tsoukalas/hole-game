// Exercise 2 
// AM: 3212018232 Name: Τσουκαλάς Δημήτριος

import java.util.Arrays;

public class Controller {
    private String[][] arr = new String[10][10];
    private Hole h = new Hole();
    private Murderer m = new Murderer();
    private int x1, y1;
    private int x2, y2;

    // Random number generator
    private int randomNum(int min, int max) {
        int n=(int)Math.floor(Math.random()*(max-min+1)+min);
        return n;
    }

    // Create 10x10 array
    public void createMap() {
        for (int i=0; i < 10; i++){
            for (int j=0; j < 10; j++){
                arr[i][j] = "-";
            }
        }
    }

    // put players at random places at start of game
    public void putPlayers() {
        x1=randomNum(0,9);
        y1=randomNum(0,9);
        x2=randomNum(0,9);
        y2=randomNum(0,9);

        if(x1==x2 && y1==y2) {
            x1=randomNum(0,9);
            y1=randomNum(0,9);
            x2=randomNum(0,9);
            y2=randomNum(0,9);
        }


        m=new Murderer(arr, x1, y1);
        arr[x1][y1] = "M";

        h=new Hole(arr, x2, y2);
        arr[x2][y2] = "H";

    }

    // move Murder at random place
    public void murdererMoves() {
        int rand = randomNum(0,3);
        switch (rand) {
            case 0:
                m.goDown();
                break;
            case 1:
                m.goUp();
                break;
            case 2:
                m.goLeft();
                break;
            case 3:
                m.goRight();
                break;
        }
        x1 = m.getX();
        y1=m.getY();

    }

    // Move Hole with input of user
    public void holeMoves(String move){
        switch (move) {
            case "down":
                h.goDown();
                break;
            case "up":
                h.goUp();
                break;
            case "left":
                h.goLeft();
                break;
            case "right":
                h.goRight();
                break;
        }
        x2 = h.getX();
        y2=h.getY();
    }

    //Function to display the map at 2D
    public void displayMap() {
        print2D(arr);
    }
    
    // print arraya at 2D
    private static void print2D(String mat[][]) {
        for (String[] row : mat)
            System.out.println(Arrays.toString(row));
    }

    public int checkBlock() {
        if(x1==x2 && y1==y2)
            return 1;
        else return 0;
    }

}