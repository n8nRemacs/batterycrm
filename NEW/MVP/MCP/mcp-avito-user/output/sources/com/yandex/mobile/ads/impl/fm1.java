package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.List;

/* loaded from: classes8.dex */
public final class fm1 implements yy0<List<ne1>> {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final gm1 f385420a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final yy0<List<ne1>> f385421b;

    public fm1(@j.N Context context, @j.N ne1 ne1Var, @j.N yy0<List<ne1>> yy0Var) {
        this.f385421b = yy0Var;
        this.f385420a = new gm1(context, ne1Var);
    }

    @Override // com.yandex.mobile.ads.impl.yy0
    public final void a(@j.N List<ne1> list) {
        this.f385421b.a((yy0<List<ne1>>) this.f385420a.a(list));
    }

    @Override // com.yandex.mobile.ads.impl.yy0
    public final void a(@j.N ye1 ye1Var) {
        this.f385421b.a(ye1Var);
    }
}
