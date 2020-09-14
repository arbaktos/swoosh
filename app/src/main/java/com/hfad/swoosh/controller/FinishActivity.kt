package com.hfad.swoosh.controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hfad.swoosh.EXTRA_PLAYER
import com.hfad.swoosh.R
import com.hfad.swoosh.model.Player
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)

        searchLeaguesText.text = "Looking for ${player?.league} ${player?.skill} league near you..."
    }
}