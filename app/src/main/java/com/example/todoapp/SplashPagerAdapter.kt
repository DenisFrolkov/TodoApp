package com.example.todoapp

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
class SplashPagerAdapter (
    val fragment: Fragment,
): FragmentStateAdapter(fragment){
    private val fragmentList = listOf<Fragment>(
        SplashOneFragment(),
        SplashTwoFragment(),
    )
    override fun getItemCount() = fragmentList.size
    override fun createFragment(position: Int): Fragment {
        return  fragmentList[position]
    }
}