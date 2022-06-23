import java.io.*;

/**
 * @author :珠代
 * @description :
 * @create :2022-06-23 15:54:00
 */
public class Char {
    public static void main(String[] args) throws IOException {
        writeCharToFile();
        readCharToFile();
        convertBytes2Chars();
    }

    public static void writeCharToFile() throws IOException {
        String hello = new String("hello chars!");
        File file = new File("./test/char.txt");
        Writer os = new FileWriter(file);
        os.write(hello);
        os.close();
    }

    public static void readCharToFile() throws IOException {
        File file = new File("./test/char.txt");
        char[] chars = new char[(int) file.length()];
        Reader is = new FileReader(file);
        int size = is.read(chars);
        System.out.println("大小：" + size +";内容:" + new String(chars));
        is.close();
    }

    //字节流转换为字符流
    public static  void convertBytes2Chars() throws IOException {
        File file = new File("./test/byte.txt");
        InputStream is = new FileInputStream(file);
        Reader reader = new InputStreamReader(is);
        char[] chars = new char[(int) file.length()];
        int size = reader.read(chars);
        System.out.println("大小：" + size + "；内容：" + new String(chars));
    }
}
