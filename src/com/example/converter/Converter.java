package com.example.converter;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

/** Called when the activity is first created. */
public class Converter extends Activity {
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		Button btnCurrency = (Button) findViewById(R.id.btnCurrency);
		Button btnTemp = (Button) findViewById(R.id.btnTemp);

		btnCurrency.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent intent = new Intent(Converter.this, CurrencyConverter.class);
				startActivity(intent);
				// TODO Auto-generated method stub

			}

		});

		btnTemp.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent intent = new Intent(Converter.this, TemperatureConverter.class);
				startActivity(intent);
				// TODO Auto-generated method stub

			}

		});
	}

}