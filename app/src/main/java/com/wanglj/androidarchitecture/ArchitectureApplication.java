package com.wanglj.androidarchitecture;

import android.app.Application;
import android.content.Context;

import com.wanglj.androidarchitecture.di.AppComponent;
import com.wanglj.androidarchitecture.di.AppModule;
import com.wanglj.androidarchitecture.di.DaggerAppComponent;

public class ArchitectureApplication extends Application {

    private AppComponent appComponent;

    public static ArchitectureApplication get(Context context) {
        return (ArchitectureApplication) context.getApplicationContext();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }
}
