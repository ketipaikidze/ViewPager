package com.example.myapplication5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TableLayout
import androidx.viewpager2.widget.ViewPager2
import com.example.myapplication5.fragments.adapter.ViewPagerAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    private lateinit var Tab : TabLayout
    private lateinit var ViewPager : ViewPager2
    private lateinit var ViewPagerAdapter : ViewPagerAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Tab = findViewById(R.id.Tab)
        ViewPager = findViewById(R.id.ViewPager)
        ViewPagerAdapter = ViewPagerAdapter(this)

        ViewPager.adapter = ViewPagerAdapter

        TabLayoutMediator(Tab, ViewPager){ tab, position ->
            tab.text = "Tab" + (position + 1)

        }.attach()
    }
}