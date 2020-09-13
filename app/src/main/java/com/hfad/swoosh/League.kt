package com.hfad.swoosh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_league.*

class League : BaseActivity() {

    var selectedLeague = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun onMensClicked(view:View){
        womenLegueBtn.isChecked = false
        coedLeagueBtn.isChecked = false

        selectedLeague = "mens"
    }
    fun onWomensClicked(view: View){
        mensLeagueBatton.isChecked = false
        coedLeagueBtn.isChecked = false

        selectedLeague = "women"
    }

    fun onCoedClicked(view: View){
        mensLeagueBatton.isChecked = false
        womenLegueBtn.isChecked = false

        selectedLeague = "co-ed"
    }

    fun leagueNextClicked(view: View){
        if (selectedLeague != ""){
            val skillIntent = Intent(this, SkillActivity::class.java)
            skillIntent.putExtra(EXTRA_LEAGUE, selectedLeague)
            startActivity(skillIntent)
        } else {
            Toast.makeText(this, "Please select a league", Toast.LENGTH_SHORT).show()
        }

    }

}