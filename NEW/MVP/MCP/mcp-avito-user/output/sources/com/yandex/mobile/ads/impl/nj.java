package com.yandex.mobile.ads.impl;

import android.view.View;

/* loaded from: classes8.dex */
final class nj implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final gx f388315a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final px f388316b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final pn f388317c;

    public nj(@j.N gx gxVar, @j.N px pxVar, @j.N pn pnVar) {
        this.f388315a = gxVar;
        this.f388316b = pxVar;
        this.f388317c = pnVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@j.P View view) {
        this.f388316b.a();
        this.f388315a.c();
        this.f388317c.a(on.f388588b);
    }
}
