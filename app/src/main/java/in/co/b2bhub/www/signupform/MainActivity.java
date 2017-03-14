package in.co.b2bhub.www.signupform;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public final static String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view) {
            Intent intent = new Intent(this, HomePage.class);
            EditText editText = (EditText) findViewById(R.id.your_full_name);
            EditText editText1=(EditText)findViewById(R.id.mobile_no);
            String message2=editText1.getText().toString();
            String message = editText.getText().toString();
            intent.putExtra(EXTRA_MESSAGE, message + message2);
            startActivity(intent);
        }


}
