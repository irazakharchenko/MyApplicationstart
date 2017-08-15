package com.example.iryna.myapplicationstart;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.MyApplicationstart.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /** Called when the user taps the Send button */
    public void sendMessage(View view) {

        /**this is used because the Activity class is a subclass of Context
         * DisplayMessageActivity.class - the Class of the app component to which the system should
         * deliver the Intent (in this case, the activity that should be started).
         *
         */
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.editText);
        String message = editText.getText().toString();
        // method adds the EditText's value to the intent
        intent.putExtra(EXTRA_MESSAGE, message);
        // method starts an instance of the DisplayMessageActivity specified by the Intent
        startActivity(intent);
    }
}
