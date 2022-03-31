package com.example.converter;

import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;


import android.os.Bundle;

public class TemperatureConverter extends Activity {
    /** Called when the activity is first created. */
	private EditText editTemp;
	private TextView txtResult;
	private Button btnConvert;
	private RadioButton radio1,radio2;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_temp);
        editTemp = (EditText) findViewById(R.id.editTemp);
        txtResult = (TextView) findViewById(R.id.txtResult);
        btnConvert = (Button) findViewById(R.id.btnConvert);
        radio1 = (RadioButton) findViewById(R.id.radio1);
        radio2 = (RadioButton) findViewById(R.id.radio2);
        
        btnConvert.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				convert();
				// TODO Auto-generated method stub
				
			}
		});
        }
    
    private void convert(){
   float temp = Float.parseFloat(editTemp.getText().toString());
    }
    
  /*  public void myClickHandler(View view) {
		switch (view.getId()) {
		case R.id.Button01:
			RadioButton celsiusButton = (RadioButton) findViewById(R.id.RadioButton02);
			RadioButton fahrenheitButton = (RadioButton) findViewById(R.id.RadioButton01);
			if (text.getText().length() == 0) {
				Toast.makeText(
						this,
						"Please enter a valid number", Toast.LENGTH_LONG).show();
				return;
			}
			
			float inputValue = Float.parseFloat(text.getText().toString());
			if (celsiusButton.isChecked()) {
				tv.setText("");
				tv.setText(String
						.valueOf(convertFahrenheitToCelcius(inputValue))+" Celcius");
				//Toast.makeText(this,String
						//.valueOf(convertFahrenheitToCelcius(inputValue))+" Celcius", Toast.LENGTH_LONG).show();
			} else {
				tv.setText("");
				tv.setText(String
						.valueOf(convertCelciusToFahrenheit(inputValue))+" Fahrenheit");
				//Toast.makeText(this,String
						//.valueOf(convertCelciusToFahrenheit(inputValue))+" Fahrenheit", Toast.LENGTH_LONG).show();
			}
			
			if (fahrenheitButton.isChecked()) {
				fahrenheitButton.setChecked(false);
				celsiusButton.setChecked(true);
			} else {
				fahrenheitButton.setChecked(true);
				celsiusButton.setChecked(false);
			}
			break;
		}
	}*/

	
	private float convertFahrenheitToCelcius(float fahrenheit) {
		return ((fahrenheit - 32) * 5 / 9);
	}

	
	private float convertCelciusToFahrenheit(float celsius) {
		return ((celsius * 9) / 5) + 32;
	}

}
