package com.example.manageu

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity(), DashboardFragment.OnFragmentInteractionListener, TaskFragment.OnFragmentInteractionListener, StatsFragment.OnFragmentInteractionListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // set up bottom nav with nav controller (nav host)
        val bottomNavigation: BottomNavigationView = findViewById(R.id.bottomNavigationView)
        val navController: NavController = Navigation.findNavController(this, R.id.nav_host_fragment)
        NavigationUI.setupWithNavController(bottomNavigation, navController)
    }

    // override from the fragment classes
    override fun onFragmentInteraction(uri: Uri) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
