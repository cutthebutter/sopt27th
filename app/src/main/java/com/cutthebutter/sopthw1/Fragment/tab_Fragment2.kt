package com.cutthebutter.sopthw1.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.cutthebutter.sopthw1.R


class tab_Fragment2 : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_tab_2, container, false)
//        val textView = view.findViewById<TextView>(R.id.fragment1)
//        textView.text = name

        return view
    }


}