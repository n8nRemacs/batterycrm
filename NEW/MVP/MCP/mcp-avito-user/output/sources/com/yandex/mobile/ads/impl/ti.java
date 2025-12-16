package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes8.dex */
public final class ti implements qb1 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final i50 f390205a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final p4 f390206b;

    public ti(@j.N Context context, @j.N p60 p60Var, @j.N k60 k60Var, @j.N re1 re1Var, @j.N ff1 ff1Var, @j.N ri1 ri1Var) {
        this.f390205a = new i50(context, p60Var, ff1Var, ri1Var, re1Var, new w60(new jm()).a(ff1Var.a(), null));
        this.f390206b = new p4(k60Var);
    }

    @Override // com.yandex.mobile.ads.impl.qb1
    public final void a(@j.N lu luVar, @j.N t50 t50Var) {
        luVar.setOnClickListener(this.f390205a);
        this.f390206b.a(t50Var.a(), t50Var.d());
    }

    @Override // com.yandex.mobile.ads.impl.qb1
    public final void a(@j.N lu luVar) {
        luVar.setOnClickListener(null);
        luVar.setClickable(false);
    }
}
