package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes8.dex */
final class mx0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Context f388113a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final cq f388114b = new cq();

    public mx0(@j.N Context context) {
        this.f388113a = context.getApplicationContext();
    }

    @j.N
    public final tc0 a() {
        return n6.a(3, this.f388114b.a(this.f388113a)) ? new tc0(1920, 1080, 6800) : new tc0(854, 480, 1000);
    }
}
