import java.io.PrintWriter;

public class HelloWorld {
  public static void main (String[] args) {
      PrintWriter pen = new PrintWriter(System.out, true);
      pen.println ("Hello, VSCode!");
      pen.println("Test");
      pen.flush();
      pen.close();
    } // main(String[])
}
