import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputPath = new Scanner(System.in);
        System.out.println("Nhập đường dẫn file txt: ");
        String path = inputPath.nextLine();

        ReadFileText readFileExample = new ReadFileText();
        readFileExample.readFile(path);
    }
}
