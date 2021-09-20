package com.mki.AndroidAnalyticsFFI1;

import android.content.Intent;
import android.util.Log;

import com.konylabs.android.KonyMain;
import com.konylabs.vm.Function;

public class konyAdapter {

    //    public static void getActivity(){
//        Intent i = new Intent(Konymain.this,MainActivity.class);
//        Konymain.startActivity(i);
//    }
    static Function callbackTestKony  ;

    public static void initializectosSDK(Function callback) {
        MainActivity.mainCallback = callback;
        KonyMain context;
        context = KonyMain.getActivityContext();
        Log.d("InvokeCalled","===> InvokeMain called");
        if(context != null){

            Intent intent = new Intent(context, MainActivity.class);

            context.startActivity(intent);
            KonyMain.getActivityContext().startActivity(intent);

        }
    }
}
