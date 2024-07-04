package org.java.spring_boot_test1.testClass;

public class Square {

    private int side;

    public Square(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public int getArea() {
        return side * side;
    }

    public int getPerimeter() {
        return 4 * side;
    }

    @Override
    public String toString() {

        return "Square [side=" + side + ", area=" + getArea() + ", perimeter=" + getPerimeter() + "]";
    }
}
