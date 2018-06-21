package edu.cnm.deepdive.sqliteexample;

import android.app.Application;
import com.facebook.stetho.Stetho;

public class NotesApplication extends Application {
  @Override
  public void onCreate () {
    super.onCreate();
    Stetho.initializeWithDefaults(this);
  }
}
