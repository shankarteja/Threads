package Multithread;
public  class Runn implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5 ; i++) {
            System.out.println("Hello:" +i+ Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }

    }
}
class threadrunnable{
    public static void main(String[] args) {
        Thread t=new Thread(new Runn());
            Thread t1=new Thread(new Runn()) ;
            t.start();
            t1.start();

        }

    }


