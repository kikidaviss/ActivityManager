package org.bts.android.activitymanager;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {

    private EditText etInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        etInfo = findViewById(R.id.et_input_info_activity_second);
    }

    @Override
    protected void onPause() {
        super.onPause();

        String infoStr = etInfo.getText().toString();
        Log.d("MY TAG", infoStr);

        Intent resultIntent = new Intent();
        resultIntent.putExtra("result", infoStr);
        setResult(Activity.RESULT_OK, resultIntent);
        finish();
    }
}
