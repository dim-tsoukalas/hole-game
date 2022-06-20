// Exercise 2 
// AM: 3212018232 Name: Τσουκαλάς Δημήτριος

public class Hole {
    private String[][] array;
    private int x;
    private int y;

    public Hole() {
        this.array = null;
        this.x = 0;
        this.y = 0;
    }

    public Hole(String[][] array, int x, int y) {
        this.array = array;
        this.x = x;
        this.y = y;
    }

    public void goLeft() {
        array[x][y] = "-";
        y=y-1;
        array[x][y=checkOutofBound(y)] = "H";
    }

    public void goRight() {
        array[x][y] = "-";
        y=y+1;
        array[x][y=checkOutofBound(y)] = "H";
    }

    public void goUp() {
        array[x][y] = "-";
        x=x-1;
        array[x=checkOutofBound(x)][y] = "H";
    }

    public void goDown() {
        array[x][y] = "-";
        x=x+1;
        array[x=checkOutofBound(x)][y] = "H";
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String[][] getArray() {
        return array;
    }

    // Check if Hole go out of Array
    public int checkOutofBound(int n) {
        if (n >= 10)
            return 7;

        else if(n < 0)
            return  1;

        else return n;
    }


}