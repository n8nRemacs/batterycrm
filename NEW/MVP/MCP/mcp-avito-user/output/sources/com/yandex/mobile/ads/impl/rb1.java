package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes8.dex */
public final class rb1 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final o40 f389462a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final h60 f389463b = h60.a();

    public rb1(@j.N o40 o40Var) {
        this.f389462a = o40Var;
    }

    @j.N
    public final qb1 a(@j.N Context context, @j.N p60 p60Var, @j.N ff1 ff1Var, @j.N k60 k60Var, @j.N ri1 ri1Var, @j.N hs0 hs0Var, @j.N re1 re1Var) {
        return !this.f389463b.c() ? new ti(context, p60Var, k60Var, re1Var, ff1Var, ri1Var) : new am(context, this.f389462a, k60Var, p60Var, ff1Var, ri1Var, hs0Var, re1Var);
    }
}
