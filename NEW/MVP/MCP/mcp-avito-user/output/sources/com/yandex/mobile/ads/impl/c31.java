package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.fb1;
import com.yandex.mobile.ads.impl.vw;
import java.util.List;

/* loaded from: classes8.dex */
public final class c31 {

    /* renamed from: a, reason: collision with root package name */
    private final List<vw> f384168a;

    /* renamed from: b, reason: collision with root package name */
    private final x91[] f384169b;

    public c31(List<vw> list) {
        this.f384168a = list;
        this.f384169b = new x91[list.size()];
    }

    public final void a(tu tuVar, fb1.d dVar) {
        for (int i12 = 0; i12 < this.f384169b.length; i12++) {
            dVar.a();
            x91 x91VarA = tuVar.a(dVar.c(), 3);
            vw vwVar = this.f384168a.get(i12);
            String str = vwVar.f391181l;
            db.a("Invalid closed caption mime type provided: " + str, "application/cea-608".equals(str) || "application/cea-708".equals(str));
            String strB = vwVar.f391170a;
            if (strB == null) {
                strB = dVar.b();
            }
            x91VarA.a(new vw.a().c(strB).f(str).o(vwVar.f391173d).e(vwVar.f391172c).a(vwVar.f391167D).a(vwVar.f391183n).a());
            this.f384169b[i12] = x91VarA;
        }
    }

    public final void a(long j12, pr0 pr0Var) {
        ii.a(j12, pr0Var, this.f384169b);
    }
}
