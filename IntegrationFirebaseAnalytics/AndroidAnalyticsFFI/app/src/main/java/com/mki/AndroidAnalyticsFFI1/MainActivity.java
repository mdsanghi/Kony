package com.mki.AndroidAnalyticsFFI1;

import android.os.Bundle;

import com.konylabs.android.KonyMain;
import com.konylabs.vm.Function;

import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import android.widget.Toolbar;

import androidx.appcompat.app.AppCompatActivity;
import com.google.firebase.analytics.FirebaseAnalytics;

public class MainActivity extends AppCompatActivity {
    public static Function mainCallback = null;
    private FirebaseAnalytics mFirebaseAnalytics;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);

        // Obtain the FirebaseAnalytics instance.
        //mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public void analyticslogEvent(String event, String param , String paramValue){
        Log.d("--->>>","Inside analyticslogEvent");
        Toast.makeText(KonyMain.getActivityContext(), paramValue, Toast.LENGTH_SHORT).show();
        Log.d("--->>>","KonyMain.getActContext()"+ KonyMain.getActivityContext());
        mFirebaseAnalytics = FirebaseAnalytics.getInstance(KonyMain.getActivityContext());
        Log.d("--->>>","mFirebaseAnalytics"+ mFirebaseAnalytics);
        //Bundle bundle = new Bundle();
        Bundle params = new Bundle();
        params.putString(param, paramValue);
        Log.d("--->>>","param:"+param +" paramValue:"+paramValue);
        mFirebaseAnalytics.logEvent(event, params);
        Log.d("--->>>","Firebase called");
    }
//    public void initializeFirebaseInstace() {
//        mFirebaseAnalytics = FirebaseAnalytics.getInstance(KonyMain.getActivityContext());
//
//    }
    public void onbtnClick(View view){
        Log.d("--->>>","onbtnClick");
        mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);
        if (view.getId() == R.id.goBack) {
            Toast.makeText(this, "Go back clicked !!!", Toast.LENGTH_SHORT).show();

            //Bundle bundle = new Bundle();
            Bundle params = new Bundle();
            params.putString("go_back", "Go back clicked !!!");
            params.putString("force_update", "yes");
            mFirebaseAnalytics.logEvent("go_back", params);

            //mFirebaseAnalytics.logEvent(FirebaseAnalytics.Event.SELECT_CONTENT, bundle);
        }
        else if(view.getId() == R.id.dashboardClicked){
            Toast.makeText(this, "Dashboard clicked !!!", Toast.LENGTH_SHORT).show();

            Bundle bundle = new Bundle();
            bundle.putString(FirebaseAnalytics.Param.ITEM_ID,"dashboard_clicked");
            bundle.putString(FirebaseAnalytics.Param.ITEM_NAME, "Dashboard clicked !!!");
            bundle.putString(FirebaseAnalytics.Param.SCREEN_NAME, "frmDashboard");
            //mFirebaseAnalytics.logEvent(FirebaseAnalytics.Event.SELECT_CONTENT, bundle);
            mFirebaseAnalytics.logEvent("click_dashboard", bundle);
        }
        else if(view.getId() == R.id.addFavourite){
            Toast.makeText(this, "Add favourite clicked !!!", Toast.LENGTH_SHORT).show();

            Bundle bundle = new Bundle();
            bundle.putString(FirebaseAnalytics.Param.ITEM_ID,"add_favourite");
            bundle.putString(FirebaseAnalytics.Param.ITEM_NAME, "Add favourite clicked !!!");
            bundle.putString(FirebaseAnalytics.Param.CONTENT_TYPE, "Text");
            bundle.putString(FirebaseAnalytics.Param.SCREEN_NAME, "frmFavourite");
            //mFirebaseAnalytics.logEvent(FirebaseAnalytics.Event.SELECT_CONTENT, bundle);
            mFirebaseAnalytics.logEvent("add_favourite", bundle);
        }
        else if(view.getId() == R.id.crashApp){
           // Toast.makeText(this, "Crash app clicked !!!", Toast.LENGTH_SHORT).show();
            throw new RuntimeException("Test Crash");
        }





        //Code Written by Mayank---Start
//        Toast.makeText(this, "FFI is working",Toast.LENGTH_LONG).show();
//        String returndata[] = new String[1];
//        returndata[0] = "Returning Data from Android project to Kony";
//        try {
//            mainCallback.execute(returndata);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        //finish();
        //Code Written by Mayank---End
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
