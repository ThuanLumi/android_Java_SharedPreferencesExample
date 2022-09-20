package com.example.sharedpreferencesexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
   private EditText edtName, edtMail;
   private Button buttonSave, buttonNextPage;
   private String nameStr, mailStr;
   private SharedPrefDB sharedPrefDB;

   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);

      edtName = findViewById(R.id.edtName);
      edtMail = findViewById(R.id.edtMail);
      buttonSave = findViewById(R.id.btnSave);
      buttonNextPage = findViewById(R.id.btnNextPage);
      sharedPrefDB = new SharedPrefDB(this);

      buttonSave.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
            nameStr = edtName.getText().toString();
            mailStr = edtMail.getText().toString();

            sharedPrefDB.setName(nameStr);
            sharedPrefDB.setMail(mailStr);
            Toast.makeText(MainActivity.this, "Information Saved", Toast.LENGTH_SHORT).show();
         }
      });

      buttonNextPage.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
            Intent intent = new Intent(MainActivity.this, OtherPage.class);
            startActivity(intent);
         }
      });
   }
}