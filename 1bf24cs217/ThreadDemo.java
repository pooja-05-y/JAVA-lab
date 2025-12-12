class CollegeThread extends Thread {
    public void run() {
        try {
            while (true) {
                System.out.println("pingu when sick\n");
                Thread.sleep(600); // 10 seconds
            }
        } catch (InterruptedException e) {
            System.out.println("CollegeThread Interrupted");
        }
    }
}

class CSEThread extends Thread {
    public void run() {
        try {
            while (true) {
                System.out.println("*cant breathe*");
                Thread.sleep(200); // 2 seconds
            }
        } catch (InterruptedException e) {
            System.out.println("CSEThread Interrupted");
        }
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        CollegeThread t1 = new CollegeThread();
        CSEThread t2 = new CSEThread();

        t1.start();
        t2.start();
    }
}