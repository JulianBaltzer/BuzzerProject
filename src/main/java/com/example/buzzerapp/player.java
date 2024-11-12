package com.example.buzzerapp;

public class player {

    private String name;
    private int current_score;
    private int highscore;
    private int pref_height;
    private int pref_width;

    public player(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCurrent_score(int score) {
        this.current_score = score;
    }

    public int getCurrent_score() {
        return current_score;
    }

    public int getHighscore() {
        return highscore;
    }

    public void setHighscore(int highscore) {
        this.highscore = highscore;
    }

    public int getPref_height() {
        return pref_height;
    }

    public int getPref_width() {
        return pref_width;
    }
}
