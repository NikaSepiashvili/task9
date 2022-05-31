package com.example.task9

import android.content.Context
import androidx.work.Data
import androidx.work.Worker
import androidx.work.WorkerParameters

class fWorker(ctx: Context, params: WorkerParameters) : Worker(ctx, params) {
    override fun doWork(): Result {

        doFirstWorker(this.javaClass.name);

        val text = "information";
        val data = Data.Builder()
            .putString("KEY", text)
            .build()

        return Result.success(data);
    }
}