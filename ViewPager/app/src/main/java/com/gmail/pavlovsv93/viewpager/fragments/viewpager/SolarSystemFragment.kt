package com.gmail.pavlovsv93.viewpager.fragments.viewpager

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.gmail.pavlovsv93.viewpager.databinding.FragmentEarthBinding
import com.gmail.pavlovsv93.viewpager.databinding.FragmentSolarSystemBinding

class SolarSystemFragment: Fragment(){

    private var _binding : FragmentSolarSystemBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSolarSystemBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    companion object{
        fun newInstance() = SolarSystemFragment()
    }

}