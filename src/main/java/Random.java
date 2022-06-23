import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @author :珠代
 * @description :
 * @create :2022-06-23 16:38:00
 */
public class Random {
    public static void main(String[] args) throws IOException {

        randomAccessFileWrite();
        randomAccessFileRead();
    }
    public static void randomAccessFileWrite() throws IOException {
        RandomAccessFile file = new RandomAccessFile("./test/random.txt","rw");
        //定位
        file.seek(10);
        long pointerBegin = file.getFilePointer();
        file.write("hello randomWrite".getBytes());
        long pointerEnd = file.getFilePointer();
        System.out.println("pointerBegin:" + pointerBegin + ";pointerEnd:" + pointerEnd);
        file.close();
    }

    public static void randomAccessFileRead() throws IOException {
        RandomAccessFile file = new RandomAccessFile("./test/random.txt","rw");
        //定位
        file.seek(10);
        long pointerBegin = file.getFilePointer();
        byte[] bytes = new byte[(int) file.length()];
        int size = file.read(bytes);
        System.out.println("大小：" + size + ";内容："+ new String(bytes));
        file.close();
    }
}
