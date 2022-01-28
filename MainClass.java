package git;
import java.util.Scanner;
public class MainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in
        GetFiles createFile = new GetFiles();

        System.out.println("""
                                
                +---------------------------------+
                |    WELCOME TO LOCKEDme.com      |
                |---------------------------------|
                |    Developer:Shanmukh Talawar   |
                |             :shtalawa@cisco.com |
                +---------------------------------+""");
        while (true) {
            int option = isRight.checkInput();
            switch (option) {
                System.out.println("""
                                            
                        |Choose option:
                        |   1.Retrieve Files
                        |   2.Business Level Operations
                        |   3.Exit Application
                        """);
                System.out.println("Working Directory = " + System.getProperty("user.dir"));
                 switch (option) {
                    case 1 -> createFile.gettingFiles();

                }
            }
        }
    }
}
