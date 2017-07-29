package com.tin.androidim;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by tin on 2017/7/29 0029.
 */

@Singleton
@Component(modules = {ApplicationModule.class})
public interface ApplicationComponent {

    IMApplication getApplication();

    Context getContext();

}
