package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes8.dex */
public final class w50 implements br0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final b60 f391287a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final Context f391288b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final hc1 f391289c = new hc1();

    public w50(@j.N Context context, @j.N b60 b60Var) {
        this.f391288b = context;
        this.f391287a = b60Var;
    }

    @Override // com.yandex.mobile.ads.impl.br0
    public final void a(@j.N String str) {
        if (this.f391289c.a(this.f391288b, str)) {
            this.f391287a.a();
        }
    }
}
