package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes8.dex */
public final class ws0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final a50 f391483a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final vs0 f391484b;

    /* renamed from: c, reason: collision with root package name */
    @j.P
    private f41 f391485c;

    /* renamed from: d, reason: collision with root package name */
    @j.P
    private pg0 f391486d;

    /* renamed from: e, reason: collision with root package name */
    @j.P
    private f41 f391487e;

    public ws0(@j.N Context context, @j.N o60 o60Var, @j.N v40 v40Var, @j.N l50 l50Var, @j.N com.yandex.mobile.ads.instream.e eVar, @j.N com.yandex.mobile.ads.instream.d dVar) {
        a50 a50Var = new a50(o60Var, eVar);
        this.f391483a = a50Var;
        this.f391484b = new vs0(context, v40Var, eVar, dVar, l50Var, a50Var);
    }

    @j.N
    public final g6 a() {
        if (this.f391486d == null) {
            this.f391486d = this.f391484b.a(this.f391483a.a());
        }
        return this.f391486d;
    }

    @j.P
    public final g6 b() {
        p60 p60VarB;
        if (this.f391487e == null && (p60VarB = this.f391483a.a().b()) != null) {
            this.f391487e = this.f391484b.a(p60VarB);
        }
        return this.f391487e;
    }

    @j.P
    public final g6 c() {
        p60 p60VarC;
        if (this.f391485c == null && (p60VarC = this.f391483a.a().c()) != null) {
            this.f391485c = this.f391484b.a(p60VarC);
        }
        return this.f391485c;
    }
}
