package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes8.dex */
public final class y9 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final q21 f391963a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final y11 f391964b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    private final C39352o1 f391965c;

    /* renamed from: d, reason: collision with root package name */
    private final Context f391966d;

    public y9(@Y61.k Context context, @Y61.k q21 q21Var, @Y61.k y11 y11Var) {
        this.f391963a = q21Var;
        this.f391964b = y11Var;
        this.f391965c = new C39352o1(context);
        this.f391966d = context.getApplicationContext();
    }

    public final boolean a() {
        v11 v11VarA;
        return this.f391965c.a().b() && ((v11VarA = this.f391963a.a(this.f391966d)) == null || !v11VarA.w() || this.f391964b.a(v11VarA));
    }

    public /* synthetic */ y9(Context context) {
        this(context, q21.b(), new y11());
    }
}
