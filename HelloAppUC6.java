class HelloAppUC6 {
    public static void main(String[] args) {

        // If no arguments
        if (args.length == 0) {
            System.out.println("Hello, World!");
            return;
        }

        String result = "Hello ";

        // Enhanced for loop
        for (String name : args) {
            result += name + ", ";
        }

        // Remove last ", " using substring
        result = result.substring(0, result.length() - 2);

        // Print final result
        System.out.println(result);
    }
}