package Multithread;

public class Threadanonymous {
    public static void main(String[] args) {
        Thread t=new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <5 ; i++) {
                    System.out.println("hello:" +i + Thread.currentThread().getName());
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                }
            }
        });
        t.start();

    }
}
