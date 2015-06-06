package com.app.portfolio;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    public void openSpotifyStreamer(View view) {
        showToasty("This button will launch spotify streamer app");
    }

    public void openScoresApp(View view) {
        showToasty("This button will launch scores app");
    }

    public void openLibraryApp(View view) {
        showToasty("This button will launch library app");
    }

    public void openBuildItBigger(View view) {
        showToasty("This button will launch build it bigger app");
    }

    public void openBaconReader(View view) {
        showToasty("This button will launch bacon reader app");
    }

    public void openCapstone(View view) {
        showToasty("This button will launch my own app");
    }

    private void showToasty(CharSequence text) {
        Context context = getApplicationContext();
        Toast.makeText(context, text, Toast.LENGTH_SHORT).show();
    }

}
