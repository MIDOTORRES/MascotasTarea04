package com.miditos.mascotastarea04;

import android.app.Activity;
import android.content.Intent;
import android.media.tv.TvInputService;
import android.net.Uri;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Properties;

import javax.mail.PasswordAuthentication;
import javax.mail.Session;



import java.util.Properties;

public class Contacto extends AppCompatActivity implements View.OnClickListener{

    //Declaring EditText
    private EditText teName;
    private EditText teEmail;
    private EditText teMensaje;
    //Send button
    private Button buttonSend;
    private String gettedEmail;

    //Declaring EditText
    private EditText editTextEmail;
    private EditText editTextMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacto);

        //Initializing the views
        teName = (EditText) findViewById(R.id.teName);
        teEmail = (EditText) findViewById(R.id.teEmail);
        teMensaje = (EditText) findViewById(R.id.teMensaje);
        buttonSend = (Button) findViewById(R.id.buttonSend);

        //Adding click listener
        buttonSend.setOnClickListener(this);
    }


    private void enviarEmail() {
        //Getting content for email
        String name = teName.getText().toString().trim();
        String email = teEmail.getText().toString().trim();
        String message = teMensaje.getText().toString().trim();

        //Creating SendMail object
        EnviarMail sm = new EnviarMail(this, name,  email, message);

        //Executing sendmail to send email
        sm.execute();
    }

    @Override
    public void onClick(View v) {
        enviarEmail();

    }
}
