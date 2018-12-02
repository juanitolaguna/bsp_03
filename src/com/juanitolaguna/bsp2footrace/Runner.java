package com.juanitolaguna.bsp2footrace;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by juanitolaguna on 19.11.18
 */
public class Runner implements Runnable {
    private int time = 0; // Start counting
    private int rounds = 0; // Default
    private static int runnerCount = 0;
    private static int winnerCount = 0;
    private final int id = runnerCount++;

    public Runner(int rounds) {
        this.rounds = rounds;
    }

    @Override
    public void run() {

        while (rounds-- > 0) {
            int randomTime = ThreadLocalRandom.current().nextInt(0, 100);
            time +=randomTime;
//            System.out.println("Runner " + id +  " is running round " + rounds);
            try {
                Thread.sleep(randomTime);
            } catch (InterruptedException e) {
                System.out.println("Someone woke me up!");
            }
        }
        System.out.println(++winnerCount + ". Platz: Läufer " + id + " Zeit: " + time);

    }

}
