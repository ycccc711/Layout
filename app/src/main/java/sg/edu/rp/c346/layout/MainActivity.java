package sg.edu.rp.c346.layout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etTextEventCode;
    EditText editTextEmail;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etTextEventCode = (EditText) findViewById(R.id.editTextEventCode);
        editTextEmail = (EditText) findViewById(R.id.editTextEmail);
        btnSubmit = (Button) findViewById(R.id.buttonSubmit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String eventcode = etTextEventCode.getText().toString();
                String email = editTextEmail.getText().toString();

                Intent intent = new Intent(MainActivity.this,EventConfirmationActivity.class);
                intent.putExtra("EventCode",eventcode);
                intent.putExtra("EmailAddress",email);
                startActivity(intent);
            }
        });
    }
}