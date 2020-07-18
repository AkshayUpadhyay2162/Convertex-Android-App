package com.akshaytech.convertex;

import android.content.DialogInterface;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Spinner spinner1,spinner2;
    EditText editText;
    TextView textView;
    String firstCurrency;
    String secondCurrency;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        spinner1 = findViewById(R.id.spinner1);
        spinner2 = findViewById(R.id.spinner2);
        editText = findViewById(R.id.et1);
        textView = findViewById(R.id.tv2);
        button = findViewById(R.id.btnconvert);
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG).setAction("Action", null).show();
            }
        });
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

    public void Convert(View view) {
        Animation animation = AnimationUtils.loadAnimation(MainActivity.this,R.anim.bounce);
        button.startAnimation(animation);
         firstCurrency = String.valueOf(spinner1.getSelectedItem());
         secondCurrency = String.valueOf(spinner2.getSelectedItem());
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);
        alertDialogBuilder.setTitle("Result");
        alertDialogBuilder.setPositiveButton("Done", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(MainActivity.this,"Well done",Toast.LENGTH_SHORT).show();
            }
        });
        if(firstCurrency.equals("US Dollar") && secondCurrency.equals("INR")){
            String amount = editText.getText().toString();
            Double dollar = Double.parseDouble(amount);
            Double INR = dollar*75.16;
            String inrAmount = "= "+INR.toString()+" INR";
             alertDialogBuilder.setMessage(""+inrAmount);
            alertDialogBuilder.show();
        }
        else if(firstCurrency.equals("US Dollar") && secondCurrency.equals("Euro")){
            String amount = editText.getText().toString();
            Double dollar = Double.parseDouble(amount);
            Double Euro = dollar*0.88;
            String euroAmount = "= "+Euro.toString()+" Euros";
            alertDialogBuilder.setMessage(""+euroAmount);
            alertDialogBuilder.show();
        }
        else if(firstCurrency.equals("US Dollar") && secondCurrency.equals("Pound")){
            String amount = editText.getText().toString();
            Double dollar = Double.parseDouble(amount);
            Double Pound = dollar*0.80;
            String poundAmount = "= "+Pound.toString()+" Pounds";
            alertDialogBuilder.setMessage(""+poundAmount);
            alertDialogBuilder.show();        }
        else if(firstCurrency.equals("US Dollar") && secondCurrency.equals("Japanese Yen")){
            String amount = editText.getText().toString();
            Double dollar = Double.parseDouble(amount);
            Double Yen = dollar*106.99 ;
            String YenAmount = "= "+Yen.toString()+" Yen";
            alertDialogBuilder.setMessage(""+YenAmount);
            alertDialogBuilder.show();
        }
        else if(firstCurrency.equals("INR") && secondCurrency.equals("US Dollar")){
            String amount = editText.getText().toString();
            Double INR = Double.parseDouble(amount);
            Double Dollar = INR*0.013;
            String DollarAmount = "= "+Dollar.toString()+" Dollar";
            alertDialogBuilder.setMessage(""+DollarAmount);
            alertDialogBuilder.show();
        }
        else if(firstCurrency.equals("INR") && secondCurrency.equals("Pound")){
            String amount = editText.getText().toString();
            Double INR = Double.parseDouble(amount);
            Double pound = INR*0.011;
            String poundAmount = "= "+pound.toString()+" Pounds";
            alertDialogBuilder.setMessage(""+poundAmount);
            alertDialogBuilder.show();
        }
        else if(firstCurrency.equals("INR") && secondCurrency.equals("Euro")){
            String amount = editText.getText().toString();
            Double INR = Double.parseDouble(amount);
            Double Euro = INR*0.012;
            String EuroAmount = "= "+Euro.toString()+" Euros";
            alertDialogBuilder.setMessage(""+EuroAmount);
            alertDialogBuilder.show();
        }
        else if(firstCurrency.equals("INR") && secondCurrency.equals("Japanese Yen")){
            String amount = editText.getText().toString();
            Double INR = Double.parseDouble(amount);
            Double Yen = INR*1.43;
            String YenAmount = "= "+Yen.toString()+" Yen";
            alertDialogBuilder.setMessage(""+YenAmount);
            alertDialogBuilder.show();
        }
        else if(firstCurrency.equals("Euro") && secondCurrency.equals("US Dollar")){
            String amount = editText.getText().toString();
            Double Euro = Double.parseDouble(amount);
            Double Dollar = Euro*1.14;
            String DollarAmount = "= "+Dollar.toString()+" Dollar";
            alertDialogBuilder.setMessage(""+DollarAmount);
            alertDialogBuilder.show();
        }
        else if(firstCurrency.equals("Euro") && secondCurrency.equals("INR")){
            String amount = editText.getText().toString();
            Double Euro = Double.parseDouble(amount);
            Double INR = Euro*85.63;
            String INRAmount = "= "+INR.toString()+" INR";
            alertDialogBuilder.setMessage(""+INRAmount);
            alertDialogBuilder.show();
        }
        else if(firstCurrency.equals("Euro") && secondCurrency.equals("Pound")){
            String amount = editText.getText().toString();
            Double Euro = Double.parseDouble(amount);
            Double Pound = Euro*0.91;
            String poundAmount = "= "+Pound.toString()+" Pounds";
            alertDialogBuilder.setMessage(""+poundAmount);
            alertDialogBuilder.show();
        }
        else if(firstCurrency.equals("Euro") && secondCurrency.equals("Japanese Yen")){
            String amount = editText.getText().toString();
            Double Euro = Double.parseDouble(amount);
            Double Yen = Euro*122.28 ;
            String YenAmount = "= "+Yen.toString()+" Yen";
            alertDialogBuilder.setMessage(""+YenAmount);
            alertDialogBuilder.show();
        }
        else if(firstCurrency.equals("Pound") && secondCurrency.equals("US Dollar")){
            String amount = editText.getText().toString();
            Double Pound = Double.parseDouble(amount);
            Double Dollar = Pound*1.26;
            String DollarAmount = "= "+Dollar.toString()+" Dollar";
            alertDialogBuilder.setMessage(""+DollarAmount);
            alertDialogBuilder.show();
        }
        else if(firstCurrency.equals("Pound") && secondCurrency.equals("INR")){
            String amount = editText.getText().toString();
            Double Pound = Double.parseDouble(amount);
            Double INR = Pound*94.15;
            String INRAmount = "= "+INR.toString()+" INR";
            alertDialogBuilder.setMessage(""+INRAmount);
            alertDialogBuilder.show();
        }
        else if(firstCurrency.equals("Pound") && secondCurrency.equals("Euro")){
            String amount = editText.getText().toString();
            Double pound = Double.parseDouble(amount);
            Double Euro = pound*1.10;
            String EuroAmount = "= "+Euro.toString()+" Euros";
            alertDialogBuilder.setMessage(""+EuroAmount);
            alertDialogBuilder.show();
        }
        else if(firstCurrency.equals("Pound") && secondCurrency.equals("Japanese Yen")){
            String amount = editText.getText().toString();
            Double pound = Double.parseDouble(amount);
            Double Yen = pound*134.51;
            String YenAmount = "= "+Yen.toString()+" Yen";
            alertDialogBuilder.setMessage(""+YenAmount);
            alertDialogBuilder.show();
        }
        else if(firstCurrency.equals("Japanese Yen") && secondCurrency.equals("US Dollar")){
            String amount = editText.getText().toString();
            Double yen = Double.parseDouble(amount);
            Double Dollar = yen*0.0093;
            String DollarAmount = "= "+Dollar.toString()+" Dollar";
            alertDialogBuilder.setMessage(""+DollarAmount);
            alertDialogBuilder.show();
        }
        else if(firstCurrency.equals("Japanese Yen") && secondCurrency.equals("INR")){
            String amount = editText.getText().toString();
            Double yen = Double.parseDouble(amount);
            Double inr = yen*0.70;
            String inrAmount = "= "+inr.toString()+" INR";
            alertDialogBuilder.setMessage(""+inrAmount);
            alertDialogBuilder.show();
        }
        else if(firstCurrency.equals("Japanese Yen") && secondCurrency.equals("Euro")){
            String amount = editText.getText().toString();
            Double yen = Double.parseDouble(amount);
            Double Euro = yen*0.0082;
            String EuroAmount = "= "+Euro.toString()+" Euros";
            alertDialogBuilder.setMessage(""+EuroAmount);
            alertDialogBuilder.show();
        }
        else if(firstCurrency.equals("Japanese Yen") && secondCurrency.equals("Pound")){
            String amount = editText.getText().toString();
            Double yen = Double.parseDouble(amount);
            Double pound = yen*0.0074;
            String poundAmount = "= "+pound.toString()+" Pounds";
            alertDialogBuilder.setMessage(""+poundAmount);
            alertDialogBuilder.show();
        }
    }
}
