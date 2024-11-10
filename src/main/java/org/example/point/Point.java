package org.example.point;

public class Point implements Movable {
    private int x;
    private int y;

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void moveUp(int offset) {
        this.y = this.y + offset;
    }

    public void moveDown(int offset) {
        this.y = this.y - offset;
    }

    public void moveLeft(int offset) {
        this.x = this.x - offset;
    }

    public void moveRight(int offset) {
        this.x = this.x + offset;
    }
}
