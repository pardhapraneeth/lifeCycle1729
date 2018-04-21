package praneeth.com.lifecycle1729;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("android","create event");

    }
    protected void onStart(){
        super.onStart();
        Log.d("android","start event");
    }

    protected void onResume(){
        super.onResume();
        Log.d("android","resume event");
    }
    protected void onPause(){
        super.onPause();
        Log.d("android","pause event");
    }
    protected void onStop(){
        super.onStop();
        Log.d("android","stop event");
    }
    protected void onDestroy(){
        super.onDestroy();
        Log.d("android","destroy event");
    }


}
