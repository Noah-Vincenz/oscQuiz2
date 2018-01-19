public class MainClass {
public static void main(String[] args) {

    Buffer b1 = new Buffer();
    Buffer b2 = new Buffer();

    BufferUser t1 = new BufferUser(b1,b2);
    BufferUser t2 = new BufferUser(b2,b1);

    t1.start();
    t2.start();
}
}
