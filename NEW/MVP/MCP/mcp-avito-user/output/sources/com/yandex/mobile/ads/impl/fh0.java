package com.yandex.mobile.ads.impl;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes8.dex */
public final class fh0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private static final AtomicBoolean f385325a = new AtomicBoolean(false);

    @X41.n
    public static final void a() {
        if (f385325a.compareAndSet(false, true)) {
            h70.b("Yandex Mobile Ads 6.0.1 initialized successfully", new Object[0]);
        }
    }
}
