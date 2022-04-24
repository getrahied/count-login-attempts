package com.example.devsufy;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity implements TextWatcher {
    EditText username,password;
    TextView res,attempts;
    Button btn;
    int count;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username=(EditText)findViewById(R.id.username);
        password=(EditText)findViewById(R.id.password);
        btn=(Button)findViewById(R.id.btn);
        res=(TextView)findViewById(R.id.res);
        attempts=(TextView)findViewById(R.id.attempts);
        username.addTextChangedListener(this);
        password.addTextChangedListener(this);
    }
    public void click(View view){
        if(username.getText().toString().equals("Sufy") &&
                password.getText().toString().equals("1987")){
            res.setText("Login Successful");
        } else{ res.setText("Login Unsuccessful");
            count++;
            attempts.setText("Incorrect Attempts: "+count);
        }
    }
    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int
            after) {
    }
    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count)
    {
        if(username.getText().toString().length()>=4 &&
                password.getText().toString().length()>=4){
            btn.setEnabled(true);
        } else{ btn.setEnabled(false);
        }
    }
    @Override
    public void afterTextChanged(Editable s) {
    }
}
