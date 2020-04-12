package com.yak77.la3android.tasks;

public interface TaskListener<T> {
    void onSuccess(T result);
    void onError(Throwable error);
}
