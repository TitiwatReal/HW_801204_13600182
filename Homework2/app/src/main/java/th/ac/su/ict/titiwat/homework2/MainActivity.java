package th.ac.su.ict.titiwat.homework2;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView showColor;
    private Button bt1,bt2,bt3,bt4,bt5,bt6;

    public MainActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showColor = findViewById(R.id.showColor);
        bt1 = findViewById(R.id.bt1);
        bt2 = findViewById(R.id.bt2);
        bt3 = findViewById(R.id.bt3);
        bt4 = findViewById(R.id.bt4);
        bt5 = findViewById(R.id.bt5);
        bt6 = findViewById(R.id.bt6);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showColor.setText("233-225-222");
                showColor.setBackgroundColor(Color.rgb(233,225,222));
            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showColor.setText("231-225-203");
                showColor.setBackgroundColor(Color.rgb(231,204,222));
            }
        });

        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showColor.setText("119-131-154");
                showColor.setBackgroundColor(Color.rgb(119,131,154));
            }
        });

        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showColor.setText("156-169-189");
                showColor.setBackgroundColor(Color.rgb(156,169,189));
            }
        });

        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showColor.setText("196-204-212");
                showColor.setBackgroundColor(Color.rgb(196,204,212));
            }
        });

        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showColor.setText("222-226-229");
                showColor.setBackgroundColor(Color.rgb(222,226,229));
            }
        });
    }
}
