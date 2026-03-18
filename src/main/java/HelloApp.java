public class HelloApp {
    public static void main(String[] args) {
        String names;
        if (args.length == 0) {
            names = "World";
        } else {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < args.length; i++) {
                sb.append(args[i]);
                if (i < args.length - 1) {
                    sb.append(", ");
                }
            }
            names = sb.toString();
        }
        System.out.println("Hello, " + names + "!");
    }
}