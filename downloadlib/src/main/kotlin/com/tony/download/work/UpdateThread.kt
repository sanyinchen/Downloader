/*
 * Copyright (C) 2016 Baidu, Inc. All Rights Reserved.
 */
package com.tony.download.work

import android.app.AlarmManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.os.Process
import com.tony.download.facade.SystemFacadeInterface

/**
 * Created by sanyinchen on 16/12/27.
 */
class UpdateThread : Thread() {


    var mPendingUpdate: Boolean = true;

    lateinit var service: DownloadService;

    lateinit var systeFade: SystemFacadeInterface;

    // lateinit var context: Context;

    companion object watch;


    override fun run() {
        Process.setThreadPriority(Process.THREAD_PRIORITY_BACKGROUND);
        var keepService = false;

        var wakeUp = Long.MAX_VALUE;
        while (true) {
            synchronized(watch) {

                if (!mPendingUpdate) {
                    if (!keepService) {
                        service?.stopSelf();
                    }
                    if (wakeUp != Long.MAX_VALUE) {
                        shceduleAlarm(wakeUp);
                    }

                    return;

                }
                mPendingUpdate = false;
            }
            var now = systeFade.currentTimeMills();
            keepService = false;
            wakeUp = Long.MAX_VALUE;


        }


    }

    private fun shceduleAlarm(wakeUpTime: Long) {
        var alarmManager = service.getSystemService(Context.ALARM_SERVICE) as AlarmManager;
        var intent = Intent();
        intent.setClassName(service.packageName, DownloadService::class.java.name);
        alarmManager?.set(AlarmManager.RTC_WAKEUP, systeFade.currentTimeMills() + wakeUpTime,
                PendingIntent.getBroadcast(service, 0, intent, PendingIntent.FLAG_ONE_SHOT));
    }
}