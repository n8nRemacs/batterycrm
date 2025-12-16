package com.bumptech.glide.manager;

import android.content.Context;
import android.util.Log;
import com.bumptech.glide.manager.c;
import j.N;

/* compiled from: DefaultConnectivityMonitorFactory.java */
/* loaded from: classes5.dex */
public class f implements d {
    @N
    public final c a(@N Context context, @N c.a aVar) {
        boolean z12 = androidx.core.content.d.checkSelfPermission(context, "android.permission.ACCESS_NETWORK_STATE") == 0;
        Log.isLoggable("ConnectivityMonitor", 3);
        return z12 ? new e(context, aVar) : new j();
    }
}
