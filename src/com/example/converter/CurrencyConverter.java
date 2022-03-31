package com.example.converter;



import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class CurrencyConverter extends Activity {
  /** Called when the activity is first created. */
  private ArrayAdapter<String> adapter;
  private Spinner spinnerFrom,spinnerTo;
  private EditText editAmount;
  private TextView textResult;
  private Button btnConvert;
  private String[] currency = 
  {
  "USD",
  "EURO",
  "KYAT"
  };
  
  public void onCreate(Bundle savedInstanceState) {    
  	super.onCreate(savedInstanceState);    
  	setContentView(R.layout.main_cur);
  	
  	spinnerFrom = (Spinner) findViewById(R.id.spinnerFrom);  
  	spinnerTo = (Spinner) findViewById(R.id.spinnerTo);
  	
  	adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, currency);    
  	adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);    
  	spinnerFrom.setAdapter(adapter);
  	spinnerTo.setAdapter(adapter);
  	
  	editAmount=(EditText)findViewById(R.id.editAmount);
  	btnConvert = (Button) findViewById(R.id.btnConvert);
  	btnConvert.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			convert();
			// TODO Auto-generated method stub
			
		}
	});
  	
  	textResult=(TextView)findViewById(R.id.textResult);
 }
  
  
  private void convert(){
	  float USD_TO_KYAT = 1771.08f, EURO_TO_KYAT = 1971.31f, KYAT_TO_KYAT = 1.0f;
	  float[] converters = {USD_TO_KYAT,EURO_TO_KYAT,KYAT_TO_KYAT};
	  
	  int from = spinnerFrom.getSelectedItemPosition();
	  int to = spinnerTo.getSelectedItemPosition();
	  
	  float amount = Float.valueOf(editAmount.getText().toString());
	  
	  float result = amount * converters[from] / converters[to];
	  textResult.setText("" + result);
	  
  }
}
