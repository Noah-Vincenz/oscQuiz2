public class BufferUser extends Thread {
    Buffer b1;
    Buffer b2;

    public BufferUser(Buffer firstBuffer, Buffer secondBuffer){
        b1 = firstBuffer;
        b2 = secondBuffer;
    }
    public void run(){
        while(true){
            b1.moveFirstItemTo(b2);
        }
    }

}
