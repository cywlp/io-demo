import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/**
 * @author :珠代
 * @description :
 * @create :2022-06-23 16:50:00
 */
public class Pipe {
    public static void main(String[] args) throws IOException {
        final PipedOutputStream pos = new PipedOutputStream();
        final PipedInputStream pis = new PipedInputStream(pos);
        Thread thread1 = new Thread(() -> {
            try {
                pos.write("hello pipe".getBytes());
                pos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        Thread thread2 = new Thread(() -> {
            try {
                int data = pis.read();
                while (data != -1 && pos != null){
                    System.out.print((char) data);
                    data = pis.read();
                }
                pis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        thread1.start();
        thread2.start();
    }
}
