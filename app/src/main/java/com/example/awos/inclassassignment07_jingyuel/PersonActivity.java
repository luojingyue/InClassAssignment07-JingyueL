package com.example.awos.inclassassignment07_jingyuel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

public class PersonActivity extends AppCompatActivity {
    EditText nameArea;
    EditText ageArea;
    CheckBox swimArea;
    private String name;
    private int age;
    private boolean canSwim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_person);
        nameArea=(EditText)findViewById(R.id.name_area);
        ageArea=(EditText)findViewById(R.id.age_area);
        swimArea=(CheckBox)findViewById(R.id.can_swim);
    }

    public void updatePerson(View view) {
        name=nameArea.getText().toString();
        age=Integer.parseInt(ageArea.getText().toString());
        canSwim=swimArea.isChecked();
        Person newPerson=new Person(name,age,canSwim);
        Intent data = new Intent();
        data.putExtra(Keys.PERSON,newPerson);
        setResult(RESULT_OK, data);
        finish();
//        Intent mainIntent=new Intent(this,MainActivity.class);
//        startActivity(mainIntent);

    }
}
