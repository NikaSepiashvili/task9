package com.example.task9

import android.content.Context
import androidx.work.Worker
import androidx.work.WorkerParameters

class sWorker(ctx: Context, params: WorkerParameters) : Worker(ctx, params) {
    override fun doWork(): Result {
        doSecondWorker(this.javaClass.name);
        val information = inputData.getString("KEY");
        println(information)
        return Result.success();
    }
}