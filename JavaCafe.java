public class JavaCafe {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app.
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";

        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double dripCafe = 1.5;
        double latte = 2.5;
        double cappucino = 4.5;

        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";

        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = false;
        boolean isReadyOrder3 = false;
        boolean isReadyOrder4 = false;
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        if (!isReadyOrder1) {
            System.out.println(customer1 + readyMessage);
            System.out.println(displayTotalMessage + mochaPrice);
        } else {
            System.out.println(customer1 + pendingMessage);
        }
        if (!isReadyOrder4) {
            System.out.println(customer4 + readyMessage);
            System.out.println(displayTotalMessage + cappucino);
        } else {
            System.out.println(customer4 + pendingMessage);
        }
        System.out.println(generalGreeting + customer2); 
        double latteTotal = 2 * latte;
        System.out.println(displayTotalMessage + latteTotal);
        if (!isReadyOrder3) {
            System.out.println(customer3 + readyMessage);
        } else {
            System.out.println(customer3 + pendingMessage);
        }
        System.out.println(generalGreeting + customer3); 
        double correctTotal = mochaPrice - latte;
        System.out.println("The correct total is $" + correctTotal);

    }
}
