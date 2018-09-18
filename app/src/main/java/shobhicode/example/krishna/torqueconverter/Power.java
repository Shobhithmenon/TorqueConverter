package shobhicode.example.krishna.torqueconverter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Power extends AppCompatActivity {
    Button bt;
    EditText rpm;
    EditText torque;
    TextView tv;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.power);
        bt=(Button)findViewById(R.id.button);
        rpm=(EditText)findViewById(R.id.editText3);
        torque=(EditText)findViewById(R.id.editText4);
        tv=(TextView)findViewById(R.id.textView2);
        final Double r=Double.parseDouble(String.valueOf(rpm));
        final Double t=Double.parseDouble(String.valueOf(torque));


        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double con=0.1046666666666667;
                Double out;
                out = r * con * t;
                tv.setText(String.valueOf(out));



            }
        });
    }
}
