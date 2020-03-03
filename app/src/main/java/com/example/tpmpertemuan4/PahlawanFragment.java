package com.example.tpmpertemuan4;


import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class PahlawanFragment extends Fragment  {
    private RecyclerView recyclerView;
    private ArrayList<modelPahlawan> modelPahlawans =new ArrayList<>();
    public PahlawanFragment() {
        // Required empty public constructor

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
//        Intent intent= new Intent(getActivity(), Main3Activity.class);
//        getContext().startActivity(intent);
        View A= inflater.inflate(R.layout.fragment_pahlawan, container, false);
        super.onCreate(savedInstanceState);

        recyclerView=A.findViewById(R.id.rvPahlawan);
        recyclerView.setHasFixedSize(true);
        modelPahlawans.addAll(dataPahlawan.getListData());

        showRecyclerList();
        // Inflate the layout for this fragment
        return A;

    }
    private void showRecyclerList(){
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        AdapterPahlawan adapterPahlawan= new AdapterPahlawan(getContext());
        adapterPahlawan.setModelPahlawans(modelPahlawans)
        ;
        recyclerView.setAdapter(adapterPahlawan);
    }




}
