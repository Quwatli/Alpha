package quwat.li.alpha;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText userInput;
    private TextView textView;
    //private int numTimesClicked = 0;
    private static final String TAG = "MainActivity";
    private final String TEXT_CONTENTS = "text contents";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "onCreate: in");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userInput = (EditText) findViewById(R.id.editText);
        userInput.setText("");
        Button button = (Button) findViewById(R.id.button);
        textView = (TextView) findViewById(R.id.textView);
        textView.setText("");
        textView.setMovementMethod(new ScrollingMovementMethod()
        );

        View.OnClickListener ourOnClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String result = userInput.getText().toString();
                result += "\n";
                textView.append(result);
                userInput.setText("");
                /*
                numTimesClicked += 1;
                String result = "The Button got tapped "+ numTimesClicked+ " time";
                if (numTimesClicked != 1)
                    result += "s";
                result += "\n";
                textView.append(result);
           */
            }
        };

        button.setOnClickListener(ourOnClickListener);
        Log.d(TAG, "onCreate: out");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        Log.d(TAG, "onSaveInstanceState: saved instance state");
        outState.putString(TEXT_CONTENTS, textView.getText().toString());
        super.onSaveInstanceState(outState);
        Log.d(TAG, "onSaveInstanceState: out");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        Log.d(TAG, "onRestoreInstanceState: restoring instance state");
        //String saveString = savedInstanceState.getString(TEXT_CONTENTS);
        textView.setText(savedInstanceState.getString(TEXT_CONTENTS));
        super.onRestoreInstanceState(savedInstanceState);
        Log.d(TAG, "onRestoreInstanceState: out");
    }

    @Override
    protected void onDestroy() {
        Log.d(TAG, "onDestroy: run destroy method");
        super.onDestroy();
        Log.d(TAG, "onDestroy: out");
    }

    @Override
    protected void onStart() {
        Log.d(TAG, "onStart: run onStart method");
        super.onStart();
        Log.d(TAG, "onStart: out");
    }

    @Override
    protected void onRestart() {
        Log.d(TAG, "onRestart: restarting");
        super.onRestart();
        Log.d(TAG, "onRestart: out");
    }


    @Override
    protected void onResume() {
        Log.d(TAG, "onResume: resuming");
        super.onResume();
        Log.d(TAG, "onResume: out");
    }

    @Override
    protected void onPause() {
        Log.d(TAG, "onPause: pausing");
        super.onPause();
        Log.d(TAG, "onPause: out");
    }


    @Override
    protected void onStop() {
        Log.d(TAG, "onStop: stopping");
        super.onStop();
        Log.d(TAG, "onStop: out");
    }


}
