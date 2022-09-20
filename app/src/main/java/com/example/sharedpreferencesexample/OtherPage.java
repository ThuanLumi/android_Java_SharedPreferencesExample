package com.example.sharedpreferencesexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class OtherPage extends AppCompatActivity {
   private TextView tvSavedName, tvSavedMail;
   private String savedName, savedMail;
   private SharedPrefDB sharedPrefDB;

   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_other_page);

      tvSavedName = findViewById(R.id.tvSavedName);
      tvSavedMail = findViewById(R.id.tvSavedMail);
      sharedPrefDB = new SharedPrefDB(this);

      savedName = sharedPrefDB.getName();
      savedMail = sharedPrefDB.getMail();

      tvSavedName.setText(savedName);
      tvSavedMail.setText(savedMail);
   }
}