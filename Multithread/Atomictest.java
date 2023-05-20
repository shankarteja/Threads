package Multithread;

import java.util.concurrent.atomic.AtomicInteger;

public class Atomictest {
    private static AtomicInteger race = new AtomicInteger();
    private static final int thread_count = 10;

    private static void increse() {
        race.incrementAndGet();
    }

    public static void main(String[] args) {
        Thread[] th = new Thread[thread_count];
        for (int i = 0; i < thread_count; ++i) {
            th[i] = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j < 1000; j++) {
                        increse();
                    }

                }
            });
            th[i].start();

        }
        while (Thread.activeCount() > 1) {
            Thread.yield();
        }
        System.out.println(race.get());
    }
}



