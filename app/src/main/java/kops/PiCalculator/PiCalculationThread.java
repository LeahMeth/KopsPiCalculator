package kops.PiCalculator;

import android.widget.TextView;



public class PiCalculationThread extends Thread {

    private TextView label;

    public PiCalculationThread(TextView label) {
        this.label = label;
    }

    public void run() {
        // this is the code that will execute on a different thread than the main thread

    }

}
