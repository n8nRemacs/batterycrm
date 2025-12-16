package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import com.yandex.mobile.ads.impl.gn1;

/* loaded from: classes8.dex */
public final class na0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final Handler f388196a = new Handler(Looper.getMainLooper());

    public final void a(@Y61.k Runnable runnable) {
        this.f388196a.post(runnable);
    }

    public final void a(@Y61.k gn1.a aVar) {
        this.f388196a.postDelayed(aVar, 50L);
    }

    public final void a() {
        this.f388196a.removeCallbacksAndMessages(null);
    }
}
