package com.example.mazegame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MazeCreator {

   public MazeCreator() {

   }

    public static Maze getMaze(int mazeNo) {
        Maze maze = null;
        boolean [][] vLines;
        boolean [][] hLines;
        if (mazeNo == 1) {
            maze = new Maze();
            vLines = new boolean[][]{

                    /*0*/{true, false, false, false, true, false, false},
                    /*1*/{true, false, false, true, false, true, true},
                    /*2*/{false, true, false, false, true, false, false},
                    /*3*/{false, true, true, false, false, false, true},
                    /*4*/{true, false, false, false, true, true, false},
                    /*5*/{false, true, false, false, true, false, false},
                    /*6*/{false, true, true, true, true, true, false},
                    /*7*/{false, false, false, true, false, false, false}
            };

            hLines = new boolean[][]{
                    /*0*/{false, false, true, true, false, false, true, false},
                    /*1*/{false, false, true, true, false, true, false, false},
                    /*2*/{true, true, false, true, true, false, true, true},
                    /*3*/{false, false, true, false, true, true, false, false},
                    /*4*/{false, true, true, true, true, false, true, false},
                    /*5*/{true, false, false, true, false, false, true, false},
                    /*6*/{false, true, false, false, false, true, false, true}
            };
            maze.setVertLines(vLines);
            maze.setHorizLines(hLines);
            maze.setStartPosition(0,0);
            maze.setFinalPosition(7,7);
        }
        if (mazeNo == 2) {
            maze = new Maze();
            vLines = new boolean[][]{{false, false, false, true, false, false, false}, {false, false, true, false, true, false, false}, {false, false, true, true, false, false, false}, {false, false, true, true, true, false, false}, {false, false, true, false, true, false, false}, {true, false, false, true, false, true, false}, {true, false, true, true, false, false, false}, {false, false, true, false, false, false, true}};
            hLines = new boolean[][]{{false, true, true, true, false, true, true, true}, {true, true, false, false, true, true, true, false}, {false, true, true, false, false, false, true, true}, {true, true, false, false, false, true, true, false}, {false, true, true, true, true, false, true, false}, {false, false, true, false, false, true, true, true}, {false, true, false, false, true, true, false, false}};
            maze.setVertLines(vLines);
            maze.setHorizLines(hLines);
            maze.setStartPosition(0, 7);
            maze.setFinalPosition(7, 0);
        }

        if (mazeNo == 3) {
            maze = new Maze();
            vLines = new boolean[][]{{false, false, true, false, false, false, true, false, false, false, false, false}, {false, true, false, false, false, true, false, false, false, false, true, true}, {true, false, false, false, false, true, false, false, false, false, true, true}, {true, true, false, false, false, true, true, true, false, false, true, true}, {true, true, true, false, false, true, true, false, true, false, true, true}, {false, true, true, true, false, true, false, false, false, true, false, false}, {false, false, false, true, false, true, false, true, false, false, false, false}, {false, false, true, false, true, false, true, true, false, true, false, false}, {true, true, true, true, false, true, true, false, false, true, false, false}, {false, false, false, true, false, false, true, true, false, true, true, false}, {false, false, true, false, true, false, true, false, false, false, false, false}, {true, true, true, true, true, true, true, false, false, true, false, false}, {false, false, true, false, false, true, false, false, false, false, true, false}};
            hLines = new boolean[][]{{true, false, false, true, true, false, false, false, true, true, true, true, false}, {false, true, true, true, true, true, true, true, true, true, false, false, false}, {false, false, true, true, true, false, false, true, true, true, true, false, false}, {false, false, false, true, true, true, false, false, false, true, false, false, false}, {false, false, false, false, true, false, false, true, true, true, false, false, false}, {true, true, false, false, false, true, true, true, true, false, true, true, true}, {false, true, true, true, true, true, false, false, false, true, true, true, false}, {true, false, false, false, true, false, true, false, true, false, false, true, true}, {false, true, false, false, false, true, false, true, true, true, true, true, false}, {true, true, false, true, false, true, true, false, false, true, false, true, false}, {false, true, true, false, true, false, false, true, true, false, true, true, true}, {false, true, false, false, true, false, false, true, true, true, false, false, true}};
            maze.setVertLines(vLines);
            maze.setHorizLines(hLines);
            maze.setStartPosition(0, 0);
            maze.setFinalPosition(12, 12);
        }
        return maze;
    }
}
