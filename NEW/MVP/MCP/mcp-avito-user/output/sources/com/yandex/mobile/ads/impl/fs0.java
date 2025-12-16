package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes8.dex */
public final class fs0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Context f385492a;

    public fs0(@j.N Context context) {
        this.f385492a = context.getApplicationContext();
    }

    public final boolean a() {
        return a("android.permission.ACCESS_COARSE_LOCATION");
    }

    public final boolean b() {
        return a("android.permission.ACCESS_FINE_LOCATION");
    }

    private boolean a(@j.N String str) {
        try {
            return this.f385492a.checkCallingOrSelfPermission(str) == 0;
        } catch (Throwable unused) {
            return false;
        }
    }
}
