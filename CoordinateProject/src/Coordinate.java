public class Coordinate {
    final int x; // default
    final int y; // default
    /*

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

     */ // control + N to generate


    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "( " + x + ". " + y + " )";
    }

    public double distanceFrom(Coordinate other) {
        return Math.sqrt(Math.pow(this.x - other.x, 2) + Math.pow(this.y - other.y, 2));
    }

    public double distanceFrom() {
        distanceFrom(new Coordinate(0, 0));
    }

    // method for every class
    public boolean equals(Coordinate other) {
        return (this.x == other.x) && (this.y == other.y);
    }

    //copy constructor
    public Coordinate(Coordinate other) {
        this(other.x, other.y);
    }

    //hashcode
    public int hashCode() {
        return this.x * 31 + this.y;
    }

}
