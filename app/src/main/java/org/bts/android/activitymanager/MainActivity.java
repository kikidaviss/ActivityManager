package org.bts.android.activitymanager;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView tvInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();

        Toast.makeText(this, "onCreate()", Toast.LENGTH_SHORT).show();

        tvInfo = findViewById(R.id.tv_info_activity_main);
    }

    private void initViews() {
        Button btnLaunch = findViewById(R.id.btn_launch_activity2_activity_main);
        btnLaunch.setOnClickListener(this);

        Button btnKillAct = findViewById(R.id.btn_kill_activity_activity_main);
        btnKillAct.setOnClickListener(this);
    }

    @Override
    protected void onStart() {
        super.onStart();

        Toast.makeText(this, "onStart()", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();

        Toast.makeText(this, "onResume()", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();

        Toast.makeText(this, "onPause()", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();

        Toast.makeText(this, "onStop()", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Toast.makeText(this, "onDestroy()", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Toast.makeText(this, "onRestart()", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View view) {

        if (view.getId() == R.id.btn_launch_activity2_activity_main) {
            Toast.makeText(this, "Button clicked!", Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(this, SecondActivity.class);
            //startActivity(intent);
            startActivityForResult(intent, 11);
        } else if (view.getId() == R.id.btn_kill_activity_activity_main) {
            finish();
        }

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == 11 && resultCode == Activity.RESULT_OK) {
            String inf =
                    data.getStringExtra(SecondActivity.RESULT_ID);
            tvInfo.setText(inf);
        }
    }
}
