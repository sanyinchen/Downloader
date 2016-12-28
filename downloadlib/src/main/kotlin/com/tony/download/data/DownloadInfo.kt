/*
 * Copyright (C) 2016 Baidu, Inc. All Rights Reserved.
 */
package com.tony.download.data

import android.content.Context
import android.database.Cursor
import com.tony.download.data.DataBaseManager
import com.tony.download.facade.SystemFacadeInterface
import java.util.*

/**
 * Created by sanyinchen on 16/12/28.
 */
class DownloadInfo(context: Context, systemfacade: SystemFacadeInterface) {


    inner class Reader {

        private var mDataManager: DataBaseManager;

        private var mCursor: Cursor;

        constructor(dataManager: DataBaseManager, cursor: Cursor) {
            mDataManager = dataManager;
            mCursor = cursor;
        }

        fun createDownloadInfo(context: Context, systemfacade: SystemFacadeInterface): DownloadInfo {
            var info = DownloadInfo(context, systemfacade);


            return info;
        }

    }


    companion object {
        var NETWORK_WORK: Int = 1;
        var NETWORK_NO_CONNECTION: Int = 2;
        var EXTRA_IS_WIFI_REQUIREL: String = "isWifiRequired";

    }

    var mId: Long? = null;

    var mUri: String? = null;

    var mFileName: String? = null;

    var mDestination: Int? = null;

    var mStatus: Int? = null;

    var mNumFail: Int? = null;

    var mRetryAfter: Int? = null;

    var mCookies: String? = null;

    var mReferer: String? = null;

    var mTotalBytes: Long? = null;

    var mCurrentBytes: Long? = null;

    var mEtag: String? = null;

    var mDelete: Boolean = false;

    var mAllowedNetWorkType: Int? = null;

    var mTitle: String? = null;

    var mDescription: String? = null;

    var mFuzz: Int? = null;

    var mHasActiveThread: Boolean = false;

    private val mRequestHeaders: List<Pair<String, String>> by lazy {
        ArrayList<Pair<String, String>>();
    }

    private var mSystemFacade: SystemFacadeInterface? = null;

    private var mContext: Context? = null;

//    constructor() {
//
//    }
}