package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes8.dex */
public final class sa0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Context f389844a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final C39304a2 f389845b;

    public sa0(@j.N Context context, @j.N o60 o60Var) {
        this.f389844a = context.getApplicationContext();
        this.f389845b = new C39304a2(o60Var.getAdBreaks());
    }

    @j.N
    public final ra0 a(@j.N p60 p60Var) {
        return new ra0(this.f389844a, p60Var, this.f389845b);
    }
}
