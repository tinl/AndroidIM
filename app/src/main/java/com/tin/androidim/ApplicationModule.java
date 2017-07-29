package com.tin.androidim;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by tin on 2017/7/29 0029.
 */

@Module
public class ApplicationModule {

    private Context context;

    public ApplicationModule(Context context) {

        this.context = context;
    }

    @Provides
    @Singleton
    public IMApplication provideApplication(){

        return (IMApplication) context.getApplicationContext();
    }

    @Provides
    @Singleton
    public Context provideContext(){

        return context;
    }
}
