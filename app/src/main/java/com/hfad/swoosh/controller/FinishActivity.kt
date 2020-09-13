package com.hfad.swoosh.controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hfad.swoosh.EXTRA_LEAGUE
import com.hfad.swoosh.EXTRA_SKILL
import com.hfad.swoosh.R
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val league = intent.getStringExtra(EXTRA_LEAGUE)
        var skill = intent.getStringExtra(EXTRA_SKILL)

        searchLeaguesText.text = "Looking for $league $skill league near you..."
    }
}