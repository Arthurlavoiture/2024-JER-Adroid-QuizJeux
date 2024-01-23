package com.example.quizjeux;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.RadioButton;
import com.google.android.material.button.MaterialButton;
import java.math.BigDecimal;
import android.os.Bundle;

public class QuizActivity extends AppCompatActivity {
    private TextView TV_QuestionJoueur1;
    private TextView TV_QuestionJoueur2;

    private TextView TV_CompteurJoueur1;
    private TextView TV_CompteurJoueur2;
    private MaterialButton BT_Rejouer;
    private MaterialButton BT_Menu;
    private Button BT_Joueur1;
    private Button BT_Joueur2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        TV_QuestionJoueur1 = findViewById(R.id.QuestionJoueur1);
        TV_QuestionJoueur2 = findViewById(R.id.QuestionJoueur2);
        TV_CompteurJoueur1 = findViewById(R.id.compteurJoueur1);
        TV_CompteurJoueur2 = findViewById(R.id.compteurJoueur2);
        BT_Rejouer = findViewById(R.id.MaterialBT_rejouer);
        BT_Menu = findViewById(R.id.MaterialBT_menu);
        BT_Joueur1 = findViewById(R.id.BoutonJoueur1);
        BT_Joueur2 = findViewById(R.id.BoutonJoueur2);

        TV_QuestionJoueur1.setText("sdfghxcvb");

    }






BT_Rejouer.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {

    }
});

    BT_Menu.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick (View view){

    }
    });

    BT_Joueur1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick (View view){

    }
    });

    BT_Joueur2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick (View view){

    }
    });


}