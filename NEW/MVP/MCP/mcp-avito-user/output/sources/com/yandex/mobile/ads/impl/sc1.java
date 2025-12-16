package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes8.dex */
public final class sc1 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Context f389873a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final wc1 f389874b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final q21 f389875c = q21.b();

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final le1 f389876d = new le1();

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final rc1 f389877e = new rc1();

    public sc1(@j.N Context context) {
        this.f389873a = context.getApplicationContext();
        this.f389874b = new wc1(context);
    }

    public final void a() {
        le1 le1Var = this.f389876d;
        Context context = this.f389873a;
        le1Var.getClass();
        if (h7.a(context) && this.f389875c.h() && this.f389877e.a(this.f389873a)) {
            this.f389874b.a();
        }
    }
}
