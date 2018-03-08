package com.example.awos.inclassassignment07_jingyuel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView showArea;
   private String finalMessage="";
   private String nameGet;
   private int ageGet;
   private boolean swimGet;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showArea=(TextView)findViewById(R.id.show_area);

    }

    public void addPerson(View view) {
            Intent intent = new Intent(this, PersonActivity.class);
            startActivityForResult(intent, Keys.NUMBER);  // you can use any number other than 111
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == Keys.NUMBER && resultCode == RESULT_OK) {
            Person person = (Person) data.getSerializableExtra(Keys.PERSON);
            nameGet=person.getName();
            ageGet=person.getAge();
            swimGet=person.isCanSwim();
            String newMessage="Name: "+nameGet+"\nAge: "+ageGet+"Can swim? "+swimGet+"\n\n\n";
            finalMessage=finalMessage+newMessage;
            showArea.setText(finalMessage);
        }
    }

}
