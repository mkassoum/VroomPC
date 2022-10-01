import java.io.IOException;

public class function {
    public function() {
    }

    public static String makeString(String x) {
        String y = "Process Process = Runtime.getRuntime().exec(";
        String z = ");";
        return y + x + z;
    }

    public static void runCom(String x,String y,String z) throws RuntimeException, IOException {
        if (z != null & x != null & y != null ) {
            Process Process = Runtime.getRuntime().exec(x);
            Process Process2 = Runtime.getRuntime().exec(y);
            Process Process3 = Runtime.getRuntime().exec(z);
        }
       else if (z == null & y == null ) {
            Process Process = Runtime.getRuntime().exec(x);

        }
       else {
            Process Process = Runtime.getRuntime().exec(x);
            Process Process2 = Runtime.getRuntime().exec(y);
        }


    }

    private static void runCom() {
    }
}
