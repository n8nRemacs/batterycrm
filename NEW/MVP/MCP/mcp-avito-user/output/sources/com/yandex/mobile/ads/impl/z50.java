package com.yandex.mobile.ads.impl;

import java.util.HashSet;
import java.util.List;

/* loaded from: classes8.dex */
public final class z50 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final q20 f392184a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final a4 f392185b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    private final xb f392186c = new xb();

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    private final g30 f392187d = new g30();

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    private final jm f392188e = new jm();

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    private final i30 f392189f = new i30();

    public interface a {
    }

    public z50(@Y61.k q20 q20Var, @Y61.k a4 a4Var) {
        this.f392184a = q20Var;
        this.f392185b = a4Var;
    }

    public final void a(@Y61.k ff1 ff1Var, @Y61.k w20 w20Var, @Y61.k m60 m60Var) {
        jm jmVar = this.f392188e;
        im imVarA = ff1Var.a();
        jmVar.getClass();
        List listA = jm.a(imVarA);
        HashSet hashSetA = this.f392189f.a(listA, (h90) null);
        this.f392185b.b(z3.f392168h);
        this.f392184a.a(hashSetA, new a60(this, listA, w20Var, m60Var, ff1Var));
    }
}
