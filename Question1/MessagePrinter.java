// Create a class MessagePrinter with a method printMessage(String name) which prints the message "hello <name>".
package Question1;
public class MessagePrinter {
  
    // Method to print the message
    public void printMessage(String name) {
        System.out.println("hello " + name);
    }
 
 
    public static void main(String[] args) {
        MessagePrinter m = new MessagePrinter();
        m.printMessage("Geek");
    }
 }