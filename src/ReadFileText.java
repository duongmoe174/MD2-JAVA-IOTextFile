import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadFileText {
    public void  readFile (String filePath) {
        try {
            File file = new File(filePath);
            if(!file.exists()){
                throw new FileNotFoundException();
            }
            FileReader fileReader = new FileReader(file);
            BufferedReader newBuff = new BufferedReader(fileReader);

            String line = "";
            int sum = 0;
            while ((line = newBuff.readLine()) != null ) {
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            newBuff.close();
            System.out.println("Tổng = " + sum);
        }
        catch (Exception e) {
            System.out.println("Không tồn tại hoặc nội dung file bị lỗi");
        }
    }
}
