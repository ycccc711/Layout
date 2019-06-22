package sg.edu.rp.c346.layout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class EventConfirmationActivity extends AppCompatActivity {

    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_confirmation);

        tv = findViewById(R.id.textView);

        //get data
        Intent intentReceived = getIntent();
        String eventCode = intentReceived.getStringExtra("EventCode");
        String emailAddress = intentReceived.getStringExtra("EmailAddress");

        if(!emailAddress.contains("@gmail.com")|| eventCode.length()!=5){
            tv.setText("Input error");

//            if(eventCode.length() == 5){
//            if (emailAddress.endsWith("gmail.com")){
//
//                tv.setText("Event:"+eventCode+" is successfully registered. \nYour email address is:"+emailAddress);
//            }
        }
        else{
//            tv.setText("Input error");
            tv.setText("Event:"+eventCode+" is successfully registered. \nYour email address is:"+emailAddress);
        }
    }
}
