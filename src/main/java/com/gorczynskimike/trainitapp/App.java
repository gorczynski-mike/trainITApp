package com.gorczynskimike.trainitapp;

public class App {

    public static void main(String[] args) {
        Question question1 = new Question(1,"question text",
                new Answer(1,true, "Answer text"));
        System.out.println(question1);
    }

}
