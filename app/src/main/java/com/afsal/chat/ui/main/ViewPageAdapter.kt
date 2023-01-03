package com.afsal.chat.ui.main

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.afsal.chat.ui.main.chat.ContactsFragment

class ViewPageAdapter(fm:FragmentManager,lifecycle: Lifecycle):FragmentStateAdapter(fm,lifecycle) {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {

        return when(position){
            0->{
              ContactsFragment()
            }
            1->{
              StatusFragment()
            }
            2->{
                CallsFragment()
            }
            else ->{
                Fragment()
            }
        }

    }
}