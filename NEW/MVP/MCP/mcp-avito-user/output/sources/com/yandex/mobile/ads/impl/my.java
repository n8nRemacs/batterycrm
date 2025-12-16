package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.location.Location;

/* loaded from: classes8.dex */
final class my implements ea0 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f388115a = new Object();

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final ja0 f388116b;

    public my(@j.N Context context, @j.N String str) {
        this.f388116b = new ja0(context, str);
    }

    @Override // com.yandex.mobile.ads.impl.ea0
    @j.P
    public final Location a() {
        Location locationA;
        synchronized (this.f388115a) {
            try {
                ia0 ia0VarA = this.f388116b.a();
                if (ia0VarA == null || !ia0VarA.b()) {
                    locationA = null;
                } else {
                    locationA = ia0VarA.a();
                    this.f388116b.b();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return locationA;
    }
}
