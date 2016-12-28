/*
 * Copyright (C) 2016 Baidu, Inc. All Rights Reserved.
 */
package com.tony.download.work

import android.app.Service
import android.content.Intent
import android.os.IBinder
import com.tony.download.data.DownloadObserveInterface
import com.tony.download.facade.SystemFacadeImpl
import com.tony.download.facade.SystemFacadeInterface
import java.util.*

/**
 * Created by sanyinchen on 16/12/23.
 */
class DownloadService : Service() {

    val changeListener: HashSet<DownloadObserveInterface> by  lazy { HashSet<DownloadObserveInterface>() };


    val observer: DownloadObserveInterface by lazy {
        object : DownloadObserveInterface {
            override fun onChange() {
                updateFromDataBase();
            }
        }

    }

    val systemFade: SystemFacadeInterface by lazy {
        SystemFacadeImpl(this);
    }

    fun addListener(listener: DownloadObserveInterface) {
        synchronized(this) {
            if (listener != null) {
                changeListener.add(listener);
            }

        }
    }

    fun updateFromDataBase() {

    }

    override fun onBind(intent: Intent?): IBinder {
        throw UnsupportedOperationException("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


    override fun onCreate() {

        addListener(observer);
        updateFromDataBase();
        val updateThread = UpdateThread();

        updateThread?.apply {
            mPendingUpdate = true;
        }

        systemFade.startThread(updateThread);
    }

}