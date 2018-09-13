public class Main {

    private static String identifyColor(String c) {
        switch (c) {
            case "blue":
                return "GREEN";
            case "green":
                return "BLUE";
            default:
                return c.toUpperCase();
        }
    }

    public static String outputColor(String c) {
        String in = c;
        if("blue".equals(c)) {
            in = "green";
        }else if("green".equals(c)) {
            in = "blue";
        }
        return identifyColor(in);
    }

    public static void main(String[] args) {
        System.out.println("The result is " + "BLUE" + " vs. " + Main.outputColor("blue"));
        System.out.println("The result is " + "GREEN" + " vs. " + Main.outputColor("green"));
        System.out.println("The result is " + "RED" + " vs. " + Main.outputColor("red"));
    }
}
