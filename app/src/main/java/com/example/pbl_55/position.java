package com.example.pbl_55;

public class position {
    public float X;
    public float Y;
    public position() {
        // Default constructor required for calls to DataSnapshot.getValue(User.class)
    }
    public position(float x, float y) {
        this.X = x;
        this.Y = y;
    }
}
