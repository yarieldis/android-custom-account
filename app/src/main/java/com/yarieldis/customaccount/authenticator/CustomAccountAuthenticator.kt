package com.yarieldis.customaccount.authenticator

import android.accounts.AbstractAccountAuthenticator
import android.accounts.Account
import android.accounts.AccountAuthenticatorResponse
import android.content.Context
import android.os.Bundle


class CustomAccountAuthenticator(context: Context?) : AbstractAccountAuthenticator(context) {
    override fun confirmCredentials(p0: AccountAuthenticatorResponse?, p1: Account?, p2: Bundle?): Bundle {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun updateCredentials(p0: AccountAuthenticatorResponse?, p1: Account?, p2: String?, p3: Bundle?): Bundle {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getAuthToken(p0: AccountAuthenticatorResponse?, p1: Account?, p2: String?, p3: Bundle?): Bundle {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun hasFeatures(p0: AccountAuthenticatorResponse?, p1: Account?, p2: Array<out String>?): Bundle {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun editProperties(p0: AccountAuthenticatorResponse?, p1: String?): Bundle {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun addAccount(p0: AccountAuthenticatorResponse?, p1: String?, p2: String?, p3: Array<out String>?, p4: Bundle?): Bundle {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getAuthTokenLabel(p0: String?): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}