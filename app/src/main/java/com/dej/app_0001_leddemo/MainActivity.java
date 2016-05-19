package com.dej.app_0001_leddemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private boolean ledstate = false;
    private Button button = null;
    private CheckBox checkBoxLED1 = null;
    private CheckBox checkBoxLED2 = null;
    private CheckBox checkBoxLED3 = null;
    private CheckBox checkBoxLED4 = null;

    class  MyButtonListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            ledstate = !ledstate;
            if (ledstate) {
                button.setText("ALL OFF");
                checkBoxLED1.setChecked(true);
                checkBoxLED2.setChecked(true);
                checkBoxLED3.setChecked(true);
                checkBoxLED4.setChecked(true);
            }
            else {
                button.setText("ALL ON");
                checkBoxLED1.setChecked(false);
                checkBoxLED2.setChecked(false);
                checkBoxLED3.setChecked(false);
                checkBoxLED4.setChecked(false);
            }
        }
    }

    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.LED1:
                if (checked) {
                    // Put some meat on the sandwich
                    Toast.makeText(getApplicationContext(), "LED1 ON", Toast.LENGTH_SHORT).show();
                }
                else {
                    // Remove the meat
                    Toast.makeText(getApplicationContext(), "LED1 OFF", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.LED2:
                if (checked) {
                    // Put some meat on the sandwich
                    Toast.makeText(getApplicationContext(), "LED2 ON", Toast.LENGTH_SHORT).show();
                }
                else {
                    // Remove the meat
                    Toast.makeText(getApplicationContext(), "LED2 OFF", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.LED3:
                if (checked) {
                    // Put some meat on the sandwich
                    Toast.makeText(getApplicationContext(), "LED3 ON", Toast.LENGTH_SHORT).show();
                }
                else {
                    // Remove the meat
                    Toast.makeText(getApplicationContext(), "LED3 OFF", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.LED4:
                if (checked) {
                    // Put some meat on the sandwich
                    Toast.makeText(getApplicationContext(), "LED4 ON", Toast.LENGTH_SHORT).show();
                }
                else {
                    // Remove the meat
                    Toast.makeText(getApplicationContext(), "LED4 OFF", Toast.LENGTH_SHORT).show();
                }
                break;
            // TODO: Veggie sandwich
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.BUTTON);
        checkBoxLED1 = (CheckBox) findViewById(R.id.LED1);
        checkBoxLED2 = (CheckBox) findViewById(R.id.LED2);
        checkBoxLED3 = (CheckBox) findViewById(R.id.LED3);
        checkBoxLED4 = (CheckBox) findViewById(R.id.LED4);
/*  // 匿名类
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                ledstate = !ledstate;
                if (ledstate)
                    button.setText("ALL OFF");
                else
                    button.setText("ALL ON");
            }
        });
        */
        button.setOnClickListener(new MyButtonListener());
    }
}
