package com.gorczynskimike.trainitapp;

import java.util.Objects;

public class Answer {

    private final int questionId;
    private final boolean isCorrectAnswer;
    private String answerText;
    private String explanationText;

    public Answer(int questionId, boolean isCorrectAnswer, String answer) {
        this(questionId, isCorrectAnswer, answer, null);
    }

    public Answer(int questionId, boolean isCorrectAnswer, String answer, String explanation) {
        this.questionId = questionId;
        this.isCorrectAnswer = isCorrectAnswer;
        this.answerText = answer;
        this.explanationText = explanation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Answer answer = (Answer) o;
        return questionId == answer.questionId &&
                isCorrectAnswer == answer.isCorrectAnswer &&
                Objects.equals(answerText, answer.answerText);
    }

    @Override
    public int hashCode() {

        return Objects.hash(questionId, isCorrectAnswer, answerText);
    }

    @Override
    public String toString() {
        return "Answer{" +
                "questionId=" + questionId +
                ", isCorrectAnswer=" + isCorrectAnswer +
                ", answerText='" + answerText + '\'' +
                ", explanationText='" + explanationText + '\'' +
                '}';
    }
}
