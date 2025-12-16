package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.C39375w1;

/* loaded from: classes8.dex */
public final class c3 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final z2 f384164a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final h50 f384165b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    private final g3 f384166c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    private final e3 f384167d;

    public c3(@Y61.k z2 z2Var, @Y61.k h50 h50Var, @Y61.k g3 g3Var, @Y61.k e3 e3Var) {
        this.f384164a = z2Var;
        this.f384165b = h50Var;
        this.f384166c = g3Var;
        this.f384167d = e3Var;
    }

    public final void a() {
        l60 l60VarC = this.f384164a.c();
        if (l60VarC != null) {
            l60VarC.a();
        }
        h3 h3VarF = this.f384164a.f();
        if (h3VarF == null) {
            this.f384165b.a();
            ((C39375w1.a) this.f384166c).a();
            return;
        }
        this.f384165b.a(h3VarF.c());
        int iOrdinal = h3VarF.b().a().ordinal();
        if (iOrdinal == 0) {
            this.f384167d.b();
            this.f384165b.a();
            C39375w1.a aVar = (C39375w1.a) this.f384166c;
            C39375w1.this.f391248b.a(C39375w1.this.f391247a, EnumC39384z1.f392140b);
            this.f384167d.e();
            return;
        }
        if (iOrdinal == 1) {
            this.f384167d.b();
            this.f384165b.a();
            C39375w1.a aVar2 = (C39375w1.a) this.f384166c;
            C39375w1.this.f391248b.a(C39375w1.this.f391247a, EnumC39384z1.f392140b);
            return;
        }
        if (iOrdinal == 2) {
            C39375w1.a aVar3 = (C39375w1.a) this.f384166c;
            if (C39375w1.this.f391248b.a(C39375w1.this.f391247a).equals(EnumC39384z1.f392141c)) {
                C39375w1.this.f391248b.a(C39375w1.this.f391247a, EnumC39384z1.f392146h);
            }
            this.f384167d.d();
            return;
        }
        if (iOrdinal != 4 && iOrdinal != 5) {
            if (iOrdinal == 6) {
                C39375w1.a aVar4 = (C39375w1.a) this.f384166c;
                if (C39375w1.this.f391248b.a(C39375w1.this.f391247a).equals(EnumC39384z1.f392145g)) {
                    C39375w1.this.f391248b.a(C39375w1.this.f391247a, EnumC39384z1.f392146h);
                }
                this.f384167d.f();
                return;
            }
            if (iOrdinal != 8 && iOrdinal != 9) {
                return;
            }
        }
        a();
    }
}
