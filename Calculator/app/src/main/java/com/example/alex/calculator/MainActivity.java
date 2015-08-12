package com.example.alex.calculator;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private int screen = 0;
    private String command = "";

    public void onButtonClick(View v){
        Button btn = (Button) v;
        String bText;
        bText = btn.getText().toString();
        int val = Integer.parseInt(bText);
        if(getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT){
            screen += val;
        }
        else{
            if(command == "multiply"){

            }
            else if(command == "add"){

            }
            else if(command == "minus"){

            }
            else if(command == "divide"){

            }
            else{

            }
        }
        TextView myTextView = (TextView) findViewById(R.id.textView);
        myTextView.setText(Integer.toString(screen));
    }

    public void onCommandClick(View v){
        Button com = (Button) v;
        if(v.getId() == R.id.buttonD){
            command = "divide";
        }
        else if(v.getId() == R.id.buttonM){
            command = "minus";
        }
        else if(v.getId() == R.id.buttonx){
            command = "multiply";
        }
        else if(v.getId() == R.id.buttonP){
            command = "add";
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
