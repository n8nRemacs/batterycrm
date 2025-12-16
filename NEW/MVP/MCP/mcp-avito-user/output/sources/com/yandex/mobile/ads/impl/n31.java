package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.UserManager;
import com.avito.android.remote.model.messenger.context.ChannelContext;

/* loaded from: classes8.dex */
public final class n31 {
    public static SharedPreferences a(n31 n31Var, Context context, String str) {
        boolean zIsUserUnlocked;
        n31Var.getClass();
        try {
            zIsUserUnlocked = ((UserManager) context.getSystemService(ChannelContext.UserToUser.TYPE)).isUserUnlocked();
        } catch (Throwable unused) {
            zIsUserUnlocked = true;
        }
        return !zIsUserUnlocked ? context.createDeviceProtectedStorageContext().getSharedPreferences(str, 0) : context.getSharedPreferences(str, 0);
    }
}
