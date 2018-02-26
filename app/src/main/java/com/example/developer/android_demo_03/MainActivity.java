package com.example.developer.android_demo_03;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AndroidException;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class MainActivity extends AppCompatActivity {

    @BindView(R.id.txtAddress) EditText txtAddress;
    @BindView(R.id.txtFirstName) EditText txtFirstName;
    @BindView(R.id.txtLastName) EditText txtLastName;
    @BindView(R.id.cmbCity) Spinner cmbCity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_2);
        ButterKnife.bind(this);
        List<String> cities = new ArrayList<>();
        cities.add("Bandung"); cities.add("Kuta"); cities.add("Jakarta");
        ArrayAdapter<String> citiesAdaptes = new ArrayAdapter <String>(this, android.R.layout.simple_spinner_dropdown_item, cities);
        cmbCity.setAdapter(citiesAdaptes);
    }
    @OnClick(R.id.btnSave)
    public void click(){
//        Log.d("OUTPUT MESSAGE : ", "Hello");
        if (TextUtils.isEmpty(txtFirstName.getText().toString()) || TextUtils.isEmpty(txtLastName.getText().toString())){
            Toast.makeText(this, "Please Fill First Name and Last Name", Toast.LENGTH_LONG).show();
        }else{
            AlertDialog.Builder alert =  new AlertDialog.Builder(this);
            alert.setMessage("Data Saved");
            alert.show();
        }
    }
}
