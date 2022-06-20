// Exercise 2 
// AM: 3212018232 Name: Τσουκαλάς Δημήτριος

public class Murderer {
    private String[][] array;
    private int x;
    private int y;

    public Murderer() {
        this.array = null;
        this.x = 0;
        this.y = 0;
    }

    public Murderer(String[][] array, int x, int y) {
        this.array = array;
        this.x = x;
        this.y = y;
    }

    public void goLeft() {
        array[x][y] = "-";
        y=y-2;
        array[x][y=checkOutofBound(y)] = "M";
    }

    public void goRight() {
        array[x][y] = "-";
        y=y+2;
        array[x][y=checkOutofBound(y)] = "M";
    }

    public void goUp() {
        array[x][y] = "-";
        x=x-2;
        array[x=checkOutofBound(x)][y] = "M";
    }

    public void goDown() {
        array[x][y] = "-";
        x=x+2;
        array[x=checkOutofBound(x)][y] = "M";
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
// Check if Murderer go out of Array
    public int checkOutofBound(int n) {
        if (n >= 10)
            return 7;

        else if(n < 0)
            return  1;

        else return n;
    }

}
