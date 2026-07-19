/*
Andrew Estrada
Module 6.2
CSD-402
7/18/26
*/

public class Mod_6{

    public static void main(String [] args){
        Fan defaultFan = new Fan();

        Fan definedFan = new Fan(Fan.FAST, true, 12);

        System.out.println(defaultFan.toString());
        System.out.println(definedFan.toString());

    }
}

class Fan{

    final static int STOPPED = 0;
    final static int SLOW = 1;
    final static int MEDIUM = 2;
    final static int FAST = 3;

    private int speed;
    private boolean on;
    private int radius = 6;
    String color = "white";

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public String toString() {
        String state = on ? "on" : "off";
        String speedString = null;

        switch(speed) {
            case STOPPED: speedString = "STOPPED"; break;
            case SLOW: speedString = "SLOW"; break;
            case MEDIUM: speedString = "MEDIUM"; break;
            case FAST: speedString = "FAST"; break;
        }

        return state + speedString;
    }

    public Fan() {
        this.speed = STOPPED;
        this.on = false;
        this.radius = 6;
        this.color = "white";
    }

    public Fan(int speed, boolean on, int radius) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
    }
}