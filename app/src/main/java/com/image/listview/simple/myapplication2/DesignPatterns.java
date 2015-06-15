package com.image.listview.simple.myapplication2;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class DesignPatterns extends Activity implements OnClickListener{

		/* (non-Javadoc)
		 * @see android.app.Activity#onCreate(android.os.Bundle)
		 */

    private static final String TAG = "DesignPatterns";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Log.e(TAG, "here is DesignPatterns " );

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_design_patterns);

        Button exit = (Button) findViewById(R.id.exit);
        exit.setOnClickListener(this);

        String ActivityDef = "Design patterns provide consistent and predictable functionality. Some design patterns in android .... gestures and navigation and action bar and multitpane layouts and swipe views and full screen. ";

        TextView activityDesinPattern = (TextView)findViewById(R.id.design_patterns);

        activityDesinPattern.setText(ActivityDef);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.exit:
                finish();
                break;
        }
    }

}


