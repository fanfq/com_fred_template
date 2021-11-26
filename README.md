## friendly get android app info



```

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


print

packageName:com.fred.template
channelName:dev
versionCode:1
versionName:1.0
buildType:debug
gitHash:7e3db12
appName:appname_abc_here,(english only)
appDesc:hello,about app decs,(english only)
releaseNotes:hello,about app release notes,(english only)
buildTime:2021-11-26 11:36:04

```


## depends

[walle 多渠道打包]( https://github.com/Meituan-Dianping/walle)