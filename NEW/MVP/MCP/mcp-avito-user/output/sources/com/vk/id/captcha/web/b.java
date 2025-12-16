package com.vk.id.captcha.web;

import Y61.k;
import android.content.Context;

/* compiled from: NetworkConnectionObserver.kt */
/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @k
    private final Context f366854a;

    public b(@k Context context) {
        this.f366854a = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a() {
        /*
            r4 = this;
            android.content.Context r0 = r4.f366854a
            java.lang.String r1 = "connectivity"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0
            r1 = 0
            if (r0 != 0) goto Le
            return r1
        Le:
            android.net.Network r2 = r0.getActiveNetwork()
            if (r2 == 0) goto L4c
            android.net.NetworkCapabilities r0 = r0.getNetworkCapabilities(r2)
            if (r0 == 0) goto L44
            r2 = 12
            boolean r2 = r0.hasCapability(r2)
            if (r2 == 0) goto L3e
            r2 = 1
            boolean r3 = r0.hasTransport(r2)
            if (r3 != 0) goto L3f
            r3 = 4
            boolean r3 = r0.hasTransport(r3)
            if (r3 != 0) goto L3f
            boolean r3 = r0.hasTransport(r1)
            if (r3 != 0) goto L3f
            r3 = 3
            boolean r0 = r0.hasTransport(r3)
            if (r0 == 0) goto L3e
            goto L3f
        L3e:
            r2 = r1
        L3f:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            goto L45
        L44:
            r0 = 0
        L45:
            if (r0 == 0) goto L4c
            boolean r0 = r0.booleanValue()
            return r0
        L4c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vk.id.captcha.web.b.a():boolean");
    }
}
