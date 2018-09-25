package com.example.mazegame;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Game extends Activity {
    public Game() {
    }
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        Maze maze = (Maze)extras.get("maze");
        GameView view = new GameView(this,maze);
        this.setContentView(view);
    }
}