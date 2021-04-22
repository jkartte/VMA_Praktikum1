package de.thkoeln.cvogt.android.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ThirdActivity extends Activity {

    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);    // Layout für ThirdActivity auswählen

        final Button switchButton = (Button) findViewById(R.id.switchActivity); //Button mit GOTO 1
        switchButton.setOnClickListener(new SwitchButtonListener3());

        final Button switchButton2 = (Button) findViewById(R.id.switchActivity2); //Button mit GOTO 2
        switchButton2.setOnClickListener(new SwitchButtonListener4());

        final Button switchButton3 = (Button) findViewById(R.id.switchActivity3); //Button mit GOTO 2
        switchButton3.setOnClickListener(new SwitchButtonListener5());

        Toast.makeText(this,"Activity 3: onCreate()", Toast.LENGTH_LONG).show();

        Log.v("DEMO","      ---> Activity3: onCreate() <--- ");
        // Log.v("DEMO","Activity2: Intent.getComponent() = "+getIntent().getComponent());

    }

    public void onStart() {
        super.onStart();
        Log.v("DEMO","      ---> Activity3: onStart() <--- ");
    }

    public void onResume() {
        super.onResume();
        Log.v("DEMO","      ---> Activity3: onResume() <--- ");
    }

    public void onPause() {
        super.onPause();
        Log.v("DEMO","      ---> Activity3: onPause() <--- ");
    }

    public void onStop() {
        super.onStop();
        Log.v("DEMO","      ---> Activity3: onStop() <--- ");
    }

    public void onDestroy() {
        super.onDestroy();
        Log.v("DEMO","      ---> Activity3: onDestroy() <--- ");
    }

}

class SwitchButtonListener3 implements View.OnClickListener {   // Listener des Buttons
    public void onClick(View v) {
        Log.v("DEMO","      ---> Activity3: Click on Button <--- ");
        Intent myIntent = new Intent(v.getContext(),MainActivity.class); // Durch Übergabe dieses Intent-Objekts an startActivity():
        myIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);               //Flag setzen
        v.getContext().startActivity(myIntent);                          // Erzeugung und Aktivierung einer neuen Instanz der Klasse MainActivity
    }
}

class SwitchButtonListener4 implements View.OnClickListener {   // Listener des Buttons
    public void onClick(View v) {
        Log.v("DEMO","      ---> Activity3: Click on Button <--- ");
        Intent myIntent = new Intent(v.getContext(),SecondActivity.class); // Durch Übergabe dieses Intent-Objekts an startActivity():
        v.getContext().startActivity(myIntent);                          // Erzeugung und Aktivierung einer neuen Instanz der Klasse MainActivity
    }
}

class SwitchButtonListener5 implements View.OnClickListener {   // Listener des Buttons
    public void onClick(View v) {
        Log.v("DEMO","      ---> Activity3: Click on Button <--- ");
        Intent myIntent = new Intent(v.getContext(),ThirdActivity.class); // Durch Übergabe dieses Intent-Objekts an startActivity():
        v.getContext().startActivity(myIntent);                          // Erzeugung und Aktivierung einer neuen Instanz der Klasse MainActivity
    }
}
