package com.example.manageu

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.manageu.fragments.DashboardFragment
import com.example.manageu.fragments.StatsFragment
import com.example.manageu.fragments.TaskFragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dashFragment = DashboardFragment()
        val statsFragment = StatsFragment()
        val taskFragment = TaskFragment()

        makeCurrentFragment(dashFragment)

        bottomNavigationView.setOnNavigationItemSelectedListener {
            when (it.itemId){
                R.id.ic_dash -> makeCurrentFragment(dashFragment)
                R.id.ic_stats -> makeCurrentFragment(statsFragment)
                R.id.ic_tasks -> makeCurrentFragment(taskFragment)
            }
            true
        }

    }

    private fun makeCurrentFragment(fragment: Fragment) =
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fl_wrapper, fragment)
            commit()
        }

}
