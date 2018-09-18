package shobhicode.example.krishna.torqueconverter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button torque,power,rpm,weight;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
torque= findViewById(R.id.torqueb);
power= findViewById(R.id.powerb);
rpm= findViewById(R.id.rpmb);
weight= findViewById(R.id.weightb);

torque.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent tq=new Intent(MainActivity.this,Torque.class);
        startActivity(tq);

    }
});
power.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent pw=new Intent(MainActivity.this,Power.class);
        startActivity(pw);
    }
});
rpm.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent rpm=new Intent(MainActivity.this,RPM.class);
        startActivity(rpm);
    }
});
weight.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent wei=new Intent(MainActivity.this,Weight.class);
        startActivity(wei);
    }
});

    }
}
