import java.util.concurrent.Semaphore;

public class Main {
  public static void main(String[] args){

       Semaphore s1 = new Semaphore(1);
       Semaphore s2 = new Semaphore(2);
       Semaphore s3 = new Semaphore(1);

       Thread t1 = new myFirstThread(s1,s2,s3);
       Thread t2 = new mySecondThread(s1,s2,s3);
       t1.start();
       t2.start();
  }
}
