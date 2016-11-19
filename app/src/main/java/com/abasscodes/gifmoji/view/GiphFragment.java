package com.abasscodes.gifmoji.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.abasscodes.gifmoji.Mvc;
import com.abasscodes.gifmoji.R;

/**
 * Created by C4Q on 11/19/16.
 */

public class GiphFragment extends Fragment implements Mvc.View{

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_giph, container, false);
    }

    @Override
    public void onClick(View view) {

    }
}
