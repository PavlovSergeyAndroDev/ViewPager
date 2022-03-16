package com.gmail.pavlovsv93.viewpager

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.gmail.pavlovsv93.viewpager.fragments.viewpager.EarthFragment
import com.gmail.pavlovsv93.viewpager.fragments.viewpager.MarsFragment
import com.gmail.pavlovsv93.viewpager.fragments.viewpager.SolarSystemFragment

class ViewPagerAdapter(fm : FragmentManager) : FragmentStatePagerAdapter(fm) {

    val fragmentList = listOf(EarthFragment(), MarsFragment(), SolarSystemFragment())

    override fun getCount(): Int = fragmentList.size

    override fun getItem(position: Int): Fragment = fragmentList[position]
}