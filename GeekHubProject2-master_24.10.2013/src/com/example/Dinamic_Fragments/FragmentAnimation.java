package com.example.Dinamic_Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created with IntelliJ IDEA.
 * User: Sergey
 * Date: 24.10.13
 * Time: 22:09
 * To change this template use File | Settings | File Templates.
 */
public class FragmentAnimation extends Fragment  implements Animation.AnimationListener{
    Button buttAnim;
    Animation blink;
    TextView tvAnimat2;

    @Override
    public void onAnimationStart(Animation animation) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void onAnimationEnd(Animation animation) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void onAnimationRepeat(Animation animation) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
            View view = inflater.inflate(R.layout.animation,container,false);

            buttAnim = (Button) view.findViewById(R.id.buttAnim);
            tvAnimat2 =(TextView) view.findViewById(R.id.tvAnimat2);
            blink = AnimationUtils.loadAnimation(getActivity(), R.anim.blink);
             blink.setAnimationListener(this);

            tvAnimat2.startAnimation(blink);

            buttAnim.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    tvAnimat2.setText("Hello in my program");
                    buttAnim.startAnimation(blink);
                }
            });


            return  view;



    }

}
