/*
 * Copyright (C) 2016 Baidu, Inc. All Rights Reserved.
 */
package com.tony.download.facade

import android.content.Intent

/**
 * Created by sanyinchen on 16/12/22.
 */
interface SystemFacadeInterface {
    fun getActiveNetworkType(): Int;

    fun currentTimeMills(): Long;

    fun sendBroadcast(intent: Intent);

    fun startThread(thread: Thread);
}