package com.example.okcomputers.higherorlowernumbergame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int guessnumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Random var = new Random();
        guessnumber = var.nextInt(20) + 1;
    }
    public void makeToast(String text)
    {
        Toast.makeText(this, text , Toast.LENGTH_SHORT).show();
    }
    public void guess(View view)
    {
        EditText editText = (EditText)findViewById(R.id.NumberEditText);
        int guessint = Integer.parseInt(editText.getText().toString());
        if(guessint > guessnumber) {
            makeToast("Lower!");
        }
       else if(guessint < guessnumber) {
            makeToast("Higher!");
        }
        else{
            makeToast("Youre Right, The Number is:"+guessnumber +", Try Again With The answer");
            Random var = new Random();
            guessnumber = var.nextInt(20) + 1;
        }
    }
}
