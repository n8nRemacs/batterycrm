package com.yandex.mobile.ads.impl;

import android.content.Context;
import j.InterfaceC42148d;

/* loaded from: classes8.dex */
public final class vm0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final qm0 f390946a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final fn0 f390947b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    private final dr f390948c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    private final er f390949d;

    @InterfaceC42148d
    public interface a {
    }

    @j.k0
    public vm0(@Y61.k qm0 qm0Var, @Y61.k fn0 fn0Var, @Y61.k dr drVar, @Y61.k er erVar) {
        this.f390946a = qm0Var;
        this.f390947b = fn0Var;
        this.f390948c = drVar;
        this.f390949d = erVar;
    }

    public final void a() {
        this.f390946a.a();
        this.f390947b.a();
    }

    public final void a(@Y61.k Context context, @Y61.k n2 n2Var, @Y61.k uj0 uj0Var, @Y61.k a aVar, @Y61.k qn qnVar) {
        um0 um0Var;
        this.f390949d.getClass();
        if (er.a(context) && kotlin.jvm.internal.L.f(uj0Var.b().v(), "divkit")) {
            this.f390948c.getClass();
            dr.a(context);
        }
        if (n2Var.q()) {
            hs0 hs0Var = new hs0();
            um0Var = new um0(aVar, hs0Var, 2);
            this.f390946a.a(context, uj0Var, hs0Var, um0Var, qnVar);
        } else {
            um0Var = new um0(aVar, new ih(context), 1);
        }
        this.f390947b.a(uj0Var, um0Var);
    }

    public vm0(@Y61.k Context context, @Y61.k a4 a4Var) {
        this(new qm0(context, a4Var), new fn0(context), new dr(), new er());
    }
}
