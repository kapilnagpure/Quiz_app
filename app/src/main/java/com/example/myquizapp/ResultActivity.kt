package com.example.myquizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val tvName :TextView= findViewById(R.id.tv_name)
        val tvScore :TextView= findViewById(R.id.tv_score)
        val btnFinish :TextView= findViewById(R.id.btn_finish)

        tvName.text = intent.getStringExtra(Constants.USER_NAME)
        tvScore.text = "You Score ${intent.getIntExtra(Constants.CORRECT_ANSWER,0)} out of ${intent.getIntExtra(Constants.TOTAL_QUESTION,0)}"
btnFinish.setOnClickListener {
    startActivity(Intent(this,MainActivity::class.java))
}
    }
}