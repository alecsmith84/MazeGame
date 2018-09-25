package com.example.mazegame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.io.Serializable;

public class Maze implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final int UP = 0, DOWN = 1, RIGHT = 2, LEFT = 3;

    private boolean[][] vertLines;
    private boolean[][] horizLines;
    private int sizeX, sizeY;
    private int currentX, currentY;
    private int finalX, finalY;
    private boolean gameComplete;

    public Maze(){
    }
    public int getMazeWidth() {return this.sizeX;}
    public int getMazeHeight() {return this.sizeY;}

    public boolean move(int direction) {
        boolean moved = false;
        if (direction == UP) {
            if (currentY != 0 && !horizLines[currentY-1][currentX]) {
                currentY--;
                moved = true;
            }
        }
        if (direction == DOWN) {
            if (currentY != sizeY-1 && !horizLines[currentY][currentX]) {
                currentY++;
                moved = true;
            }
        }

        if (direction == RIGHT) {
            if (currentX != sizeX-1 && !vertLines[currentY][currentX]) {
                currentX++;
                moved = true;
            }
        }

        if (direction == LEFT) {
            if (currentX != 0 && !vertLines[currentY][currentX-1]) {
                currentX--;
                moved = true;
            }
        }

        if (moved) {
            if (currentX == finalX && currentY == finalY) {
                this.gameComplete = true;
            }
        }
        return moved;
    }

    public boolean isGameComplete() {return this.gameComplete;}

    public void setStartPosition(int x, int y) {
        this.currentX = x;
        this.currentY = y;
    }

    public int getFinalX() {
        return finalX;
    }
    public int getFinalY() {
        return finalY;
    }

    public void setFinalPosition(int x, int y) {
        finalX = x;
        finalY = y;
    }

    public int getCurrentX() {
        return this.currentX;
    }
    public int getCurrentY(){
        return  this.currentY;
    }

    public boolean[][] getHorizLines() {
        return this.horizLines;
    }

    public void setHorizLines(boolean[][] lines){
        this.horizLines = lines;
        this.sizeX = this.horizLines[0].length;
    }

    public boolean[][] getVertLines() {
        return this.vertLines;
    }

    public void setVertLines(boolean[][] lines) {
        this.vertLines = lines;
        this.sizeY = this.vertLines.length;
    }

}