package com.google.android.gms.internal.base;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import androidx.core.content.d;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import j.P;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes6.dex */
public final class zao extends d {
    @ResultIgnorabilityUnspecified
    @P
    @Deprecated
    public static Intent zaa(Context context, @P BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 33) {
            return context.registerReceiver(broadcastReceiver, intentFilter, i12 >= 33 ? 2 : 0);
        }
        return context.registerReceiver(broadcastReceiver, intentFilter);
    }
}
