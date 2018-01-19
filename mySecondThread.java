import java.util.concurrent.Semaphore;
public class mySecondThread extends Thread {

  Semaphore s1,s2,s3;

  public mySecondThread(Semaphore a, Semaphore b, Semaphore c){
    s1 = a;
    s2 = b;
    s3 = c;
  }
  public void run(){
    //second thread implementation
    try {
      s3.acquire();
s1.acquire();
s3.release();
s2.release();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
