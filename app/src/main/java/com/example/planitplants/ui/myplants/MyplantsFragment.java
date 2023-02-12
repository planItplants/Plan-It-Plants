package com.example.planitplants.ui.myplants;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.planitplants.databinding.FragmentMyplantsBinding;


public class MyplantsFragment extends Fragment {

private FragmentMyplantsBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
            ViewGroup container, Bundle savedInstanceState) {
        MyplantsViewModel myplantsViewModel =
                new ViewModelProvider(this).get(MyplantsViewModel.class);

    binding = FragmentMyplantsBinding.inflate(inflater, container, false);
    View root = binding.getRoot();

        final TextView textView = binding.textMyplants;
        myplantsViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

@Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}