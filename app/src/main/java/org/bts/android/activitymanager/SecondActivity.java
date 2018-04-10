package org.bts.android.activitymanager;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {

    public static final String RESULT_ID = "Polina wants this to be result";
    private EditText etInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        etInfo = findViewById(R.id.et_input_info_activity_second);

        Button btnClose = findViewById(R.id.btn_close_activity_second);
        btnClose.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btn_close_activity_second) {
            String infoStr = etInfo.getText().toString();

            Intent resultIntent = new Intent();
            resultIntent.putExtra(RESULT_ID, infoStr);
            setResult(Activity.RESULT_OK, resultIntent);
            finish();
        }
    }
}
