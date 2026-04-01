public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Java CI/CD Application Started...");
        // This loop ensures the application keeps running
        while (true) {
            // Wait for 5 seconds
            Thread.sleep(5000); 
            System.out.println("Hello from Java CI/CD Pipeline!");
        }
    }
}