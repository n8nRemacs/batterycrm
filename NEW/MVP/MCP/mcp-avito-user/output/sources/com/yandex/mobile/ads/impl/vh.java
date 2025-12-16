package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.widget.TextView;

/* loaded from: classes8.dex */
public final class vh {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Handler f390875a = new Handler(Looper.getMainLooper());

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final rk f390876b;

    public vh(@j.N Context context) {
        this.f390876b = xh.a(context);
    }

    public final void a(@j.N TextView textView) {
        this.f390875a.postDelayed(new x61(textView, this.f390876b), 2000L);
    }

    public final void a() {
        this.f390875a.removeCallbacksAndMessages(null);
        this.f390876b.cancel();
    }
}
