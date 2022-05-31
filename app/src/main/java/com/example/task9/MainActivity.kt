package com.example.task9

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.work.OneTimeWorkRequestBuilder
import androidx.work.WorkManager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val fWorker = OneTimeWorkRequestBuilder<fWorker>()
            .build()
        val sWorker = OneTimeWorkRequestBuilder<sWorker>()
            .build()

        WorkManager.getInstance(this)
            .beginWith(fWorker)
            .then(sWorker)
            .enqueue()
    }
}