package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes8.dex */
public final class kf1 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Context f387123a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final Object f387124b = new Object();

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final mf1 f387125c;

    public kf1(@j.N Context context, @j.N a4 a4Var) {
        this.f387123a = context.getApplicationContext();
        this.f387125c = new mf1(context, a4Var);
    }

    public final void a(@j.N md1 md1Var, @j.N jd1 jd1Var) {
        this.f387125c.a(md1Var, this.f387124b, new pd1(this.f387123a, jd1Var));
    }

    public final void a(@j.N jk1 jk1Var, @j.N c50 c50Var) {
        this.f387125c.a(jk1Var, this.f387124b, c50Var);
    }
}
