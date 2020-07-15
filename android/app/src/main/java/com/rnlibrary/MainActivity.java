package com.rnlibrary;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.rnlib.MySDK;
import com.facebook.react.ReactActivity;

//public class MainActivity extends ReactActivity {
//
//  /**
//   * Returns the name of the main component registered from JavaScript. This is used to schedule
//   * rendering of the component.
//   */
//  @Override
//  protected String getMainComponentName() {
//    return "RNLibrary";
//  }
//}

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
  }

  public void buttonClickFunction(View v)
  {
    MySDK.getInstance().startReactApp(MainActivity.this);
  }
}
