package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.fb1;
import com.yandex.mobile.ads.impl.vw;
import java.util.List;

/* loaded from: classes8.dex */
final class oc1 {

    /* renamed from: a, reason: collision with root package name */
    private final List<vw> f388492a;

    /* renamed from: b, reason: collision with root package name */
    private final x91[] f388493b;

    public oc1(List<vw> list) {
        this.f388492a = list;
        this.f388493b = new x91[list.size()];
    }

    public final void a(tu tuVar, fb1.d dVar) {
        for (int i12 = 0; i12 < this.f388493b.length; i12++) {
            dVar.a();
            x91 x91VarA = tuVar.a(dVar.c(), 3);
            vw vwVar = this.f388492a.get(i12);
            String str = vwVar.f391181l;
            db.a("Invalid closed caption mime type provided: " + str, "application/cea-608".equals(str) || "application/cea-708".equals(str));
            x91VarA.a(new vw.a().c(dVar.b()).f(str).o(vwVar.f391173d).e(vwVar.f391172c).a(vwVar.f391167D).a(vwVar.f391183n).a());
            this.f388493b[i12] = x91VarA;
        }
    }

    public final void a(long j12, pr0 pr0Var) {
        if (pr0Var.a() < 9) {
            return;
        }
        int iH2 = pr0Var.h();
        int iH3 = pr0Var.h();
        int iT2 = pr0Var.t();
        if (iH2 == 434 && iH3 == 1195456820 && iT2 == 3) {
            ii.b(j12, pr0Var, this.f388493b);
        }
    }
}
