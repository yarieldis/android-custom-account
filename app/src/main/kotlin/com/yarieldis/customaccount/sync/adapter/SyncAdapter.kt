package com.yarieldis.customaccount.sync.adapter

import android.accounts.Account
import android.content.AbstractThreadedSyncAdapter
import android.content.ContentProviderClient
import android.content.Context
import android.content.SyncResult
import android.os.Bundle

class SyncAdapter(context: Context?, autoInitialize: Boolean) : AbstractThreadedSyncAdapter(context, autoInitialize) {
    override fun onPerformSync(p0: Account?, p1: Bundle?, p2: String?, p3: ContentProviderClient?, p4: SyncResult?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
