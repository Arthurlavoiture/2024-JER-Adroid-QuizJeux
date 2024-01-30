package com.example.quizjeux;

import java.util.ArrayList;

import kotlin.text.UStringsKt;

public class GameData {

    public ArrayList<Question> listQuestion(){
        ArrayList<Question> listQuestion = new ArrayList();
        listQuestion.add(new Question("Est-ce que l'Allemagne a gagné la Coupe du Monde 2018 ?", false));
        listQuestion.add(new Question("Est-ce que Java est un langage de compilation ?", true));
        listQuestion.add(new Question("Zurich est-elle la capitale de la Suisse ?", false));
        listQuestion.add(new Question("Le tour complet de la Terre mesure-t-il 50 000 km ?", false));
        return listQuestion;
    }





}

