package com.example.sharedpreferencesexample;

import android.content.Context;
import android.content.SharedPreferences;

public class SharedPrefDB {
   private final String KEY_IS_SET_NAME = "key_is_set_name";
   private final String KEY_IS_SET_MAIL = "key_is_set_mail";

   private Context context;
   private SharedPreferences sharedPref;
   private SharedPreferences.Editor editor;

   public SharedPrefDB(Context context) {
      this.context = context;
      sharedPref = context.getSharedPreferences("com.example.sharedpreferencesexamle",
              Context.MODE_PRIVATE);
      editor = sharedPref.edit();
   }

   public String getValueString(String key, String defaultValue) {
      return sharedPref.getString(key, defaultValue);
   }

   public void setValueString(String key, String value) {
      editor.putString(key, value);
      editor.apply();
   }

   public int getValueInt(String key, int defaultValue) {
      return sharedPref.getInt(key, defaultValue);
   }

   public void setValueInt(String key, int value) {
      editor.putInt(key, value);
      editor.apply();
   }

   public Boolean getValueBoolean(String key, Boolean defaultValue) {
      return sharedPref.getBoolean(key, defaultValue);
   }

   public void setValueBoolean(String key, Boolean value) {
      editor.putBoolean(key, value);
      editor.apply();
   }

   public String getName() {
      return getValueString(KEY_IS_SET_NAME, "");
   }

   public void setName(String name) {
      setValueString(KEY_IS_SET_NAME, name);
   }

   public String getMail() {
      return getValueString(KEY_IS_SET_MAIL, "");
   }

   public void setMail(String mail) {
      setValueString(KEY_IS_SET_MAIL, mail);
   }
}
