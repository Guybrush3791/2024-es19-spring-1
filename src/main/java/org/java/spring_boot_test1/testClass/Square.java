package org.java.spring_boot_test1.testClass;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Square {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

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
