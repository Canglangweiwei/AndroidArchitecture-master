package com.wanglj.androidarchitecture.module.login;


import com.wanglj.androidarchitecture.data.local.PreferencesManager;
import com.wanglj.androidarchitecture.data.remote.ApiManager;
import com.wanglj.androidarchitecture.utils.Validator;

import dagger.Module;
import dagger.Provides;

@SuppressWarnings("ALL")
@Module
public class LoginModule {

    private final LoginView loginView;

    public LoginModule(LoginView loginView) {
        this.loginView = loginView;
    }

    @Provides
    LoginView provideLoginView() {
        return loginView;
    }

    @Provides
    Validator provideValidator() {
        return new Validator();
    }

    @Provides
    LoginPresenter provideLoginPresenter(Validator validator, ApiManager apiManager, PreferencesManager preferencesManager) {
        return new LoginPresenter(loginView, validator, apiManager, preferencesManager);
    }
}
