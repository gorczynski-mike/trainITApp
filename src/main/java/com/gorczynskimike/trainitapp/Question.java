package com.gorczynskimike.trainitapp;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Question {

    private final int Id;
    private String questionText;
    private final List<Answer> answersList = new ArrayList<>();

    public Question(int id, String questionText, Answer answer, Answer... answers) {
        Id = id;
        this.questionText = questionText;
        answersList.add(answer);
        for(Answer a: answers) {
            answersList.add(a);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Question question = (Question) o;
        return Id == question.Id &&
                Objects.equals(questionText, question.questionText);
    }

    @Override
    public int hashCode() {

        return Objects.hash(Id, questionText);
    }

    @Override
    public String toString() {
        return "Question{" +
                "Id=" + Id +
                ", questionText='" + questionText + '\'' +
                ", answersList=" + answersList +
                '}';
    }
}
