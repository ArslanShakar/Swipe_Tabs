package com.practice.coding.swipetabmypractice;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class FragmentA extends Fragment implements View.OnClickListener{
    private TextView tvCount;
    private Button btCounter;
    private int counter = 0;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_a, container, false);
        tvCount = view.findViewById(R.id.tvCount);

        btCounter = view.findViewById(R.id.btCounter);
        btCounter.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {

        switch (v.getId())
        {
            case R.id.btCounter:
                counter++;
                tvCount.setText("Counter = "+counter);
                break;
        }
    }
}
