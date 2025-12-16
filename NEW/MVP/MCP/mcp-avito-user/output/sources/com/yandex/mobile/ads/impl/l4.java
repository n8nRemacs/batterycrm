package com.yandex.mobile.ads.impl;

/* loaded from: classes8.dex */
public final class l4 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final u6 f387371a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final h4 f387372b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final ot0 f387373c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final qt0 f387374d;

    public interface a {
        void a();
    }

    public l4(@j.N t6 t6Var, @j.N nt0 nt0Var) {
        this.f387371a = t6Var.b();
        this.f387372b = t6Var.c();
        this.f387373c = nt0Var.d();
        this.f387374d = nt0Var.e();
    }

    public final void a(@j.N q3 q3Var, @j.N int i12, @j.N a aVar) {
        int iA2 = q3Var.a();
        int iB2 = q3Var.b();
        com.google.android.exoplayer2.source.ads.a aVarA = this.f387372b.a();
        if (aVarA.d(iA2, iB2)) {
            return;
        }
        if (n6.a(2, i12)) {
            int i13 = aVarA.a(iA2).f346190c;
            while (iB2 < i13) {
                aVarA = aVarA.g(iA2, iB2).f(0L);
                iB2++;
            }
        } else {
            aVarA = aVarA.g(iA2, iB2).f(0L);
        }
        this.f387372b.a(aVarA);
        this.f387374d.b();
        aVar.a();
        if (this.f387373c.c()) {
            return;
        }
        this.f387371a.a((st0) null);
    }
}
