/*
 * Copyright (C) 2016 Baidu, Inc. All Rights Reserved.
 */
package com.tony.download.fade

import android.content.Context
import android.content.Intent
import android.net.ConnectivityManager

/**
 * Created by sanyinchen on 16/12/22.
 */
class SystemFadeImpl(val mcontext: Context) : SystemFadeInterface {

    override fun getActiveNetworkType(): Int {
        val connectManager = mcontext.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager;

        val netWorkInfo = connectManager?.activeNetworkInfo;

        return netWorkInfo?.type ?: -1;
    }

    override fun currentTimeMills(): Long {
        return System.currentTimeMillis();
    }

    override fun sendBroadcast(intent: Intent) {
        throw UnsupportedOperationException("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun startThread(thread: Thread) {
        thread?.start();
    }

}