package com.hfad.swoosh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {
    var league = ""
    var selectedBtn = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        league = intent.getStringExtra(EXTRA_LEAGUE).toString()
    }

    fun onBeginnerClick(view: View){
        ballerToggleBtn.isChecked = false
        selectedBtn = "Beginner"
    }

    fun onBallerClick(view: View){
        beginnerToggleBtn.isChecked = false

        selectedBtn = "Baller"
    }
}