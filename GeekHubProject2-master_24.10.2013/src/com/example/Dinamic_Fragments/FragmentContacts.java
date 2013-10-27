package com.example.Dinamic_Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created with IntelliJ IDEA.
 * User: Sergey
 * Date: 23.10.13
 * Time: 23:17
 * To change this template use File | Settings | File Templates.
 */
public class FragmentContacts extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.contacts,container,false);
        return  view;
    }
}
