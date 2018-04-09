package org.bts.android.activitymanager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnLaunch = findViewById(R.id.btn_launch_activity2_activity_main);
        btnLaunch.setOnClickListener(this);

        Button btnKillAct = findViewById(R.id.btn_kill_activity_activity_main);
        btnKillAct.setOnClickListener(this);

        Toast.makeText(this, "onCreate()", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStart() {
        super.onStart();

        Toast.makeText(this, "onStart()", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onResume() {
        super.onResume();

        Toast.makeText(this, "onResume()", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onPause() {
        super.onPause();

        Toast.makeText(this, "onPause()", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStop() {
        super.onStop();

        Toast.makeText(this, "onStop()", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Toast.makeText(this, "onDestroy()", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Toast.makeText(this, "onRestart()", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onClick(View view) {

        if (view.getId() == R.id.btn_launch_activity2_activity_main) {
            Toast.makeText(this, "Button clicked!", Toast.LENGTH_SHORT).show();
        } else if (view.getId() == R.id.btn_kill_activity_activity_main)  {
            finish();
        }

    }
}
