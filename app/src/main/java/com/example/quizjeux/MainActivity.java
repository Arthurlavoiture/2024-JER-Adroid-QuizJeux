package com.example.quizjeux;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.button.MaterialButton;
import java.math.BigDecimal;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    //private EditText ;

    private Button BT_Nouveau_Joueur;

    private EditText NomJoueur1;

    private EditText NomJoueur2;

    private Button BT_Start_New_Game;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BT_Nouveau_Joueur = findViewById(R.id.BT_Nouveau_Joueur);
        NomJoueur1 = findViewById(R.id.ET_Nom_Joueur1);
        NomJoueur2 = findViewById(R.id.ET_Nom_Joueur2);
        BT_Start_New_Game = findViewById(R.id.BT_Start_New_Game);
    }


    @Override
    protected void onStart() {
            super.onStart();
            BT_Nouveau_Joueur.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                 NomJoueur1.setVisibility(View.VISIBLE);
                 NomJoueur2.setVisibility(View.VISIBLE);
                 BT_Start_New_Game.setVisibility(View.VISIBLE);
                }
            });


            BT_Start_New_Game.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, QuizActivity.class);
                intent.putExtra("NomJoueur1",NomJoueur1.getText().toString());
                intent.putExtra("NomJoueur2",NomJoueur2.getText().toString());
                startActivity(intent);
                }
            });
    }
}