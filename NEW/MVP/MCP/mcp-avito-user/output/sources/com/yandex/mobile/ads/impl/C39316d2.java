package com.yandex.mobile.ads.impl;

import android.content.Context;

/* renamed from: com.yandex.mobile.ads.impl.d2, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C39316d2 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final C39366t1 f384506a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final pi1 f384507b;

    public C39316d2(@Y61.k Context context, @Y61.k C39366t1 c39366t1) {
        this.f384506a = c39366t1;
        this.f384507b = new pi1(context);
    }

    public final void a() {
        this.f384507b.a(this.f384506a, "breakEnd");
    }

    public final void b() {
        this.f384507b.a(this.f384506a, "error");
    }

    public final void c() {
        this.f384507b.a(this.f384506a, "breakStart");
    }
}
