class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread is running");
    }
}
public class ExtendThread {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
    }
}