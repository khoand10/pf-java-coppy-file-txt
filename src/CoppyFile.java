import java.io.*;

public class CoppyFile {
    public static void main(String[] args) throws Exception {
        FileInputStream fileInput = null;
        @SuppressWarnings("unchecked")
        FileOutputStream fileOutput = null;
        try {
            fileInput = new FileInputStream("source.txt");
            fileOutput = new FileOutputStream("send.txt");
            int count;
            byte[]b = new byte[2000];
            while ((count = fileInput.read(b)) > 0){
                fileOutput.write(b,0,count);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            fileInput.close();
            fileOutput.close();
        }
    }

}
