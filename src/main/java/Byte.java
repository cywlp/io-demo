import java.io.*;

/**
 * @author :珠代
 * @description :
 * @create :2022-06-23 15:54:00
 */
public class Byte {
    public static void main(String[] args) throws IOException {
        writeBytesToFile();
        readBytesToFile();
    }

    public static void writeBytesToFile() throws IOException {
        String hello = new String("hello bytes!");
        byte[] bytes = hello.getBytes();
        File file = new File("./test/byte.txt");
        OutputStream os = new FileOutputStream(file);
        os.write(bytes);
        os.close();
    }

    public static void readBytesToFile() throws IOException {
        File file = new File("./test/byte.txt");
        byte[] bytes = new byte[(int) file.length()];
        InputStream is = new FileInputStream(file);
        int size = is.read(bytes);
        System.out.println("大小：" + size +";内容:" + new String(bytes));
        is.close();
    }
}
