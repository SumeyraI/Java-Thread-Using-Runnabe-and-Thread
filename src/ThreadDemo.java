public class ThreadDemo{
    public static void main(String[] args){
        data d=new data();
        d.deger=100;
        producer producer=new producer(d);  // This section we use Thread class
        consumer consumer=new consumer(d);  // This section we use Runnable interface
        Thread thread=new Thread(consumer); // Because of implement of Runnable interface we create Thread and then assign that interface's value to that thread object
        producer.start();
        while(producer.isAlive()) {
            System.out.println("Waiting...");
        }
        thread.start();
    }
}
class producer extends Thread{
    data d;
    public  producer(data valueOfInheritedData){
        this.d=valueOfInheritedData;
    }

    @Override
    public void run() {
        for (int i=0;i<10;i++) {
            d.deger++;
            System.out.println("Producer produce that value: "+d.deger);
        }
    }
}
class consumer implements Runnable{
    data d;
    public consumer(data valueOfImplData){
        this.d=valueOfImplData;
    }

    @Override
    public void run() {
        for (int i=0;i<10;i++) {
            d.deger--;
            System.out.println("Consumer consume that value: "+d.deger);
        }
    }
}
class data{
    int deger;
}


