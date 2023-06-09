package Multithread;

public class thre implements Runnable {
        @Override
        public void run()
        {
            for ( int i = 0; i < 10; i++ )
            {
                System.out.println( i );
                try
                {
                    Thread.sleep( 300 );
                }
                catch ( InterruptedException e )
                {
                    e.printStackTrace();
                }
            }
        }
    }

    class CounterThread extends Thread
    {
        @Override
        public void run()
        {
            for ( int i = 0; i < 10; i++ )
            {
                System.out.println( i );
                try
                {
                    Thread.sleep( 300 );
                }
                catch ( InterruptedException e )
                {
                    e.printStackTrace();
                }
            }
        }
    }

    class WaitForThreadToFinish
    {
        public static void main(String[] args)
        {

            Thread t1 = new Thread( new CounterThread() );
            CounterThread t2 = new CounterThread();

            t1.start();
            t2.start();

            try
            {
                t1.join();
                t2.join();
            }
            catch ( InterruptedException e )
            {
                e.printStackTrace();
            }

            System.out.println( "Finished" );

        }
    }

