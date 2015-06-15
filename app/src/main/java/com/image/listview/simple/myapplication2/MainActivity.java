package com.image.listview.simple.myapplication2;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;


public class MainActivity extends ListActivity  {

    private static final String TAG = "here is listview";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String[] values = new String[] { "A-Team", "Android Studio", "Intent",
                "Fragments", "Design Patterns", "GitHub.com", "Android phones", "College Football",
                "Google I/O 2014 presentation", "Default" };

        String[] values2 = new String[] { "A-Team show theme", "Android Studio tutorial", "Intent definition",
                "Fragments diagram", "Design Patterns definition", "GitHub.com website", "Android phones image", "College Football trivia game",
                "Google I/O 2014 presentation", "Default item slot" };

         MySimpleArrayAdapter adapter = new MySimpleArrayAdapter(this, values, values2);

        setListAdapter(adapter);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        String item = (String) getListAdapter().getItem(position);

        //Toast.makeText(this, item + " selected position: " + position + " id: " + id, Toast.LENGTH_LONG).show();

        Log.e(TAG, "here selected position: " + position + " id: " + id);

        switch (position) {
            case 0:
            //A-Team theme

                Toast.makeText(this, item + " selected item " + position , Toast.LENGTH_LONG).show();

                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=wyz_2DEah4o")));

                break;

            case 1:
             //Android Studio tutorial

                Toast.makeText(this, item + " selected item " + position , Toast.LENGTH_LONG).show();

                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=nBD4xhH5vIE&list=PLGLfVvz_LVvSPjWpLPFEfOCbezi6vATIh&index=1")));

                break;

            case 2:
                //Intent definition

                Toast.makeText(this, item + " selected item " + position , Toast.LENGTH_LONG).show();

                Intent intentDefIntent = new Intent(MainActivity.this, Intents.class);

                startActivity(intentDefIntent);

                break;


            case 3:
                //Fragments diagram

                Toast.makeText(this, item + " selected item " + position , Toast.LENGTH_LONG).show();

                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://developer.xamarin.com/guides/android/platform_features/fragments/part_1_-_creating_a_fragment/Images/fragment_lifecycle.png")));

                break;

            case 4:
                //Design Patterns definition

                Toast.makeText(this, item + " selected item " + position , Toast.LENGTH_LONG).show();

                Intent designPatterns = new Intent(MainActivity.this, DesignPatterns.class);

                startActivity(designPatterns);

                break;

            case 5:
                //GitHub.com

                Toast.makeText(this, item + " selected item " + position , Toast.LENGTH_LONG).show();

                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/")));

                break;

            case 6:
                 //Android phones image

                Toast.makeText(this, item + " selected item " + position , Toast.LENGTH_LONG).show();

                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.mailinmobile.com/blog/wp-content/uploads/2014/04/are-there-too-many-android-phones-video.jpg")));

                break;

            case 7:
                //College Football Trivia Game

                Toast.makeText(this, item + " selected item " + position , Toast.LENGTH_LONG).show();

                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.collegefootball.triviagame&hl=en")));

                break;

            case 8:
                //Google I/O 2014 presentation

                Toast.makeText(this, item + " selected item " + position , Toast.LENGTH_LONG).show();

                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("")));

                break;

            default:
                Toast.makeText(this, item + " default selected item " + position , Toast.LENGTH_LONG).show();
            break;
        }
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
}