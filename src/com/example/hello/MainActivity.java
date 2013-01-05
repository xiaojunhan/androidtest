package com.example.hello;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

	public void sendMessage(View view) {
	    System.out.println("test=================");
	    AlertDialog dialog = new AlertDialog.Builder(view.getContext())
	     .create();
	    dialog.setMessage("hello world ,晓军中文测试 ");
	    dialog.show();
	}
}
