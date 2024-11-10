package org.example.primitiveClock;


public class Clock implements Readable {
    private int hour;
    private int minute;
    private int second;

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void tick() {
        this.second = this.second + 1;
    }

    public void readTime() {
        System.out.printf
                ("Current time by nonDateTimeClock: %s:%s:%s %n=====%n%n",
                        this.hour, this.minute, this.second
                );
    }
}
