package com.example.demo;

public class Sport {
    private String sports;
    private double height;
    private  String physical_activity;

    public Sport(String sports, double height, String physical_activity){
        setSports(sports);
        setHeight(height);
        setPhysical_activity(physical_activity);
    }


    public String getSports(){
        return sports;
    }

    public void setSports(String sports){
        this.sports= sports;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if(height < 6.2)
            throw new IllegalArgumentException("You are too short to play any height based sports. Give up!!!");
        else if(height > 9)
            throw  new IllegalArgumentException("You did not clearly read the instructions, give a realistic Height");

        else
            this.height = height;
    }

    public String getPhysical_activity() {
        return physical_activity;
    }


    public  String toString(){
        return  "The sport you play is:" + sports +'\n'+
                "your height is: "+ height +'\n'+ "Your physical activity is: " + physical_activity;
    }


    public void setPhysical_activity(String physical_activity) {
        this.physical_activity = physical_activity;
    }
}
