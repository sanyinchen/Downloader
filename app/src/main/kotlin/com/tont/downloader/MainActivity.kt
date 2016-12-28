/*
 * Copyright (C) 2016 Baidu, Inc. All Rights Reserved.
 */
package com.tony.downloader


import android.content.Intent
import android.os.Bundle
import android.support.v7.app.ActionBarActivity
import com.tony.download.data.Downloads
import com.tony.download.data.Downloads.RequestHeaders
import com.tony.download.data.DownloadInfo
import com.tony.download.work.DownloadService

class MainActivity : ActionBarActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        var intent = Intent();
        intent.setClass(this, DownloadService::class.java);
        startService(intent);
    }
}
