package com.yak77.la3android.tasks;

public interface Task<T> {
    void execute(TaskListener<T> listener);
    void cancel();
}
