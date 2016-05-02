package com.project.tcss450.wthomase.mobilehockey;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import com.project.tcss450.wthomase.mobilehockey.authenticate.RegisterActivity;

public class LoginMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_menu);
        TextView logged = (TextView) findViewById(R.id.current_logged_user);
        if (MainMenuActivity.userLogged == null) {
            logged.setText("Logged in as: Guest");
        } else {
            logged.setText("Logged in as: " + MainMenuActivity.userLogged);
        }
    }

    public void switchToNewGameActivity(View view) {
        Intent intent = new Intent(this, GameActivity.class);
        startActivity(intent);
    }

    public void switchToHighScoreActivity(View view) {
        Intent intent = new Intent(this, HighScoreActivity.class);
        startActivity(intent);
    }

    public void switchToSubmitHighScoreActivity(View view) {
        Intent intent = new Intent(this, SubmitHighScoreActivity.class);
        startActivity(intent);
    }

}
