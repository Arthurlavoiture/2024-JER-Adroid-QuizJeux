package com.example.quizjeux;

public class Question {
    private String Question = "";
    private boolean Reponse = true;

    /**
     * Constructeur de la classe Question
     * @param Question le libeller de la question
     * @param Reponse la reponse a la question
     */
    public Question(String Question, boolean Reponse) {
        this.Question = Question;
        this.Reponse = Reponse;
    }

    /**
     * ObtenireQuestion
     * @return Question
     */
    public String getQuestion() {
        return Question;

    }

    /**
     * ObtenireReponse
     * @return
     */
    public boolean getReponse() {
        return Reponse;
    }
}
