package com.example.tasktwo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements SensorEventListener{

    private TextView textViewX, textViewY, textViewZ;
    private Sensor sensor;
    private SensorManager sensorManager;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // creating sensor manager
        sensorManager = (SensorManager)getSystemService(SENSOR_SERVICE);

        // accelerometer sensor
        sensor = sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);

        // sensor listener
        sensorManager.registerListener(this, sensor, SensorManager.SENSOR_DELAY_NORMAL);

        // assigning textViews
        textViewX = (TextView) findViewById(R.id.textViewX);
        textViewY = (TextView) findViewById(R.id.textViewY);
        textViewZ = (TextView) findViewById(R.id.textViewZ);


    }

    @Override
    public void onSensorChanged(SensorEvent sensorEvent) {
        textViewX.setText("X Axis: " + sensorEvent.values[0] );
        textViewY.setText("Y Axis: " + sensorEvent.values[1] );
        textViewZ.setText("Z Axis: " + sensorEvent.values[2] );

    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int i) {

    }
}