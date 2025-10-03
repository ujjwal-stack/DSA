package basic;

class Resource{
    public synchronized void method1(Resource r){
        System.out.println(Thread.currentThread().getName()+ " locked "+ this);
        try{
            Thread.sleep(100);
        }catch(Exception e){}
        r.method2();
    }

    public synchronized void method2() {
        System.out.println(Thread.currentThread().getName() + " locked " + this);
    }
}

public class Deadlock {
    

    public static void main(String[] args) {
        final Resource r1 = new Resource();
        final Resource r2 = new Resource();

        Thread t1 = new Thread(() ->r1.method1(r2), "thread1");

        Thread t2 = new Thread(()-> r2.method1(r1), "thread2");

        t1.start();
        t2.start();

    }
}
