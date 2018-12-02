package com.juanitolaguna.bsp2footrace;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by juanitolaguna on 19.11.18
 */
public class Footrace {
    private final int runners;
    private final int rounds;
    private List<Thread> runnerList = new ArrayList<>();

    public Footrace(int runners, int rounds) {
        this.runners = runners;
        this.rounds = rounds;
    }

    public void run() {
        for (int i = 0; i <= runners; i++) {
            new Thread(new Runner(rounds)).start();
        }

    }



    public static void main(String[] args) {
        Footrace race = new Footrace(5, 50);
        race.run();
    }
}
