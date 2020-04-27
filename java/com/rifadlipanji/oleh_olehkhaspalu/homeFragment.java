package com.rifadlipanji.oleh_olehkhaspalu;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class homeFragment extends Fragment {
    private RecyclerView rvArtikel;
    private ArrayList<artikel> list = new ArrayList<>();
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private String mParam1;
    private String mParam2;

    public static homeFragment newInstance(String param1, String param2) {
        homeFragment fragment = new homeFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home,container,false);
        rvArtikel = (RecyclerView) view.findViewById(R.id.rv_artikel);
        rvArtikel.setLayoutManager(new LinearLayoutManager(getContext()));
        artikelAdapter ArtikelAdapter = new artikelAdapter(list);
        rvArtikel.setAdapter(ArtikelAdapter);
        rvArtikel.setHasFixedSize(true);
        list.addAll(artikelData.getListData());
        ArtikelAdapter.setOnItemClickCallback(new artikelAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(artikel data) {
                lihatPilihanArtikel(data);
            }
        });
        return view;
    }

    private void lihatPilihanArtikel(artikel Artikel){
        Intent intent = new Intent(getActivity(),artikelDetail.class);
        intent.putExtra(artikelDetail.JUDUL,Artikel.getJudul());
        intent.putExtra(artikelDetail.ISI,Artikel.getIsi());
        intent.putExtra(artikelDetail.FOTO_ARTIKEL,Artikel.getFotoProfil());
        startActivity(intent);
    }
}
