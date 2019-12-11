package com.example.simpleapp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {
    private SharedPreferences mPreferences;
    private SharedPreferences.Editor mEditor;

    private EditText mname, mpassword;
    private Button btnlogin;
    private CheckBox mcheckbox;
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        mname=(EditText)findViewById(R.id.uname);
        mpassword=(EditText)findViewById(R.id.upass);
        btnlogin=(Button)findViewById(R.id.login);
        mcheckbox=(CheckBox)findViewById(R.id.rme);

        mPreferences= PreferenceManager.getDefaultSharedPreferences(this);
        mPreferences=getSharedPreferences("Database Name",MODE_PRIVATE);
        mEditor=mPreferences.edit();

        checkSharedPrefences(); // to check whetjer the object is being created or not to avoid app crash

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mcheckbox.isChecked()){
                    mEditor.putString(getString(R.string.checkbox),"True");
                    mEditor.commit();

                    String name=mname.getText().toString();
                    mEditor.putString(getString(R.string.name),name);
                    mEditor.commit();

                    String password=mpassword.getText().toString();
                    mEditor.putString(getString(R.string.password),password);
                    mEditor.commit();
                }
                else{
                    mEditor.putString(getString(R.string.checkbox),"False");
                    mEditor.commit();

                    String name=mname.getText().toString();
                    mEditor.putString(getString(R.string.name),"");
                    mEditor.commit();

                    String password=mpassword.getText().toString();
                    mEditor.putString(getString(R.string.password),"");
                    mEditor.commit();


                }

                Intent intent = new Intent(getApplicationContext(),Login.class);
                startActivity(intent);


            }
        });

    }
    private void checkSharedPrefences(){
        String checkbox=mPreferences.getString(getString(R.string.checkbox),"False");
        String name=mPreferences.getString(getString(R.string.name),"");
        String password=mPreferences.getString(getString(R.string.password),"");

        mname.setText(name);
        mpassword.setText(password);
        if(checkbox.equals("True")){

            mcheckbox.setChecked(true);
        }
        else{
            mcheckbox.setChecked(false);
        }


    }
}
