package com.example.bookmark

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.example.bookmark.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var mBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = DataBindingUtil.setContentView(this,R.layout.activity_main)
//        setContentView(R.layout.activity_main)

        //네비게이션을 담는 호스트
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.my_nav_host) as NavHostFragment
        //네베게이션 컨트롤러
        val navController = navHostFragment.navController

        //바텀 네비게이션 뷰 와 네비게이션을 묶어줍니다.
        NavigationUI.setupWithNavController(mBinding.bottomNavigationView, navController)

    }
}