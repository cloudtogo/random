package test;

/**
 * Created by cheney on 2017/7/28.
 */
public class LogService {

    public void test() {
        final java.text.SimpleDateFormat df = new java.text.SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ");
        final java.text.DecimalFormat numDf = new java.text.DecimalFormat("#.###");
        new Thread(new Runnable() {
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        System.err.println(e.getMessage());
                    }
                    System.err.println(df.format(new java.util.Date()) + "  >>> " + numDf.format(java.lang.Math.random() * 100000));
                }
            }
        }).start();
    }
}
