package com.fred.template;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.meituan.android.walle.WalleChannelReader;

public class MainActivity extends AppCompatActivity {

    private String TAG = "FRED_MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        String channelName = WalleChannelReader.getChannel(getApplicationContext(),"dev");

        Log.e(TAG,"packageName:"+BuildConfig.APPLICATION_ID);
        Log.e(TAG,"channelName:"+channelName);
        Log.e(TAG,"versionCode:"+ BuildConfig.VERSION_CODE);
        Log.e(TAG,"versionName:"+ BuildConfig.VERSION_NAME);
        Log.e(TAG,"buildType:"+ BuildConfig.BUILD_TYPE);
        Log.e(TAG,"gitHash:"+ BuildConfig.GIT_HASH);
        Log.e(TAG,"appName:"+ BuildConfig.APP_NAME);
        Log.e(TAG,"appDesc:"+ BuildConfig.APP_DESC);
        Log.e(TAG,"releaseNotes:"+ BuildConfig.APP_RELEASE_NOTES);
        Log.e(TAG,"buildTime:"+ BuildConfig.BUILD_TIME);

        String content = "";
        content += ("packageName:"+BuildConfig.APPLICATION_ID) + "\n";
        content += ("channelName:"+channelName)+ "\n";
        content += ("versionCode:"+ BuildConfig.VERSION_CODE)+ "\n";
        content += ("versionName:"+ BuildConfig.VERSION_NAME)+ "\n";
        content += ("buildType:"+ BuildConfig.BUILD_TYPE)+ "\n";
        content += ("gitHash:"+ BuildConfig.GIT_HASH)+ "\n";
        content += ("appName:"+ BuildConfig.APP_NAME)+ "\n";
        content += ("appDesc:"+ BuildConfig.APP_DESC)+ "\n";
        content += ("releaseNotes:"+ BuildConfig.APP_RELEASE_NOTES)+ "\n";
        content += ("buildTime:"+ BuildConfig.BUILD_TIME)+ "\n";

        TextView appinfo = findViewById(R.id.info);
        appinfo.setText(content);
    }
}