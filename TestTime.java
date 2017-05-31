import java.util.Date;
public class TestTime {

    private static class UpdaterThread extends Thread {
        private final int TIMEOUT = 3000;

        public void run() {
            while (true) {
                try {
                    Thread.sleep(TIMEOUT);
                    System.out.println("3 seconds passed");
                } catch (InterruptedException ex) {
                }
            }
        }
    }

    /**
     * /@param args
     *            the command line arguments
     */
    public static void main(String[] args) {
        try {
            Thread u = new UpdaterThread();
            u.start();
            while (true) {
                System.out.println("-Time-"+new Date());
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}