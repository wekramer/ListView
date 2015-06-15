package com.image.listview.simple.myapplication2;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class Intents extends Activity implements OnClickListener{

		/* (non-Javadoc)
		 * @see android.app.Activity#onCreate(android.os.Bundle)
		 */

    private static final String TAG = "intents";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Log.e(TAG, "here is Intents " );

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_intent);

        Button exit = (Button) findViewById(R.id.exit);
        exit.setOnClickListener(this);

        String ActivityDef = "Intent message passing mechanism between components in android except content provivders and can start new screen/UI........... sticky intent sticks with android for future broadcast listeners............. pending intent used when someone wants to fire an intent in the future and may be at the time the app is not alive. ";

        TextView activityDef = (TextView)findViewById(R.id.activity_intent_tv);

        activityDef.setText(ActivityDef);

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

