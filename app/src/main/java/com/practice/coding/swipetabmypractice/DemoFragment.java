package com.practice.coding.swipetabmypractice;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class DemoFragment extends Fragment {
    private TextView tvTitle;
    public DemoFragment()
    {

    }

    public static DemoFragment newInstance(int fragmentNo)
    {
        DemoFragment fragment = new DemoFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("DATA_KEY", fragmentNo);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_demo, container, false);
        tvTitle = view.findViewById(R.id.tvFragment);
        //tvTitle.setText(getArguments().getString("DATA_KEY"));
        //OR
        tvTitle.setText("Fragment : "+getArguments().getInt("DATA_KEY"));
        return view;
    }
}
