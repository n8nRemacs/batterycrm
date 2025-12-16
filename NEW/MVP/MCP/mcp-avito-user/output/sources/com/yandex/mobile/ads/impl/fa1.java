package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.df;

/* loaded from: classes8.dex */
public abstract class fa1<R, T> extends df<T> {

    /* renamed from: r, reason: collision with root package name */
    @j.N
    private final R f385241r;

    /* renamed from: s, reason: collision with root package name */
    @j.N
    private final dz0<R, T> f385242s;

    /* renamed from: t, reason: collision with root package name */
    @j.N
    private final ny0 f385243t;

    public fa1(@j.N Context context, int i12, @j.N String str, @j.N df.a<T> aVar, @j.N R r12, @j.N dz0<R, T> dz0Var) {
        super(i12, str, aVar);
        this.f385241r = r12;
        this.f385242s = dz0Var;
        this.f385243t = m9.a(context);
        a(context);
        t();
    }

    private void t() {
        this.f385243t.a(this.f385242s.a(this.f385241r));
    }

    @Override // com.yandex.mobile.ads.impl.qy0
    public final kz0<T> a(@j.N zo0 zo0Var) {
        int i12 = zo0Var.f392315a;
        kz0<T> kz0VarA = a(zo0Var, i12);
        ky0 ky0VarA = this.f385242s.a(kz0VarA, i12, this.f385241r);
        new ly0(ky0VarA.a()).a(zo0Var.f392317c.get(i10.b(21)), "server_log_id");
        this.f385243t.a(ky0VarA);
        return kz0VarA;
    }

    public abstract kz0<T> a(@j.N zo0 zo0Var, int i12);

    @Override // com.yandex.mobile.ads.impl.qy0
    public ok1 b(ok1 ok1Var) {
        zo0 zo0Var = ok1Var.f388568a;
        this.f385243t.a(this.f385242s.a(null, zo0Var != null ? zo0Var.f392315a : -1, this.f385241r));
        return ok1Var;
    }

    private void a(@j.N Context context) {
        a(new q5().a(context));
    }
}
