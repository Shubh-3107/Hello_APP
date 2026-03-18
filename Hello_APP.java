class Hello_APP {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else if (args.length == 1) {
            System.out.println("Hello, " + args[0] + "!");
        } else {
           
            String names = String.join(", ", args);
            System.out.println("Hello, " + names + "!");
        }
    }
}