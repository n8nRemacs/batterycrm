package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes8.dex */
public final class p10 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final xg0 f388691a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final f11 f388692b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final Context f388693c;

    public p10(@j.N Context context, @j.N g11 g11Var) {
        this.f388692b = g11Var;
        this.f388693c = context.getApplicationContext();
        this.f388691a = q10.a(context);
    }

    @j.N
    public final r10 a() {
        return new r10(this.f388693c, this.f388691a.a(this.f388692b.a(this.f388693c)));
    }
}
