package com.yandex.mobile.ads.impl;

import android.app.Application;
import android.os.Build;

/* loaded from: classes8.dex */
public final class vu0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final C39330h0 f391013a = new C39330h0();

    @Y61.l
    public final String a() {
        if (Build.VERSION.SDK_INT >= 28) {
            return Application.getProcessName();
        }
        this.f391013a.getClass();
        return C39330h0.b();
    }
}
