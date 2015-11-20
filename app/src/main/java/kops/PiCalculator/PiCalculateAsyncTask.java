package kops.PiCalculator;

import android.os.AsyncTask;
import android.widget.TextView;

/**
 * Created by student1 on 11/19/2015.
 */
public class PiCalculateAsyncTask extends AsyncTask<Long, String, String> {

    private TextView textView;
    public PiCalculateAsyncTask(TextView textView){
        this.textView = textView;
    }

    // done in background
    @Override
    protected String doInBackground(Long... params) {

        double pi = calculate(1000000000L);
        return (String.valueOf(pi));
    }


    //gets done on UI thread
    @Override
    protected void onPostExecute(String result) {
        super.onPostExecute(result);
        textView.setText(result);
    }


    //... means an array
    @Override
    protected void onProgressUpdate(String... values) {
        super.onProgressUpdate(values);
        textView.setText(values[0]);

    }


    // need this here in order to publish progress
    public double calculate(long iterations) {
        double pi = 0;
        //int operator = 1;
        //double calc;
        double numerator = 4, denominator;
        boolean pos = true;

        for(int i = 0; i < iterations; i++){
            //calc = operator*(4/(i*2 +1));
            //pi += calc;
            //operator = operator * (-1);
            denominator = i*2+1;
            if(pos){

                pi += numerator/denominator;
                pos = false;
            }
            else{
                pi -= numerator/denominator;
                pos = true;
            }
            publishProgress(String.valueOf(pi));
        }
        return pi;
    }
}
