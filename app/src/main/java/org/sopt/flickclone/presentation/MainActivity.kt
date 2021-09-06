package org.sopt.flickclone.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import dagger.hilt.android.AndroidEntryPoint
import org.sopt.flickclone.databinding.ActivityMainBinding

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var viewPager: ViewPager2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        attachViewpagerAdapter()
    }

    private fun attachViewpagerAdapter() {
        viewPager = binding.viewpagerMain
        viewPager.adapter = MainFragmentStateAdapter(this)
        viewPager.setCurrentItem(1, false)
    }

    fun swipeFragment(index: Int, isSmooth: Boolean) {
        viewPager.setCurrentItem(index, isSmooth)
    }
}