package com.example.mazegame;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends Activity implements View.OnClickListener {
    public Menu() {
    }


    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Button newGame = (Button) findViewById(R.id.bNew);
        Button exit = (Button) findViewById(R.id.bExit);
        newGame.setOnClickListener(this);
        exit.setOnClickListener(this);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.bExit:
                finish();
                break;
            // new game button for choosing levels
            case R.id.bNew:
                final String[] levels = {"1", "2", "3"};
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setTitle("Select Maze");
                builder.setItems(levels, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int item) {
                        Intent game = new Intent(Menu.this, Game.class);
                        Maze maze = MazeCreator.getMaze(item + 1);
                        game.putExtra("maze", maze);
                        startActivity(game);
                    }
                });
                AlertDialog alert = builder.create();
                alert.show();
        }
    }
}



