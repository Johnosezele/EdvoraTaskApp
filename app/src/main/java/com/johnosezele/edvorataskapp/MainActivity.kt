package com.johnosezele.edvorataskapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.johnosezele.edvorataskapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()

        val fragment: MainFragment = MainFragment.newInstance()

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .add(R.id.fragment_container, fragment, "fragment_main")
                .commit()
        }
    }
}