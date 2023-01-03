package com.afsal.chat

import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.tabs.TabLayout
import androidx.viewpager.widget.ViewPager
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import androidx.navigation.fragment.NavHostFragment
import androidx.viewpager2.widget.ViewPager2
import com.afsal.chat.ui.main.SectionsPagerAdapter
import com.afsal.chat.databinding.ActivityMainBinding
import com.afsal.chat.ui.main.ViewPageAdapter
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navHostFragment=  supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment

        val navController=navHostFragment.navController

        //   val sectionsPagerAdapter = SectionsPagerAdapter(this, supportFragmentManager)
//      val fragmentAdapter=ViewPageAdapter(supportFragmentManager,lifecycle)
//        val viewPager: ViewPager2 = binding.viewPager
//        viewPager.adapter = fragmentAdapter             //sectionsPagerAdapter
////        val tabs: TabLayout = binding.tabs
////        tabs.setupWithViewPager(viewPager)
//
//        TabLayoutMediator(binding.tabs,binding.viewPager){tab,position->
//            when (position) {
//                0 -> {
//                    tab.text = "Chats"
//
//
//                }
//                1 -> {
//                    tab.text = "Status"
//                }
//                2 -> {
//                    tab.text = "Calls"
//                }
//
//
//            }
//
//        }.attach()
     //   val fab: FloatingActionButton = binding.fab

//        TabLayoutMediator(binding.tabs, binding.viewPager) { tab, position ->
//
//            when (position) {
//                0 -> {
//                    tab.text = "Chats"
//
//
//                }
//                1 -> {
//                    tab.text = "Status"
//                }
//                2 -> {
//                    tab.text = "Calls"
//                }
//
//
//            }
//        }.attach()

//        fab.setOnClickListener { view ->
//            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                .setAction("Action", null).show()
//        }
    }
}