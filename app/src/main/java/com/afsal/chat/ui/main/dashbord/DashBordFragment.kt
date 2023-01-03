package com.afsal.chat.ui.main.dashbord

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.afsal.chat.R
import com.afsal.chat.databinding.FragmentDashBordBinding
import com.afsal.chat.ui.main.BaseFragment
import com.afsal.chat.ui.main.ViewPageAdapter
import com.google.android.material.tabs.TabLayoutMediator

class DashBordFragment :BaseFragment<FragmentDashBordBinding>(
    FragmentDashBordBinding::inflate
) {




    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val fragmentAdapter= ViewPageAdapter(requireActivity().supportFragmentManager,lifecycle)

        val viewPager: ViewPager2 = binding.viewPager
        viewPager.adapter = fragmentAdapter             //sectionsPagerAdapter
//        val tabs: TabLayout = binding.tabs
//        tabs.setupWithViewPager(viewPager)

        TabLayoutMediator(binding.tabs,binding.viewPager){tab,position->
            when (position) {
                0 -> {
                    tab.text = "Chats"


                }
                1 -> {
                    tab.text = "Status"
                }
                2 -> {
                    tab.text = "Calls"
                }


            }

        }.attach()

    }


}