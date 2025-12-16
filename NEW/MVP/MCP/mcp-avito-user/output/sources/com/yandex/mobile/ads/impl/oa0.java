package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes8.dex */
public final class oa0 {

    /* renamed from: b, reason: collision with root package name */
    private final Context f388473b;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final z81 f388472a = new z81();

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    private final AtomicBoolean f388474c = new AtomicBoolean();

    public oa0(@Y61.k Context context) {
        this.f388473b = context.getApplicationContext();
    }

    public final void a() {
        if (h7.a(this.f388473b)) {
            this.f388472a.getClass();
            if (z81.a() || this.f388474c.getAndSet(true)) {
                return;
            }
            h70.c("SDK API usage from a background thread detected. Please, use SDK API only from the main thread.", new Object[0]);
        }
    }
}
