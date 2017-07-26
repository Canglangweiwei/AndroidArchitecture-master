package com.wanglj.androidarchitecture.data.remote;


@SuppressWarnings("ALL")
public interface SimpleCallback<T> {
    void onStart();

    void onNext(T t);

    void onComplete();
}
