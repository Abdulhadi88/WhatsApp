package com.example.whatsappclone.activity

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.whatsappclone.R

class PlaceHolderFragment : Fragment() { companion object {
    private val ARG_SECTION_NUMBER = "section_number"
    fun newIntent(sectionNumber: Int): PlaceHolderFragment {
        val fragment = PlaceHolderFragment()
        val args = Bundle() // mengikat data untuk dikirimkan bersamaan args.putInt(ARG_SECTION_NUMBER, sectionNumber) // mengirimkan data fragment.arguments = args
        return fragment
    } }
    // memasangkan tampilan dari layout dengan menggunakan LayoutInflater
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.fragment_main, container, false) rootView.section_label.text =
        "Hello world, from section ${arguments?.getInt(ARG_SECTION_NUMBER)}" return rootView
    } }