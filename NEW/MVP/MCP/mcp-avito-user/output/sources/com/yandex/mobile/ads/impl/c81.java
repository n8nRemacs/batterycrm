package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* loaded from: classes8.dex */
public final class c81 implements hj {
    @Override // com.yandex.mobile.ads.impl.hj
    public final long a() {
        return SystemClock.uptimeMillis();
    }

    @Override // com.yandex.mobile.ads.impl.hj
    public final long c() {
        return SystemClock.elapsedRealtime();
    }

    @Override // com.yandex.mobile.ads.impl.hj
    public final bz a(Looper looper, @j.P Handler.Callback callback) {
        return new e81(new Handler(looper, callback));
    }

    @Override // com.yandex.mobile.ads.impl.hj
    public final void b() {
    }
}
