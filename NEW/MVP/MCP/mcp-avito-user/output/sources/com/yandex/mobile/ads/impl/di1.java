package com.yandex.mobile.ads.impl;

/* loaded from: classes8.dex */
public final class di1 implements jv0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final u6 f384612a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final hh1 f384613b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final ot0 f384614c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final hu0 f384615d;

    public di1(@j.N u6 u6Var, @j.N nt0 nt0Var, @j.N hu0 hu0Var) {
        this.f384612a = u6Var;
        this.f384614c = nt0Var.d();
        this.f384613b = nt0Var.a();
        this.f384615d = hu0Var;
    }

    @Override // com.yandex.mobile.ads.impl.jv0
    @j.N
    public final dt0 a() {
        yu yuVarA = this.f384615d.a();
        lt0 lt0VarB = this.f384615d.b();
        Long lValueOf = yuVarA != null ? Long.valueOf(yuVarA.a()) : (lt0VarB == null || this.f384612a.c() || this.f384614c.c()) ? null : Long.valueOf(lt0VarB.a());
        long jLongValue = lValueOf != null ? lValueOf.longValue() : -1L;
        long jA2 = this.f384613b.a();
        return new dt0(jLongValue, jA2 != -9223372036854775807L ? jA2 : -1L);
    }
}
