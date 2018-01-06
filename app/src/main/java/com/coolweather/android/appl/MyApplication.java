package com.coolweather.android.appl;

import android.app.Application;
import android.content.Context;

/**
 * Created by cy on 2018/1/5.
 */

public class MyApplication extends Application {

    private Context mContext;
    public MyApplication(Context context) {
        this.mContext = context;
    }


}
