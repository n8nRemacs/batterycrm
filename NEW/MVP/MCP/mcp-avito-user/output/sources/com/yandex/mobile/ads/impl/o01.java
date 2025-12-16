package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes8.dex */
public final class o01 implements pl {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Context f388409a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final pl f388410b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final zj f388411c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f388412d;

    public o01(@j.N Context context, @j.N tq tqVar, @j.N pl plVar) {
        this.f388409a = context;
        this.f388410b = plVar;
        this.f388411c = tqVar;
    }

    public final void a() {
        this.f388412d = true;
        this.f388411c.a();
    }

    @Override // com.yandex.mobile.ads.impl.pl
    public final void e() {
        if (this.f388412d) {
            this.f388410b.e();
        } else {
            this.f388411c.a(this.f388409a);
        }
    }
}
