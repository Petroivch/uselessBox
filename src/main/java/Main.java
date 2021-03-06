public class Main {

    public static void main(String[] args) throws InterruptedException {
        Box box = new Box();
        Thread aToy = new Thread(null, box::turnOff, "Thread Toy");
        Thread user = new Thread(null, box::turnOn, "Thread User");
        System.out.printf("Thread %s: started...\n", Thread.currentThread().getName());
        aToy.start();
        user.start();
        user.join();
        aToy.interrupt();
        System.out.printf("Thread %s: finished.", Thread.currentThread().getName());
    }
}