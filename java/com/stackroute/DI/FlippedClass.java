package com.stackroute.DI;

import java.sql.SQLOutput;

public class FlippedClass extends ClassRoom{

    String duration;


    public FlippedClass(Mentor mentor) {
        super(mentor);
        System.out.println("flipped class constructor!");

    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }





}
