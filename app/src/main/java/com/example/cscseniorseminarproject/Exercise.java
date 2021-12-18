package com.example.cscseniorseminarproject;

public class Exercise {
    int Image;
    String exercise;
    String focus;

    public Exercise(int image, String exercise, String focus) {
        Image = image;
        this.exercise = exercise;
        this.focus = focus;
    }

    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        Image = image;
    }

    public String getExercise() {
        return exercise;
    }

    public void setExercise(String exercise) {
        this.exercise = exercise;
    }

    public String getFocus() {
        return focus;
    }

    public void setFocus(String focus) {
        this.focus = focus;
    }
}
