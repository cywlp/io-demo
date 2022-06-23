import java.io.*;

/**
 * @author :珠代
 * @description :
 * @create :2022-06-23 17:02:00
 */
public class Buffered {
    public static void main(String[] args) throws IOException {
        writeByBufferedOutputStream();
        readByBufferedInputStream();
        writeByBufferedWriter();
        readByBufferedReader();
    }

    public static void writeByBufferedOutputStream() throws IOException {
        File file = new File("./test/bufferByte.txt");
        OutputStream os = new BufferedOutputStream(new FileOutputStream(file));
        os.write("hello bufferByte".getBytes());
        os.close();
    }

    public static void readByBufferedInputStream() throws IOException {
        File file = new File("./test/bufferByte.txt");
        InputStream is = new BufferedInputStream(new FileInputStream(file));
        byte[] bytes = new byte[(int) file.length()];
        int size = is.read(bytes);
        System.out.println("大小:" + size + ";内容:" + new String(bytes));
        is.close();
    }

    public static void writeByBufferedWriter() throws IOException {
        File file = new File("./test/bufferChar.txt");
        Writer writer = new BufferedWriter(new FileWriter(file));
        writer.write("hello bufferChar");
        writer.close();
    }

    public static void readByBufferedReader() throws IOException {
        File file = new File("./test/bufferChar.txt");
        Reader reader = new BufferedReader(new FileReader(file));
        char[] chars = new char[(int) file.length()];
        int size = reader.read(chars);
        System.out.println("大小:" + size + ";内容:" + new String(chars));
        reader.close();
    }
}
