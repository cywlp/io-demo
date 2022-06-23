import java.io.File;

/**
 * @author :珠代
 * @description :
 * @create :2022-06-23 19:52:00
 */
public class FileDemo {
    public static void main(String[] args) {

        System.out.println("检查文件是否存在");
        File file = new File("./test/char.txt");
        boolean fileExists = file.exists();
        System.out.println(fileExists);
        divide();

        System.out.println("创建文件目录，若父目录不存在或已存在返回false");
        File dir = new File("./test/father/son");
        boolean mkdir = dir.mkdir();
        System.out.println(mkdir);
        divide();

        System.out.println("创建文件目录，若父目录不存在连同父目录一起创建");
        File dirs = new File("./test/father/son");
        boolean mkdirs = dir.mkdirs();
        System.out.println(mkdirs);
        divide();

        System.out.println("获取长度");
        File charFile = new File("./test/char.txt");
        System.out.println("长度为：" + charFile.length());
        divide();

        System.out.println("重命名文件");
        boolean isRenamed = charFile.renameTo(new File("./test/test.txt"));
        divide();

        System.out.println("删除文件");
        boolean isDeleted = charFile.delete();
        System.out.println("是否删除成功？" + isDeleted);
        divide();

        System.out.println("目录");
        File dire = new File("./");
        boolean isDir = dire.isDirectory();
        System.out.println("是否目录？" + isDir);
        divide();

        System.out.println("列出文件");
        String[] files = dire.list();
        for (String s : files) {
            System.out.println(s);
        }
        divide();

        System.out.println("列出目录");
        File[] dires = dire.listFiles();
        for (File d : dires) {
            System.out.println(d);
        }
        divide();

        System.out.println("列出所有文件，包括子目录中的文件");
        recur(dire);



    }

    public static void recur(File file){
        if (file.isDirectory()){
            File[] files = file.listFiles();
            for (File f : files) {
                if (f.isDirectory()){
                    System.out.println(f);
                    recur(f);
                }else {
                    System.out.println(f);
                }
            }
        }
    }

    public static void divide(){
        System.out.println("--------------------------");
    }

}
