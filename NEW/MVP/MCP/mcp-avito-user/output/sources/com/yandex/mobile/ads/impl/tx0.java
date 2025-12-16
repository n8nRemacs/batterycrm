package com.yandex.mobile.ads.impl;

import android.os.SystemClock;

/* loaded from: classes8.dex */
public final class tx0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    private Long f390333a;

    public final long a() {
        Long l12 = this.f390333a;
        if (l12 == null) {
            return 0L;
        }
        return SystemClock.elapsedRealtime() - l12.longValue();
    }

    public final void b() {
        this.f390333a = Long.valueOf(SystemClock.elapsedRealtime());
    }
}
