package com.wanglj.androidarchitecture.module.login;

import dagger.Subcomponent;

@Subcomponent(modules = LoginModule.class)
public interface LoginComponent {
    LoginActivity inject(LoginActivity loginActivity);
}
