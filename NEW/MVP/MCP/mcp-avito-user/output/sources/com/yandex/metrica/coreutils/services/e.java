package com.yandex.metrica.coreutils.services;

import android.os.SystemClock;

/* compiled from: SystemTimeProvider.java */
/* loaded from: classes7.dex */
public class e implements f {
    @Override // com.yandex.metrica.coreutils.services.f
    public final long a() {
        return SystemClock.elapsedRealtime();
    }

    @Override // com.yandex.metrica.coreutils.services.f
    public final long b() {
        return System.currentTimeMillis();
    }

    @Override // com.yandex.metrica.coreutils.services.f
    public final long c() {
        return System.currentTimeMillis() / 1000;
    }
}
