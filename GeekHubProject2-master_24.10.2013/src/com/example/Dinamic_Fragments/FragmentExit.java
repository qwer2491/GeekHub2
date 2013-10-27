package com.example.Dinamic_Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

/**
 * Created with IntelliJ IDEA.
 * User: Sergey
 * Date: 23.10.13
 * Time: 23:18
 * To change this template use File | Settings | File Templates.
 */
public class FragmentExit extends Fragment {

    Button buttExitProgram;
    Animation rotate;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.exit,container,false);
       buttExitProgram = (Button) view.findViewById(R.id.buttExitProgram);
        rotate = AnimationUtils.loadAnimation(getActivity(), R.anim.rotate);

        buttExitProgram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                buttExitProgram.startAnimation(rotate);

                     getActivity().finish();



    }
});
        return  view;
    }
}
