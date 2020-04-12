package com.yak77.la3android;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.yak77.la3android.tasks.MainViewState;

import com.yak77.la3android.tasks.Task;
import com.yak77.la3android.tasks.TaskListener;

public class RetainFragment extends Fragment {


public static final String TAG = RetainFragment.class.getSimpleName();
private MainViewState mainViewState = new MainViewState();
private MainStateListener listener;
private Task<Integer> currentTask;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRetainInstance(true);

    }

    public MainViewState getMainViewState() {
        return mainViewState;
    }
    public void setListener(MainStateListener listener) {
this.listener = listener;
if (listener !=null) {
    listener.onNewState(mainViewState);
}
    }
public void generateNumber(int bottomBound,int topBound){
currentTask = createGenerateNumberTask();

currentTask.execute(new TaskListener<Integer>() {
    @Override
    public void onSuccess(Integer result) {

    }

    @Override
    public void onError(Throwable error) {
        Log.e(TAG, "Error!",error);
    }
});
}
private void updateState() {
        if (listener !=null) {listener.onNewState(mainViewState);}
}
private Task<Integer> createGenerateNumberTask(){
        //
        return null;
}

    public interface MainStateListener {
void onNewState(MainViewState state);
    }
}
