package com.yarieldis.customaccount.service

import android.app.Service
import android.content.Intent
import android.os.IBinder
import com.yarieldis.customaccount.sync.adapter.SyncAdapter

class CustomSyncService : Service() {
    private lateinit var syncAdapter: SyncAdapter

    override fun onBind(intent: Intent?): IBinder = syncAdapter.syncAdapterBinder

    override fun onCreate() {
        super.onCreate()
        syncAdapter = SyncAdapter(applicationContext, false)
    }
}
